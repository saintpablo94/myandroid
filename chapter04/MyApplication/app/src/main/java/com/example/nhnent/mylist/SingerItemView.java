package com.example.nhnent.mylist;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by nhnent on 2016. 1. 27..
 */
public class SingerItemView extends LinearLayout{

    TextView nameTextView;
    TextView ageTextView;

    public SingerItemView(Context context) {
        super(context);

        init(context);
    }

    public SingerItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.singer_item, this, true);

        nameTextView = (TextView) findViewById(R.id.nameTextView);
        ageTextView = (TextView) findViewById(R.id.ageTextView);
    }

    public void setName(String name){
        nameTextView.setText(name);
    }

    public void setAge(String age){
        ageTextView.setText(age);
    }
}
