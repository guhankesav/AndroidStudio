package com.example.a2_buttonclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   @Override
   protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main); // Linking XML file with the activity class
   } //end onCreate

  // This method is mapped to Button through 'onClick' attribute in XML file
   // Button need not do setOnClickListener if done through XML file
   public void myButtonClickMethod(View view) {
       Toast.makeText(this,"Button 1 is clicked",Toast.LENGTH_LONG).show();
   }


}
