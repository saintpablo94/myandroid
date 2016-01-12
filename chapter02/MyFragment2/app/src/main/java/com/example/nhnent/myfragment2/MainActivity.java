package com.example.nhnent.myfragment2;

import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    FragmentManager manager;  //Fragment를 관리하는 클래스의 참조변수
    Fragment frag1, frag2, frag3; //3개의 Fragment 참조변수

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Fragment를 관리하는 FragmentManager 객체 덩어오기
        manager= getSupportFragmentManager();

        //미리 3개의 Fragment 객체 생성
        frag1= new AnalogFragment();
        frag2= new DigitalFragment();
        frag3= new CalendarFragment();

    }

    //Activity가 보여주는 activity_main.xml 파일에 태그문으로
    //onClick속성이 설정된 View를 클릭했을 때 자동으로 호출되는 콜백 메소드
    public void mOnClick(View v){
        switch( v.getId() ){
            case R.id.btn01:
                //fragment_analog.xml을 보여주는 AnalogFragment 객체로 재배치(replace)
                manager.beginTransaction().replace(R.id.container, frag1).commit();
                break;

            case R.id.btn02:
                //fragment_digital.xml을 보여주는 DigitalFragment 객체로 재배치(replace)
                manager.beginTransaction().replace(R.id.container,frag2).commit();
                break;

            case R.id.btn03:
                //fragment_calendar.xml을 보여주는 CalendarFragment 객체로 재배치(replace)
                manager.beginTransaction().replace(R.id.container,frag3).commit();
                break;
        }
    }
}

