package com.example.udacityandroidnanodegreeprojectzero;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void buttonClick(View v) {
        Button button = (Button) v;
        String appName = (String) button.getText();

        Toast.makeText(MainActivity.this,
                "This button will launch " + appName + " app!",
                Toast.LENGTH_SHORT).show();
    }


}
