package com.example.wook.mbeat;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by Wook on 2015. 1. 29..
 */
public class OperateActivity extends Activity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.operate_activity);

        Intent intent = getIntent();
        final int passedTime = intent.getExtras().getInt("timeValue");
        final int passedRythm = intent.getExtras().getInt("rythmValue");
        final boolean midValue = intent.getExtras().getBoolean("midValue");
        final boolean finalValue = intent.getExtras().getBoolean("finalValue");







    }

}
