package com.ihfazh.dicodingintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class PindahIntentData extends AppCompatActivity {

    public static final String STRING_AGE = "string age";
    public static final String STRING_NAMA = "string nama";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pindah_intent_data);

        TextView textPindahan = findViewById(R.id.text_pindahan);

        int age = getIntent().getIntExtra(STRING_AGE, 0);
        String nama = getIntent().getStringExtra(STRING_NAMA);

        String text = "Nama: " + nama + "\nUmur: " + age;
        textPindahan.setText(text);
    }
}