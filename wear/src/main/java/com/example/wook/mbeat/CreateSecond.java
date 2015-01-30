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

/**
 * Created by Wook on 2015. 1. 14..
 */
public class CreateSecond extends Activity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_second);

        Intent intent = getIntent();

        final int passedTime = intent.getExtras().getInt("timeValue");

        ListView listView = (ListView)findViewById(R.id.rythmList);

        final ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("very slow");
        arrayList.add("slow");
        arrayList.add("normal");
        arrayList.add("fast");
        arrayList.add("very fast");

        final ArrayAdapter<String > arrayAdapter;

        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayList);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(CreateSecond.this, CreateThird.class);

                intent.putExtra("timeValue", passedTime);
                intent.putExtra("rythmValue", position);
                startActivity(intent);
            }
        });





    }
}
