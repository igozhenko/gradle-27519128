package com.tivogi.so.gradle;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.tivogi.gradle.R;
import com.tivogi.so.gradle.library.Library;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String name = new Library().getName();
        TextView textView = (TextView) findViewById(R.id.a_mn_library);
        textView.setText(name);
    }
}
