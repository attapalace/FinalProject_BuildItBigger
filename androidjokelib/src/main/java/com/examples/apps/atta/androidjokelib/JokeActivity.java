package com.examples.apps.atta.androidjokelib;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    TextView jokeText;
    public static final String JOKE_INTENT ="joke";
    public static final String TAG = "joke_tag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        jokeText = findViewById(R.id.joke_textview);

        String joke = getIntent().getStringExtra(JOKE_INTENT);

        jokeText.setText(joke);
    }
}
