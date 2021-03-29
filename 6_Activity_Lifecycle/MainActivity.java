// Test cases - Find the difference in callbacks when -
// 1. device rotation,
// 2. back button pressed
// 3. Home button pressed
// and record your observations
public class MainActivity extends AppCompatActivity {


    
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
// set the user interface layout for this activity
// layout file is defined in the project res/layout/main_activity.xml file
        setContentView(R.layout.activity_main);
        // Toast / log the current method name
        Toast.makeText(this, "onCreate invoked",
                       
                       
                       
                       
                       
                       
                       
                       
                       
                Toast.LENGTH_SHORT).show();
        Log.d("MainActivity", "onCreate invoked");

    }

    protected void onStart() {
        super.onStart();
        Toast.makeText(this, " onStart invoked", Toast.LENGTH_SHORT).show();
        Log.d("MainActivity", " onStart invoked");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, " onResume invoked ", Toast.LENGTH_SHORT).show();
        Log.d("MainActivity", "  onResume invoked");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, " onPause invoked ", Toast.LENGTH_SHORT).show();
        Log.d("MainActivity", "   onPause invoked");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, " onStop invoked ", Toast.LENGTH_SHORT).show();
        Log.d("MainActivity", " onStop invoked");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, " onRestart invoked ", Toast.LENGTH_SHORT).show();
        Log.d("MainActivity", "  onRestart invoked");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy invoked ", Toast.LENGTH_SHORT).show();
        Log.d("MainActivity", " onDestroy invoked");

    }
}

