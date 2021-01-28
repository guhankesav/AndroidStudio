import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
 Button b2,b3;;
   @Override
   protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main); // Linking XML file with the activity class

       b2 = findViewById(R.id.button2);

       b2.setOnClickListener(
               new View.OnClickListener() {
           		@Override
          		 public void onClick(View view) {
               		Toast.makeText(MainActivity.this,"Button 2 clicked", Toast.LENGTH_SHORT).show();
           		}
      	 }
      ); // end b2.setonclicklistener


       b3= findViewById(R.id.button3);

       b3.setOnClickListener(
 	new View.OnClickListener() {
           		@Override
           		public void onClick(View view) {
              		   Toast.makeText(MainActivity.this,"Button 3 clicked", Toast.LENGTH_SHORT).show();
          		 }
       	} // end anonymous class
      );  // end b3..setonclicklistener

  } // end onCreate()
} // end MainActivity
