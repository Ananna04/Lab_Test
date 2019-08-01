package com.example.user.labtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private TextView nameText,emailText,homeTownText; //initialize

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //find all views
        nameText=findViewById(R.id.nameTextView);
        emailText=findViewById(R.id.emailTextView);
        homeTownText=findViewById(R.id.homeTownTextView);

        Bundle bundle=getIntent().getExtras(); //to have all the values that passed

        if (bundle!=null){ //to see wheather it has value or not

            String value1=bundle.getString("name","");
            String value2=bundle.getString("email","");
            String value3=bundle.getString("home_town","");
            nameText.setText(value1);
            emailText.setText(value2);
            homeTownText.setText(value3);

        }




    }
}
