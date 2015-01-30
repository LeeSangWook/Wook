package com.example.wook.mbeat;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

/**
 * Created by Wook on 2015. 1. 22..
 */
public class StartActivity extends Activity {

    String str[] = {"very slow","slow","normal","fast","very fast"};

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start);

        Intent intent = getIntent();
        final int passedTime = intent.getExtras().getInt("timeValue");
        final int passedRythm = intent.getExtras().getInt("rythmValue");
        final boolean midValue = intent.getExtras().getBoolean("midValue");
        final boolean finalValue = intent.getExtras().getBoolean("finalValue");


        if(midValue == true) {
            String a = passedTime + " min";
            TextView aa = (TextView) findViewById(R.id.intervalSet);

            aa.setText(a);
        }
        String b = str[passedRythm];
        TextView bb = (TextView)findViewById(R.id.rythmSet);

        bb.setText(b);

        final CheckBox midCheck = (CheckBox)findViewById(R.id.checkBox1);

        midCheck.setEnabled(false);
        if(midValue == true){
            midCheck.setChecked(true);
            midCheck.setTextColor(Color.RED);
        }

        final CheckBox finalCheck = (CheckBox)findViewById(R.id.checkBox2);


        finalCheck.setEnabled(false);
        if(finalValue == true){
            finalCheck.setChecked(true);
            finalCheck.setTextColor(Color.RED);
        }


        Button btn = (Button) findViewById(R.id.startBtn);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),OperateActivity.class);

                intent.putExtra("timeValue", passedTime);
                intent.putExtra("rythmValue", passedRythm);
                intent.putExtra("midValue", midValue);
                intent.putExtra("finalValue", finalValue);

                startActivity(intent);

            }
        });



    }

}