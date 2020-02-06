package com.swaliya.hellowcashback.util;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.Html;

import com.swaliya.hellowcashback.activity.MainActivity;

public class AlertApp {
    Context context;

    public AlertApp(Context context) {
        this.context = context;
    }

    public void forAboutUs() {
        String str = "Hellocashback is one of the most comprehensive and user freindly travel portal aiming to be a one stop shop for you to find cheap domestic as well as international flights , Hotels , Bus and Vacation packages online. Whether you're travelling for fun, business, adventure, or relaxation, your ideal trip is simply a click away. Finding cheap flights has never been so easy, time saving and money saving.\n" +
                "\n" +
                " Now that we are here you need not visit website after website to find cheap airline tickets or the best deals. It's all here for you in one place with  convenient features which gives you seamless online booking experience. Hellocashback is your perfect travel partner - we'll get you where you want to. Its a travel super market for anyone wishing to travel within or from India.";
        AlertDialog.Builder builder2 = new AlertDialog.Builder(context, android.R.style.Theme_Material_Light_Dialog); //Theme_Material_Light
        builder2.setTitle(Html.fromHtml("<font color='#3373ff'> About us... </font>"));
        builder2.setMessage(str);


        builder2.setPositiveButton("Okay...!", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        builder2.setCancelable(false);
        builder2.show();
    }

    public void forContactUs() {

        String str = "Have Questions? Call Us !" + "\n\n" + "8087031415" + "\n\n\n" + "Write us on !" + "\n\n" + "support@hellocashback.com " + "\n" + "sales@hellocashback.com" + "\n\n\n" + "Our Address !" + "\n\n" + "20/1 House No. 2268/5 2nd Floor. Lane No. 09, Mayur Society, Punnai Nagar Near KK Market Opp Balaji Traders Pune, Maharashtra,India.\n" +
                "Pin code:411043";

        AlertDialog.Builder builder2 = new AlertDialog.Builder(context, android.R.style.Theme_Material_Light_Dialog); //Theme_Material_Light
        builder2.setTitle(Html.fromHtml("<font color='#3373ff'> Contact us... </font>"));
        builder2.setMessage(Html.fromHtml("<font color='#3373ff'>Have Questions? Call Us !</font><br><br>" + "\n\n" + "8087031415" + "\n\n\n" + "<br><br><br><font color='#3373ff'> Write us on ! </font><br><br>" + "\n\n" + "support@hellocashback.com " + "\n" + "<br>sales@hellocashback.com" + "\n\n\n" + "<br><br><br><font color='#3373ff'>Our Address ! </font><br><br>" + "\n\n" + "20/1 House No. 2268/5 2nd Floor. Lane No. 09, Mayur Society, Punnai Nagar Near KK Market Opp Balaji Traders Pune, Maharashtra,India.\n" +
                "Pin code:411043"));
        builder2.setPositiveButton("Okay...!", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        builder2.setCancelable(false);
        builder2.show();
    }

    public void forTermesansCondition() {
        String str = "";
        AlertDialog.Builder builder2 = new AlertDialog.Builder(context, android.R.style.Theme_Material_Light_Dialog); //Theme_Material_Light
        builder2.setTitle(Html.fromHtml("<font color='#3373ff'> Term's & Conditions </font>"));
        builder2.setMessage(str);


        builder2.setPositiveButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        builder2.setCancelable(false);
        builder2.show();
    }

    public void forHelpCenter() {
        String str = "";
        AlertDialog.Builder builder2 = new AlertDialog.Builder(context, android.R.style.Theme_Material_Light_Dialog); //Theme_Material_Light
        builder2.setTitle(Html.fromHtml("<font color='#3373ff'> Help Center </font>"));
        builder2.setMessage(str);

        builder2.setPositiveButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        builder2.setCancelable(false);
        builder2.show();
    }

}
