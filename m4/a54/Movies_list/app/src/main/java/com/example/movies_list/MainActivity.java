package com.example.movies_list;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textview;
    String[] details = {"movie1", "movie2", "movie3", "movie4", "movie11", "movie22", "movie33",
            "movie444", "movie211", "movie322", "movie533", "movie644"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textview = (TextView) findViewById(R.id.abcd);
        for (int i=0;i<details.length;i++) {
            textview.append(details[i]+"\n\n\n");
        }
    }

    public void akshitha(View view) {
        Intent intent = new Intent(this, ChildActivity.class);
        startActivity(intent);
    }
}
