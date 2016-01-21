package com.example.nhnent.myselector;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.Button;

/**
 * Created by nhnent on 2016. 1. 21..
 */
public class BitmapButton extends Button {


    public BitmapButton(Context context) {
        super(context);
        init();
    }

    public BitmapButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        setBackgroundResource(R.drawable.arrow_left_normal);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int action = event.getAction();

        if(action == MotionEvent.ACTION_DOWN){
            setBackgroundResource(R.drawable.arrow_left_clicked);
        }else if (action == MotionEvent.ACTION_UP) {
            setBackgroundResource(R.drawable.arrow_left_normal);
        }
        return true;
    }
}
