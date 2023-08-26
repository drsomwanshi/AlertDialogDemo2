package com.example.alertdialogdemo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void fun1(View view) {

        AlertDialog.Builder b=new
                AlertDialog.Builder(MainActivity.this);
        b.setTitle("Continue?");
        b.setMessage("Are you Really Want to Continue?");
        b.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "You Selected Yes", Toast.LENGTH_SHORT).show();
            }
        });

        b.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "You Selected Cancel", Toast.LENGTH_SHORT).show();
            }
        });
        b.setIcon(R.drawable.cocsitlogo);


        AlertDialog dialog=b.create();
        dialog.show();



    }
}