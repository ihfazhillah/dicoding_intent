package com.ihfazh.dicodingintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button pindah_intent = findViewById(R.id.btn_pindah_intent);
        pindah_intent.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_pindah_intent:
                Intent pindahIntent = new Intent(MainActivity.this, PindahActivity.class);
                startActivity(pindahIntent);
                break;
        }

    }
}