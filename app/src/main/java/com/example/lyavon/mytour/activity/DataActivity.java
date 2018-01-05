package com.example.lyavon.mytour.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.lyavon.mytour.R;
import com.example.lyavon.mytour.data.RequestDataQuery;

/**
 * Created by Lyavon on 05.01.2018.
 */

public class DataActivity extends FragmentActivity implements View.OnClickListener {

    private Button mBtnDirections;
    private EditText editTextWhence;
    private EditText editTextWhere;
    private EditText editTextWaypoints;

    RequestDataQuery requestDataQuery ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_query);

        editTextWhence = (EditText) findViewById(R.id.text_whence);
        editTextWhere = (EditText) findViewById(R.id.text_where);
        editTextWaypoints = (EditText) findViewById(R.id.text_waypoints);

        mBtnDirections = (Button) findViewById(R.id.directions_btn);
        mBtnDirections.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent intent = new Intent();
        intent.putExtra("хуй",new RequestDataQuery( "1","2","3","4"));
     //   intent.putExtra("хуй",new RequestDataQuery(
     //           editTextWhence.getText().toString(),
     //           editTextWhere.getText().toString(),
     //           editTextWaypoints.getText().toString(),
     //           "driving"));
        setResult(1, intent);
        finish();

    }


}
