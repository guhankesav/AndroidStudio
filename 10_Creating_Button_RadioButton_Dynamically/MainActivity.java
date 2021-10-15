import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

   RadioGroup rg;
   RelativeLayout rl;
   RadioButton rb1,rb2;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);

// Get access to the layout object
             rl = (RelativeLayout) findViewById(R.id.relativeLayout);

// Creating radio group and radio button objects
 rg = new RadioGroup(this);
       rb1 = new RadioButton(this);
       rb2 = new RadioButton(this);

// Setting values for the radio buttons 
       rb1.setText("Male");
       rb2.setText("Female");

// Add radio buttons to radio group
       rg.addView(rb1);
       rg.addView(rb2);
// Setting orientation for the radio buttons to be displayed
       rg.setOrientation(RadioGroup.VERTICAL);

   // Creating button object called “Test” 
       Button b = new Button (this);
       b.setText("Test");

       
// Creating layout parameters - layout_height,layout_width // for radio buttons and button as array
// params[0] - radio group, params[1] - button
RelativeLayout.LayoutParams params[] ={
               new RelativeLayout.LayoutParams
             (RelativeLayout.LayoutParams.MATCH_PARENT,
            RelativeLayout.LayoutParams.MATCH_PARENT),             // Layout params for radio group
               new RelativeLayout.LayoutParams                       (RelativeLayout.LayoutParams.MATCH_PARENT,                              RelativeLayout.LayoutParams.WRAP_CONTENT)

};         // Layout params for button
 // setting margins and height and applying for radiogroup
       params[0].leftMargin =10;
       params[0].topMargin = 200;
       params[0].height = 200;
       rg.setLayoutParams(params[0]);
// adding radio group to relative layout
       rl.addView(rg);
// setting margins and height and applying for button
       params[1].leftMargin =10;
       params[1].topMargin = 380;
b.setLayoutParams(params[1]);
       
// setting click listener for button
b.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Toast.makeText(getApplicationContext(),"Button clicked",Toast.LENGTH_SHORT).show();

           }
       });
// adding button to layout      
rl.addView(b);
// setting checked change listener for radio button
       rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
           @Override
           public void onCheckedChanged(RadioGroup group, int checkedId) {
               RadioButton radioButton = (RadioButton) findViewById(checkedId);
               Toast.makeText(getApplicationContext(),radioButton.getText(),Toast.LENGTH_SHORT).show();
           }
       });
   }
}
