package com.example.package_name;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   Button b1, b2;
   TextView tv1;
   EditText ed1;
   int counter = 0;
   boolean readUserInput = false;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);

       b1 = findViewById(R.id.inc);
       b2 = findViewById(R.id.dec);
       tv1 = findViewById(R.id.count);
       ed1 = findViewById(R.id.et_initalValue);


       b1.setOnClickListener(new View.OnClickListener() {
                                 @Override
                                 public void onClick(View view) {
                                     if(!readUserInput){
                                         counter = Integer.valueOf(ed1.getText().toString()).intValue();
                                         readUserInput = true;
                                     }
                                    counter++;
                                    tv1.setText("Counter Value is :" + String.valueOf(counter));
                                 }
                             }

       );

       b2.setOnClickListener(new View.OnClickListener() {
                                 @Override
                                 public void onClick(View view) {
                                     counter--;
                                     tv1.setText("Counter Value is :" + String.valueOf(counter));
                                 }
                             }

       );

   }


}
