package com.open.nezer;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

        Button b1;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            b1=(Button)findViewById(R.id.button);
            b1.setOnClickListener((View.OnClickListener) this);
        }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.button){
            

        }
    }
}