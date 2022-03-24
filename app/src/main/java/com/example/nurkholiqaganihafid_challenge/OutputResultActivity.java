package com.example.nurkholiqaganihafid_challenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class OutputResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output_result);

        Intent intent = getIntent();
        String getName = intent.getStringExtra("name");
        String getHobby = intent.getStringExtra("email");

        TextView resultName = findViewById(R.id.output_name);
        resultName.setText(getName);

        TextView resultHobby = findViewById(R.id.output_email);
        resultHobby.setText(getHobby);

    }
}