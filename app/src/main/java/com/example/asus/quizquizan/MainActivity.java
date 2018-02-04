package com.example.asus.quizquizan;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import javax.security.auth.Subject;

public class MainActivity extends AppCompatActivity {

    LinearLayout mlineLearn, mlinePractice, mlineAboutUs, mlineEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mlineLearn = (LinearLayout) findViewById(R.id.linelearn);
        mlinePractice = (LinearLayout) findViewById(R.id.linepractice);
        mlineAboutUs = (LinearLayout) findViewById(R.id.lineaboutus);
        mlineEmail = (LinearLayout) findViewById(R.id.linecontactus);
        //menyambungkan main activity java dengan id layout

        mlineLearn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Learn.class);
            }
        });

        mlinePractice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Practice.class);
            }
        });

        mlineAboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, AboutUs.class);
            }
        });

        mlineEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String to = "ajinp23@gmail.com";
                String subject = "";
                String message = "";

                Intent email = new Intent (Intent.ACTION_SEND);
                email.putExtra(Intent.EXTRA_EMAIL, new String[]{to});
                email.putExtra(Intent.EXTRA_SUBJECT, subject);
                email.putExtra(Intent.EXTRA_TEXT, message);
                email.setType("message/rfc882");
                startActivity(Intent.createChooser(email,"kirim email dengan"));

            }
        });
    }@Override
public void onBackPressed(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Anda Yakin Ingin Keluar?");
        builder.setPositiveButton("ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        builder.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        AlertDialog quit = builder.create();
        quit.show();
    }
}
