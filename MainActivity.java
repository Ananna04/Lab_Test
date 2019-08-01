package com.example.user.labtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText nameEdit,emailEdit,homeTownEdit;
    private Button send_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameEdit=findViewById(R.id.nameEditText);
        emailEdit=findViewById(R.id.nameEmailText);
        homeTownEdit=findViewById(R.id.homeToewnEditText);
        send_btn=findViewById(R.id.sendButton_id);

        send_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("name",nameEdit.getText().toString());
                intent.putExtra("email",emailEdit.getText().toString());             //to pass all the values
                intent.putExtra("home_town",homeTownEdit.getText().toString());
                startActivity(intent);

            }
        });

    }
}
