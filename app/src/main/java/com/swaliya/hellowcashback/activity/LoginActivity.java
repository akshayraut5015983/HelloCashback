package com.swaliya.hellowcashback.activity;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import com.swaliya.hellowcashback.R;
import com.swaliya.hellowcashback.model.MultipleResource;
import com.swaliya.hellowcashback.model.RequestPojo;
import com.swaliya.hellowcashback.model.User;
import com.swaliya.hellowcashback.model.UserList;
import com.swaliya.hellowcashback.retrofit.APIClient;
import com.swaliya.hellowcashback.retrofit.APIInterface;
import com.swaliya.hellowcashback.util.Config;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class LoginActivity extends AppCompatActivity {
    CardView cardRegistre, cardLogin;
    APIInterface apiInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        cardRegistre = findViewById(R.id.card_register);
        cardLogin = findViewById(R.id.card_login);
        apiInterface = APIClient.getClient().create(APIInterface.class);

    }

    public void logRegister(View view) {
        cardLogin.setVisibility(View.GONE);
        cardRegistre.setVisibility(View.VISIBLE);
    }

    public void regiLogin(View view) {
        cardLogin.setVisibility(View.VISIBLE);
        cardRegistre.setVisibility(View.GONE);
    }

    public void finalLoging(View view) {
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
    }

    public void finalRegister(View view) {

        ConnectivityManager cn = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo nf = cn.getActiveNetworkInfo();
        if (nf != null && nf.isConnected() == true) {
            String url = "http://dblcapp.com/api/customer.aspx?msg=MobileVerify%209112809334";
            //    String url = Config.URL + "/api/apilogin.aspx?uid=" + String.valueOf(uid1) + "&pass=" + String.valueOf(pwd1) + "&mbl=" + String.valueOf(mno);
            DownloadWebPageTask task1 = new DownloadWebPageTask();
            task1.execute(new String[]{String.valueOf(url)});

        } else {
            Toast.makeText(getApplicationContext(), "Network Connection Not Available", Toast.LENGTH_LONG).show();

        }

    }

    public void one(View view) {
        /**
         GET List Resources
         **/
        Call<MultipleResource> call = apiInterface.doGetListResources();

        call.enqueue(new Callback<MultipleResource>() {
            @Override
            public void onResponse(Call<MultipleResource> call, Response<MultipleResource> response) {


                Log.d("TAG", response.code() + "");
                String displayResponse = "";

                MultipleResource resource = response.body();
                Integer text = resource.page;
                Integer total = resource.total;
                Integer totalPages = resource.totalPages;
                List<MultipleResource.Datum> datumList = resource.data;

                displayResponse += text + " Page\n" + total + " Total\n" + totalPages + " Total Pages\n";

                for (MultipleResource.Datum datum : datumList) {
                    displayResponse += datum.id + " " + datum.name + " " + datum.pantoneValue + " " + datum.year + "\n";
                }
                Toast.makeText(LoginActivity.this, displayResponse, Toast.LENGTH_LONG).show();


            }

            @Override
            public void onFailure(Call<MultipleResource> call, Throwable t) {
                call.cancel();
            }
        });
    }

    public void two(View view) {
        /**
         Create new user
         **/
        User user = new User("morpheus", "leader");
        Call<User> call1 = apiInterface.createUser(user);
        call1.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                User user1 = response.body();

                Toast.makeText(getApplicationContext(), user1.name + " " + user1.job + " " + user1.id + " " + user1.createdAt, Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {
                call.cancel();
            }
        });
    }

    public void three(View view) {
        /**
         GET List Users
         **/
        Call<UserList> call2 = apiInterface.doGetUserList("4");
        call2.enqueue(new Callback<UserList>() {
            @Override
            public void onResponse(Call<UserList> call, Response<UserList> response) {

                UserList userList = response.body();
                Integer text = userList.page;
                Integer total = userList.total;
                Integer totalPages = userList.totalPages;
                List<UserList.Datum> datumList = userList.data;
                Toast.makeText(getApplicationContext(), text + " page\n" + total + " total\n" + totalPages + " totalPages\n", Toast.LENGTH_SHORT).show();

                for (UserList.Datum datum : datumList) {
                    Toast.makeText(getApplicationContext(), "id : " + datum.id + " name: " + datum.first_name + " " + datum.last_name + " avatar: " + datum.avatar, Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<UserList> call, Throwable t) {
                call.cancel();
            }
        });
    }

    public void four(View view) {
        /**
         POST name and job Url encoded.
         **/
        Call<UserList> call3 = apiInterface.doCreateUserWithField("morpheus", "leader");
        call3.enqueue(new Callback<UserList>() {
            @Override
            public void onResponse(Call<UserList> call, Response<UserList> response) {
                UserList userList = response.body();
                Integer text = userList.page;
                Integer total = userList.total;
                Integer totalPages = userList.totalPages;
                List<UserList.Datum> datumList = userList.data;
                Toast.makeText(getApplicationContext(), text + " page\n" + total + " total\n" + totalPages + " totalPages\n", Toast.LENGTH_SHORT).show();

                for (UserList.Datum datum : datumList) {
                    Toast.makeText(getApplicationContext(), "id : " + datum.id + " name: " + datum.first_name + " " + datum.last_name + " avatar: " + datum.avatar, Toast.LENGTH_SHORT).show();
                }

            }

            @Override
            public void onFailure(Call<UserList> call, Throwable t) {
                call.cancel();
            }
        });
    }

    public void five(View view) {

        Call<RequestPojo> call = apiInterface.doGetList();

        call.enqueue(new Callback<RequestPojo>() {

            @Override
            public void onResponse(Call<RequestPojo> call, Response<RequestPojo> response) {


                Log.d("response", response.code() + "");
                String displayResponse = "";

               /* RequestPojo resource = response.body();
                Integer text = resource.page;
                Integer total = resource.total;
                Integer totalPages = resource.totalPages;
                List<MultipleResource.Datum> datumList = resource.data;

                displayResponse += text + " Page\n" + total + " Total\n" + totalPages + " Total Pages\n";

                for (MultipleResource.Datum datum : datumList) {
                    displayResponse += datum.id + " " + datum.name + " " + datum.pantoneValue + " " + datum.year + "\n";
                }*/

                Toast.makeText(LoginActivity.this, response.message(), Toast.LENGTH_LONG).show();


            }

            @Override
            public void onFailure(Call<RequestPojo> call, Throwable t) {
                call.cancel();
                Log.d("TAG", t.getMessage() + "");
                Toast.makeText(LoginActivity.this, "onFailure" + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private class DownloadWebPageTask extends AsyncTask<String, Void, String> {

        @Override
        protected String doInBackground(String... urls) {
            String response = "";

            for (String url : urls) {

                DefaultHttpClient client = new DefaultHttpClient();
                HttpGet httpGet = new HttpGet(url);
                try {
                    HttpResponse execute = client.execute(httpGet);
                    InputStream content = execute.getEntity().getContent();
                    BufferedReader buffer = new BufferedReader(new InputStreamReader(content));
                    String s = "";
                    while ((s = buffer.readLine()) != null) {
                        response += s;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return response;
        }

        @Override
        protected void onPostExecute(String result) {
            String s = Html.fromHtml(result).toString();
            Toast.makeText(LoginActivity.this, "responce " + s, Toast.LENGTH_LONG).show();
           /* AlertDialog.Builder builder2 = new AlertDialog.Builder(LoginActivity.this);
            if (s.contains("Login Successfully")) {

                builder2.setTitle("Login");
                builder2.setMessage("Login Successfully");
                builder2.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();

                    }
                });
                builder2.show();
            } else {
                builder2.setTitle("Login");
                builder2.setMessage(String.valueOf(s).toString().trim());
                builder2.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                builder2.show();
            }*/
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            Toast.makeText(LoginActivity.this, "pre", Toast.LENGTH_SHORT).show();
        }

        @Override
        protected void onProgressUpdate(Void... values) {
            super.onProgressUpdate(values);
            Toast.makeText(LoginActivity.this, String.valueOf(values.length), Toast.LENGTH_SHORT).show();
        }
    }


}
