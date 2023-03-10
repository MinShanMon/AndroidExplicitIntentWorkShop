package com.example.explicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ShowQuote extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_quote);

        //receive from main activity
        Intent intent = getIntent();
        //set in quote variable
        String quote = intent.getStringExtra("quote");

        //set value in textview
        TextView textView = findViewById(R.id.quote);
        if (textView != null) {
            textView.setText(quote);
        }

        Button ok = findViewById(R.id.ok);
        if (ok != null) {
            ok.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });
        }
    }
}