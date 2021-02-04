package com.example.a6_edittext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

   Button btnSubmit;
   EditText name, password, email, dob, phoneno;
   TextView result;
   @Override
   protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
       name=findViewById(R.id.edtxtName);
       password = findViewById(R.id.edtxtPwd);
       email = findViewById(R.id.edttxtEmail);
       dob = findViewById(R.id.edttxtDate);
       phoneno= findViewById(R.id.edttxtPhone);
       btnSubmit = findViewById(R.id.btnSend);
       result = findViewById(R.id.resultView);
       btnSubmit.setOnClickListener(this);
   }

   public void onClick(View v) {
       if (name.getText().toString().isEmpty() || password.getText().toString().isEmpty() ||
               email.getText().toString().isEmpty() || dob.getText().toString().isEmpty()
                   || phoneno.getText().toString().isEmpty()) {
               result.setText("Please Fill All the Details");
       }
       else if(!dob.getText().toString().isEmpty()){
           String dobVal = dob.getText().toString();
           String dobComp[] = dobVal.split("/");
           if(dobComp != null && dobComp.length!=0){
               int date = Integer.parseInt(dobComp[0]);
               int month = Integer.parseInt(dobComp[1]);
               int year = Integer.parseInt(dobComp[2]);
               if(date<1 || date > 31){
                   result.setText("Enter a valid date!!");
               }
               if(month < 1 || month > 12){
                   result.setText("Enter a valid month!!");
               }
               if(year < 2000 || month > 2020){
                   result.setText("Enter a valid year!!");
               }
           }

       }
       else {
           result.setText("Name -  " + name.getText().toString() + " \n"
                   + "Password -  " + password.getText().toString()
                   + " \n" + "E-Mail -  " + email.getText().toString()
                   + " \n" + "DOB -  " + dob.getText().toString()
                   + " \n" + "Contact -  " + phoneno.getText().toString());
       }
   }

}
