package com.example.android_activity_p2a;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Botones
        Button btnText = findViewById(R.id.btnText);
        Button btnButtons = findViewById(R.id.btnButtons);
        Button btnWidgets = findViewById(R.id.btnWidgets);
        Button btnLayouts = findViewById(R.id.btnLayouts);

        // Listeners
        btnText.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, TextActivity.class)));

        btnButtons.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, ButtonsActivity.class)));

        btnWidgets.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, WidgetsActivity.class)));

        btnLayouts.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, LayoutsActivity.class)));
    }
}
