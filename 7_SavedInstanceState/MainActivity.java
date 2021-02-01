package com.example.a4_activity_lifecycle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

// Test cases - Find the difference in callbacks when -
// 1. device rotation,
// 2. back button pressed
// 3. Home button pressed
// and record your observations
public class MainActivity extends AppCompatActivity implements View.OnClickListener{

   Button b1,b2;
   TextView t1;
   int count =0;
   @Override
   protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
// set the user interface layout for this activity
// layout file is defined in the project res/layout/main_activity.xml file
       setContentView(R.layout.activity_main);
       // Toast / log the current method name
       Toast.makeText(this, "onCreate invoked",
               Toast.LENGTH_SHORT).show();


       b1 = findViewById(R.id.inc);
       b2 = findViewById(R.id.dec);
       t1 = findViewById(R.id.tv1);

       b1.setOnClickListener(this);
       b2.setOnClickListener(this);

       if(savedInstanceState != null){
           count = savedInstanceState.getInt("CounterValue");
           t1.setText(String.valueOf(count));
       }
       Log.d("MainActivity", "onCreate invoked ; count = " + count);

   }


   protected void onStart() {
       super.onStart();
       Toast.makeText(this, " onStart invoked", Toast.LENGTH_SHORT).show();
       Log.d("MainActivity", " onStart invoked ; count = " + count);
   }

   @Override
   protected void onResume() {
       super.onResume();
       Toast.makeText(this, " onResume invoked ", Toast.LENGTH_SHORT).show();
       Log.d("MainActivity", "  onResume invoked ; count = " + count);
   }

   @Override
   protected void onPause() {
       super.onPause();
       Toast.makeText(this, " onPause invoked ", Toast.LENGTH_SHORT).show();
       Log.d("MainActivity", "   onPause invoked ; count = " + count);
   }

   @Override
   protected void onStop() {
       super.onStop();
       Toast.makeText(this, " onStop invoked ", Toast.LENGTH_SHORT).show();
       Log.d("MainActivity", " onStop invoked ; count = " + count);
   }

   @Override
   protected void onRestart() {
       super.onRestart();
       Toast.makeText(this, " onRestart invoked ", Toast.LENGTH_SHORT).show();
       Log.d("MainActivity", "  onRestart invoked ; count = " + count);
   }

   @Override
   protected void onDestroy() {
       super.onDestroy();
       Toast.makeText(this, "onDestroy invoked ", Toast.LENGTH_SHORT).show();
       Log.d("MainActivity", " onDestroy invoked ; count = " + count);

   }

   @Override
   public void onClick(View view) {
       if(view.getId() == b1.getId()){
           count++;
       }
       else
           count--;

       t1.setText(String.valueOf(count));
   }


   @Override
   protected  void onSaveInstanceState(Bundle saveInstanceState) {
       super.onSaveInstanceState(saveInstanceState);
       saveInstanceState.putInt("CounterValue",count);

       Log.d("MainActivity", " onSaveInstanceState invoked ; count = " + count);
   }

   @Override
   protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
       super.onRestoreInstanceState(savedInstanceState);
       if(savedInstanceState != null){
           count = savedInstanceState.getInt("CounterValue");
           t1.setText(String.valueOf(count));
       }

       Log.d("MainActivity", " onRestoreInstanceState invoked ; count = " + count);

   }
}

