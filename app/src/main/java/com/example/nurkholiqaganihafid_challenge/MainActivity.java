package com.example.nurkholiqaganihafid_challenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText edtName;
    private EditText edtEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtName = findViewById(R.id.edt_name);
        edtEmail = findViewById(R.id.edt_email);
    }

//    public void sendBiodata(View view) {
//        Intent moveIntent = new Intent(this, OutputResultActivity.class);
//        EditText fullName = findViewById(R.id.edt_name);
//        EditText hobby = findViewById(R.id.edt_hobby);
//        String getName = fullName.getText().toString();
//        String getHobby = hobby.getText().toString();
//        moveIntent.putExtra("name", getName);
//        moveIntent.putExtra("hobby", getHobby);
//        startActivity(moveIntent);
//    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_submit) {
            String name = edtName.getText().toString();
            String email = edtEmail.getText().toString();

            Boolean isEmptyField = false;
            if (name.isEmpty()) {
                isEmptyField = true;
                edtName.setError("Tolong masukan nama lengkap anda");
            }

            if (email.isEmpty()) {
                isEmptyField = true;
                edtEmail.setError("Tolong masukan email anda");
            }

            if (!isEmptyField) {
                Intent moveIntent = new Intent(this, OutputResultActivity.class);
                String getName = edtName.getText().toString();
                String getEmail = edtEmail.getText().toString();
                moveIntent.putExtra("name", getName);
                moveIntent.putExtra("email", getEmail);
                startActivity(moveIntent);
            }
        }

    }
}