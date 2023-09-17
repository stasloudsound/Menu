package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.Toast;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void startActivitySetting(View view){
        Intent intent = new Intent(this,SettingActivity.class);
        startActivityForResult(intent,1);
    }

    public void massageNewGame(View view){
        Snackbar.make(view, R.string.btn_newGameMassage, Snackbar.LENGTH_SHORT).show();
    }

    public void massageDirectory(View view){
        Snackbar.make(view, R.string.btn_directoryMassage, Snackbar.LENGTH_SHORT).show();
    }
}