package com.example.box;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

import java.util.Random;

/**
 * @author Daniel lagron
 */

public class MainActivity extends AppCompatActivity {

    AlertDialog.Builder adb;
    AlertDialog ad;
    Random r = new Random();
    LinearLayout ll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ll = findViewById(R.id.ll);
    }

    //Only text Button


    public void Text(View view) {
        adb = new AlertDialog.Builder(this);
        adb.setTitle("Text");
        adb.setMessage("simple text ;)");
        ad=adb.create();
        ad.show();
    }

    //Only Icon Button

    public void Icon(View view) {
        adb = new AlertDialog.Builder(this);
        adb.setTitle("Icon");
        adb.setMessage("Only icon :)");
        adb.setIcon(R.drawable.ic_launcher_background);
        ad=adb.create();
        ad.show();
    }

    //Only Back Button

    public void Back(View view) {
        adb = new AlertDialog.Builder(this);
        adb.setTitle("Back");
        adb.setMessage("no cap");
        adb.setIcon(R.drawable.ic_launcher_background);
        adb.setPositiveButton("Back", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        ad=adb.create();
        ad.show();
    }

    //Change Color Button

    public void Color(View view) {
        adb = new AlertDialog.Builder(this);
        adb.setTitle("Icon");
        adb.setMessage("Change To a random color");
        adb.setIcon(R.drawable.ic_launcher_background);
        adb.setNegativeButton("Color", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                int color = Color.argb(255,r.nextInt(256),r.nextInt(256),r.nextInt(256));
                ll.setBackgroundColor(color);
            }
        });
        adb.setPositiveButton("Back", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        ad=adb.create();
        ad.show();
    }

    //White Button

    public void White(View view) {
        adb = new AlertDialog.Builder(this);
        adb.setTitle("White");
        adb.setMessage("Change the color");
        adb.setIcon(R.drawable.ic_launcher_background);
        adb.setNegativeButton("White", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                ll.setBackgroundColor(Color.WHITE);
            }
        });
        adb.setPositiveButton("Back", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        ad=adb.create();
        ad.show();
    }

    //Credit Button

    public void Credits(View view) {
        Intent p1 = new Intent(this,Credits.class);
        startActivity(p1);
    }

    //Option Menu

    public boolean onCreateOptionsMenu (Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    public boolean onOptionsItemSelected (MenuItem item){
            Intent p1 = new Intent(this,Credits.class);
            startActivity(p1);
        return true;
    }
}
