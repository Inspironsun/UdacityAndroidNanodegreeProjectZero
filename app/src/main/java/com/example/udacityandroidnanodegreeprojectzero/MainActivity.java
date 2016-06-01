package com.example.udacityandroidnanodegreeprojectzero;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private final int[] mButtonResId = {
            R.id.movie_button,
            R.id.stock_button,
            R.id.bigger_button,
            R.id.material_button,
            R.id.ubiq_button,
            R.id.capstone_button
    };

    private final String[] mToastMessage = {
            "Popular Movies",
            "Stock Hawk",
            "Make it Bigger",
            "Make Your App Material",
            "Go Ubiquitous",
            "Capstone"
    };

    private Button[] mButtons = new Button[6];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getViewsById();
        bindToast();
    }

    private void getViewsById() {
        for (int i = 0; i < mButtonResId.length; i++) {
            mButtons[i] = (Button) findViewById(mButtonResId[i]);
        }
    }

    private void bindToast() {
        for (Button btn : mButtons) {
            btn.setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v) {
        String currentButtonName = "";
        for (int i = 0; i < mButtons.length; i++) {
            if (v == mButtons[i]) {
                currentButtonName = mToastMessage[i];
            }
        }

        Toast.makeText(MainActivity.this,
                "This button will lanuch " + currentButtonName + " app!",
                Toast.LENGTH_SHORT).show();
    }
}
