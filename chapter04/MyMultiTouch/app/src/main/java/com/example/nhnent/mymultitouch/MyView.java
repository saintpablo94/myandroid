package com.example.nhnent.mymultitouch;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by nhnent on 2016. 1. 28..
 */
public class MyView extends View{

    private static final String TAG = "MyView";

    float curX1 ;
    float curY1 ;
    float curX2 ;
    float curY2 ;

    public MyView(Context context) {
        super(context);
        init(context);
    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context) {

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int action = event.getAction();

        int pointerCount = event.getPointerCount();

        curX1 = event.getX(0);
        curY1 = event.getY(0);

        if(pointerCount > 1) {
            curX2 = event.getX(1);
            curY2 = event.getY(1);
        }

        if(action == MotionEvent.ACTION_DOWN){
            Log.d(TAG, "손가락이 눌렸습니다 : "+pointerCount + ", "+curX1+", "+curY1+", "+curX2+", "+curY2);
        }else if(action == MotionEvent.ACTION_MOVE){
            Log.d(TAG, "손가락이 움직였습니다 : "+pointerCount + ", "+curX1+", "+curY1+", "+curX2+", "+curY2);
        }else if(action == MotionEvent.ACTION_UP){
            Log.d(TAG, "손가락이 때졌습니다 : "+pointerCount + ", "+curX1+", "+curY1+", "+curX2+", "+curY2);
        }

        return true;
    }
}
