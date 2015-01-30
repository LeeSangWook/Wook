package com.example.wook.mbeat;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import static com.example.wook.mbeat.R.layout;


/**
 * Created by Wook on 2015. 1. 8..
 */
public class CreateMainActivity extends Activity{

    private TextView mTextView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.create_main);


        ListView listView = (ListView)findViewById(R.id.timeList);

        final ArrayList<Integer> arrayList = new ArrayList<Integer>();

        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(15);
        arrayList.add(20);

        final ArrayAdapter<Integer > arrayAdapter;

        arrayAdapter = new ArrayAdapter<Integer>(this, android.R.layout.simple_list_item_1, arrayList);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                int intValue = (int)arrayAdapter.getItem(position);

                Intent intent = new Intent(CreateMainActivity.this, CreateSecond.class);
                intent.putExtra("timeValue", intValue);
                startActivity(intent);
            }
        });


    }




}

