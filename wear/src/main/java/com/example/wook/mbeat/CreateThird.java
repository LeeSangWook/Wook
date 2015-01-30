package com.example.wook.mbeat;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

/**
 * Created by Wook on 2015. 1. 16..
 */
public class CreateThird extends Activity {

    private TextView mTextView;

    boolean midValue=false, finalValue=false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_third);

        Intent intent = getIntent();
        final int passedTime = intent.getExtras().getInt("timeValue");
        final int passedRythm = intent.getExtras().getInt("rythmValue");


        CheckBox midCheck = (CheckBox)findViewById(R.id.midCheck);
        midCheck.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {


                if(isChecked = buttonView.isChecked())
                    midValue = true;
                else
                    midValue = false;


            }
        });

        CheckBox finalCheck = (CheckBox)findViewById(R.id.finalCheck);
        finalCheck.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {


                if(isChecked = buttonView.isChecked())
                    finalValue = true;
                else
                    finalValue = false;

                //Toast.makeText(getApplicationContext(), "체크", Toast.LENGTH_SHORT).show();
            }
        });


        Button btn = (Button) findViewById(R.id.createBtn);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),StartActivity.class);

                intent.putExtra("timeValue", passedTime);
                intent.putExtra("rythmValue", passedRythm);
                intent.putExtra("midValue", midValue);
                intent.putExtra("finalValue", finalValue);

                startActivity(intent);

            }
        });




/*
        String a = "ddd"+passedRythm + " " + passedTime;
        TextView aa = (TextView)findViewById(R.id.text);

        aa.setText(a);
*/

    }



}
