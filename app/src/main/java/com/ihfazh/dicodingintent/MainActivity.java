package com.ihfazh.dicodingintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.ihfazh.dicodingintent.PindahIntentData.STRING_AGE;
import static com.ihfazh.dicodingintent.PindahIntentData.STRING_NAMA;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button pindah_intent = findViewById(R.id.btn_pindah_intent);
        pindah_intent.setOnClickListener(this);

        Button pindah_intent_data = findViewById(R.id.btn_pindah_intent_dengan_data);
        pindah_intent_data.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_pindah_intent:
                Intent pindahIntent = new Intent(MainActivity.this, PindahActivity.class);
                startActivity(pindahIntent);
                break;
            case R.id.btn_pindah_intent_dengan_data:
                Intent pindahIntendData = new Intent(MainActivity.this, PindahIntentData.class);
                pindahIntendData.putExtra(STRING_AGE, 10);
                pindahIntendData.putExtra(STRING_NAMA, "Muhammad Ihfazhillah");
                startActivity(pindahIntendData);
                break;
        }

    }
}