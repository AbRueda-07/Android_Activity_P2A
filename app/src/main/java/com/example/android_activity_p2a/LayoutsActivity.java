package com.example.android_activity_p2a;

import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class LayoutsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layouts);

        // Botón para volver
        Button btnVolver = findViewById(R.id.btnVolverLayouts);
        btnVolver.setOnClickListener(v -> finish());
    }
}
