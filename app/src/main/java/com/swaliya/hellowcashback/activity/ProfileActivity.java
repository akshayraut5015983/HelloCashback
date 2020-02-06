package com.swaliya.hellowcashback.activity;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import android.preference.PreferenceManager;
import android.util.Base64;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.swaliya.hellowcashback.R;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

import de.hdodenhof.circleimageview.CircleImageView;


public class ProfileActivity extends AppCompatActivity {
    CircleImageView circleImageView;
    final int GALLERY_REQUEST_CODE = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        circleImageView = findViewById(R.id.imgProf);
        ((TextView) toolbar.findViewById(R.id.toolbar_tv)).setText("Profile ");
        SharedPreferences prefs = getSharedPreferences("DeviceToken", MODE_PRIVATE);
        String deviceToken = prefs.getString("img", null);
        if (deviceToken != null) {
            circleImageView.setImageURI(Uri.parse(deviceToken));
        }
        circleImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_PICK);

                intent.setType("image/*");
                String[] mimeTypes = {"image/jpeg", "image/png"};
                intent.putExtra(Intent.EXTRA_MIME_TYPES, mimeTypes);
                // Launching the Intent
                startActivityForResult(intent, GALLERY_REQUEST_CODE);
            }
        });
        ((LinearLayout)findViewById(R.id.about)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new DownloadFileFromURL().execute("https://www.gstatic.com/webp/gallery/1.jpg");
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == Activity.RESULT_OK)
            switch (requestCode) {
                case GALLERY_REQUEST_CODE:

                    try {
                        Uri selectedImage = data.getData();
                        circleImageView.setImageURI(selectedImage);
                        final InputStream imageStream = getContentResolver().openInputStream(selectedImage);
                        final Bitmap seleImage = BitmapFactory.decodeStream(imageStream);
                        String encodedImage = encodeImage(seleImage);
                     //   Toast.makeText(this, "inActiivty " + encodedImage, Toast.LENGTH_SHORT).show();

                        SharedPreferences.Editor editor = getSharedPreferences("Akshay", MODE_PRIVATE).edit();
                        editor.putString("img", String.valueOf(selectedImage));
                        editor.apply();
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                    break;
            }
    }

    private String encodeImage(Bitmap bm) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        bm.compress(Bitmap.CompressFormat.JPEG, 100, baos);
        byte[] b = baos.toByteArray();
        String encImage = Base64.encodeToString(b, Base64.DEFAULT);
        return encImage;
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    class DownloadFileFromURL extends AsyncTask<String, String, String> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            System.out.println("Starting download");
        }

        /**
         * Downloading file in background thread
         * */
        @Override
        protected String doInBackground(String... f_url) {
            int count;
            URL url=null;
            try {
                String root = Environment.getExternalStorageDirectory().toString();

                System.out.println("Downloading");
                  url = new URL(f_url[0]);
                System.out.println(f_url);
                System.out.println(url);
                URLConnection conection = url.openConnection();
                conection.connect();
                // getting file length
                int lenghtOfFile = conection.getContentLength();

                // input stream to read file - with 8k buffer
                InputStream input = new BufferedInputStream(url.openStream(), 8192);

                // Output stream to write file

                OutputStream output = new FileOutputStream(root+"/downloadedfile.jpg");
                byte data[] = new byte[1024];

                long total = 0;
                while ((count = input.read(data)) != -1) {
                    total += count;

                    // writing data to file
                    output.write(data, 0, count);
                }
                output.flush();
                output.close();
                input.close();

            } catch (Exception e) {
                Log.e("Error: ", e.getMessage());
            }

            return  String.valueOf(url);
        }

        /**
         * After completing background task
         * **/
        @Override
        protected void onPostExecute(String file_url) {

            Toast.makeText(ProfileActivity.this, file_url, Toast.LENGTH_SHORT).show();
            System.out.println("Downloaded");
        }
    }
}
