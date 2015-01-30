package com.example.wook.mbeat;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.wearable.view.WatchViewStub;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    private TextView mTextView;

    public void onButton1Clicked(View v){
        Intent intent = new Intent(this, CreateMainActivity.class);
        startActivity(intent);


    }

    public void onButton2Clicked(View v){
        Intent intent = new Intent(this, OpenMainActivity.class);
        startActivity(intent);


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final WatchViewStub stub = (WatchViewStub) findViewById(R.id.watch_view_stub);
        stub.setOnLayoutInflatedListener(new WatchViewStub.OnLayoutInflatedListener() {
            @Override
            public void onLayoutInflated(WatchViewStub stub) {
                mTextView = (TextView) stub.findViewById(R.id.text);


/*
                Button mainBtn1 = (Button) findViewById(R.id.mainBtn1);
                mainBtn1.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(),
                                CreateMainActivity.class);
                        startActivity(intent);

                    }
                });

                Button mainBtn2 = (Button) findViewById(R.id.mainBtn2);
                mainBtn2.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(),
                                OpenMainActivity.class);
                        startActivity(intent);

                    }
                });
                */
            }
        });
    }
}
