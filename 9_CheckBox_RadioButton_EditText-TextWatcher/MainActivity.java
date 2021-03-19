package com.example.a7_checkbox_radiobutton_edittexttextwatcher;

import androidx.appcompat.app.AppCompatActivity;




import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
       implements TextWatcher,View.OnClickListener, RadioGroup.OnCheckedChangeListener {

   EditText ed;
   CheckBox c1,c2;
   Button button;
   RadioButton subRadioButton;
   RadioGroup radioGroup;


   @Override
   protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
       // Make editText use TextWatcher interface to watch change made over EditText.
       // For doing this, EditText calls the addTextChangedListener() method.
       ed =  findViewById(R.id.editText);
       ed.addTextChangedListener(this);


       // checkbox uses setOnClickListener for notifying selection
       c1 =  findViewById(R.id.checkBox1);
       c2 = findViewById(R.id.checkBox2);
       c1.setOnClickListener(this);
       c2.setOnClickListener(this);

       radioGroup=findViewById(R.id.radioGroup);
       radioGroup.setOnCheckedChangeListener(this);

   }
   //Textwatcher interface
   @Override
   public void beforeTextChanged(CharSequence s, int start, int count, int after) {
       if(s.length() > 0) {
           Toast.makeText(getApplicationContext(), "before Textchanged : " + s.toString(), Toast.LENGTH_SHORT).show();
           Log.d("MainActivity: Before", s.toString());
       }
       else{
           Toast.makeText(getApplicationContext(), "before Textchanged : <nodata>" , Toast.LENGTH_SHORT).show();
           Log.d("MainActivity: Before", "<nodata>");
       }
   }
   //Textwatcher interface
   @Override
   public void onTextChanged(CharSequence s, int start, int before, int count) {
       if(s.length() > 0) {
           Toast.makeText(getApplicationContext(), "on Text changed :" + s.toString(), Toast.LENGTH_SHORT).show();
           Log.d("MainActivity:TextChange", s.toString());
       }
       else{
           Toast.makeText(getApplicationContext(), "on Textchanged : <nodata>" , Toast.LENGTH_SHORT).show();
           Log.d("MainActivity: TextChange", "<nodata>");
       }
   }
   //Textwatcher interface
   @Override
   public void afterTextChanged(Editable s) {
       if(s.length() > 0) {
           Toast.makeText(getApplicationContext(), "After TextChanged : " + s.toString(), Toast.LENGTH_SHORT).show();
           Log.d("MainActivity:After- ", s.toString());
           try {
               int no = Integer.parseInt(s.toString());
               if (no > 99) {
                   s.replace(0, s.length(), "10");
                   Toast.makeText(getApplicationContext(), " Enter a number < 99 ", Toast.LENGTH_SHORT).show();
                   Log.d("MainActivity:After-", s.toString());
               }
           } catch (NumberFormatException e) {
           }
       }
       else{
           Toast.makeText(getApplicationContext(), "after Textchanged : <nodata>" , Toast.LENGTH_SHORT).show();
           Log.d("MainActivity: After", "<nodata>");
       }
   }


   // View.onClickListener interface
   @Override
   public void onClick(View v) {
       CheckBox t = (CheckBox) v;
       if (t.isChecked()) {
           Toast.makeText(getApplicationContext(), t.getText()+" is selected", Toast.LENGTH_SHORT).show();
          if(t.getId()==c1.getId()){
              c2.setChecked(false);
          }
          else
              c1.setChecked(false);
       }
   }

   // method mapped through onClick attribute in activity_main.xml
   public void onclickbuttonMethod(View view) {
       int selectedId = radioGroup.getCheckedRadioButtonId();
       subRadioButton = findViewById(selectedId);
       if(selectedId == -1){
           Toast.makeText(MainActivity.this,"Nothing selected", Toast.LENGTH_SHORT).show();
       }
       else{
           Toast.makeText(MainActivity.this,subRadioButton.getText()+" is selected", Toast.LENGTH_SHORT).show();
       }
   }
   //RadioGroup.OnCheckedChangeListener
   @Override
   public void onCheckedChanged(RadioGroup radioGroup1, int i) {
       //radioGroup1.getCheckedRadioButtonId();
       RadioButton rb = findViewById(i);
       Toast.makeText(MainActivity.this,rb.getText()+" is selected", Toast.LENGTH_SHORT).show();
   }
}


