package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;







public class MainActivity extends AppCompatActivity implements View.OnClickListener {
   Button b;
   @Override
   protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);

       Log.e("MainActivity", " This message is created inside onCreate Method.");
       Log.i("MainActivity","This is for information");
       Log.d ("MainActivity","This is a debug message");

       b = findViewById(R.id.button2);
       b.setOnClickListener(this);

   }


   @Override
   public void onClick(View view) {
       Toast.makeText(this,"You clicked on the button", Toast.LENGTH_LONG).show();
       Log.i("MainActivity","Button clicked");
   }
}

