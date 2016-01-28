package com.example.nhnent.mylist;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    SingerAdapter adapter;

    String[] ages = {"20","22","21","25","19"};
    String[] names = {"소녀시대","걸스데이","씨스타","포미닛","아이돌"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        listView = (ListView) findViewById(R.id.listView);
        adapter = new SingerAdapter();

        adapter.addItem(new SingerItem(names[0],ages[0]));
        adapter.addItem(new SingerItem(names[1],ages[1]));
        adapter.addItem(new SingerItem(names[2],ages[2]));
        adapter.addItem(new SingerItem(names[3],ages[3]));
        adapter.addItem(new SingerItem(names[4],ages[4]));
        adapter.addItem(new SingerItem(names[0],ages[0]));
        adapter.addItem(new SingerItem(names[1],ages[1]));
        adapter.addItem(new SingerItem(names[2],ages[2]));
        adapter.addItem(new SingerItem(names[3],ages[3]));
        adapter.addItem(new SingerItem(names[4],ages[4]));

        listView.setAdapter(adapter);
    }

    class SingerAdapter extends BaseAdapter {

        ArrayList<SingerItem> items = new ArrayList<SingerItem>();

        public void addItem(SingerItem item){
            items.add(item);
        }

        @Override
        public int getCount() {
            return items.size();
        }

        @Override
        public Object getItem(int position) {
            return items.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
/*

            TextView view = new TextView(getApplicationContext());
            view.setText(names[position]);
            view.setTextSize(50.0f);
            view.setTextColor(Color.BLACK);
*/
            SingerItemView view = null;

            if(convertView == null)
                view = new SingerItemView(getApplicationContext());
            else
                view = (SingerItemView) convertView;

            SingerItem curItem = items.get(position);

            view.setName(curItem.getName());
            view.setAge(curItem.getAge());
            return view;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
