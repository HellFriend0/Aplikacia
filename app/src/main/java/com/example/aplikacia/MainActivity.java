package com.example.aplikacia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    ConstraintLayout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout = findViewById(R.id.container);
    }

    public void btnRedClick(View view){
        layout.setBackgroundColor(Color.RED);
    }
    public void btnBlueClick(View view){
        layout.setBackgroundColor(Color.BLUE);
    }
}
