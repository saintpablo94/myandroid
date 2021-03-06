package org.androidtown.mylifecycle;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(MainActivity.this, "onCreate() 호출됨 : ", Toast.LENGTH_LONG).show();

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
    }

    @Override
    protected void onDestroy() {
        Toast.makeText(MainActivity.this, "onDestroy() 호출됨 : ", Toast.LENGTH_LONG).show();
        super.onDestroy();
    }

    @Override
    protected void onStop() {
        Toast.makeText(MainActivity.this, "onStop() 호출됨 : ", Toast.LENGTH_LONG).show();
        super.onStop();
    }

    @Override
    protected void onPause() {
        Toast.makeText(MainActivity.this, "onPause() 호출됨 : ", Toast.LENGTH_LONG).show();

        saveScore();

        super.onPause();
    }

    private void saveScore() {
        SharedPreferences preferences = getSharedPreferences("gostop",Activity.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putInt("score", 10000);
        editor.commit();
    }

    @Override
    protected void onResume() {
        Toast.makeText(MainActivity.this, "onResume() 호출됨 : ", Toast.LENGTH_LONG).show();

        loadScore();

        super.onResume();
    }

    private void loadScore() {
        SharedPreferences preferences = getSharedPreferences("gostop", Activity.MODE_PRIVATE);
        int score = preferences.getInt("score",0);
        Toast.makeText(MainActivity.this, "읽어온 점수 : "+score, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStart() {
        Toast.makeText(MainActivity.this, "onStart() 호출됨 : ", Toast.LENGTH_LONG).show();
        super.onStart();
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
