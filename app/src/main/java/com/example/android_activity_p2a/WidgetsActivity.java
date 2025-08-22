package com.example.android_activity_p2a;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class WidgetsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_widgets);

        // Checkbox
        CheckBox cbEjemplo = findViewById(R.id.cbEjemplo);
        cbEjemplo.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                Toast.makeText(this, "Aceptaste los términos", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "No aceptaste los términos", Toast.LENGTH_SHORT).show();
            }
        });

        // Switch
        Switch swEjemplo = findViewById(R.id.swEjemplo);
        swEjemplo.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                Toast.makeText(this, "Switch Activado", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Switch Desactivado", Toast.LENGTH_SHORT).show();
            }
        });

        // SeekBar + ProgressBar
        ProgressBar pbEjemplo = findViewById(R.id.pbEjemplo);
        SeekBar sbEjemplo = findViewById(R.id.sbEjemplo);

        sbEjemplo.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                pbEjemplo.setProgress(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) { }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(WidgetsActivity.this,
                        "Valor seleccionado: " + seekBar.getProgress(),
                        Toast.LENGTH_SHORT).show();
            }
        });

        // Botón volver
        Button btnVolver = findViewById(R.id.btnVolverWidgets);
        btnVolver.setOnClickListener(v -> finish());
    }
}
