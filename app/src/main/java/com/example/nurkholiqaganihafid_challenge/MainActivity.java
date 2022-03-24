package com.example.nurkholiqaganihafid_challenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText edtName;
    private EditText edtHobby;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtName = findViewById(R.id.edt_name);
        edtHobby = findViewById(R.id.edt_hobby);
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
            String hobby = edtHobby.getText().toString();

            Boolean isEmptyField = false;
            if (name.isEmpty()) {
                isEmptyField = true;
                edtName.setError("Tolong masukan nama anda");
            }

            if (hobby.isEmpty()) {
                isEmptyField = true;
                edtHobby.setError("Tolong masukan hobi anda");
            }

            if (!isEmptyField) {
                Intent moveIntent = new Intent(this, OutputResultActivity.class);
                EditText fullName = findViewById(R.id.edt_name);
                EditText cob = findViewById(R.id.edt_hobby);
                String getName = fullName.getText().toString();
                String getHobby = cob.getText().toString();
                moveIntent.putExtra("name", getName);
                moveIntent.putExtra("hobby", getHobby);
                startActivity(moveIntent);
            }
        }

    }
}