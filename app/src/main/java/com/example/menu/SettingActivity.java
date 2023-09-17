package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.Toast;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

public class SettingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
    }

    public void BackActivityMain(View view){
        //Intent intent = new Intent(this,MainActivity.class);
        //startActivity(intent);


        Intent intent = new Intent();
        // intent.putExtra();
        setResult(200,intent);
        finish();

    }

    public void massageMusic(View view){
        Snackbar.make(view, R.string.btn_musicMassage, Snackbar.LENGTH_SHORT).show();
    }

    public void massageVideo(View view){
        Snackbar.make(view, R.string.btn_videoMassage, Snackbar.LENGTH_SHORT).show();
    }

    public void massageCall(View view){
        Snackbar.make(view, R.string.btn_callMassage, Snackbar.LENGTH_SHORT).show();
    }
}