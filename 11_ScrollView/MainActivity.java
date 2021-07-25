package com.example.a9_scrollview;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
   @Override
   protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       //uncomment this line below to set the horizontal scroll view
       //setContentView(R.layout.activity_main);
      //uncomment line below for vertical scroll view
       setContentView(R.layout.vertical_scroll_view);
      
      
   }
}

