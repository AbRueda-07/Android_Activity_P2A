package com.example.android_activity_p2a;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class ButtonsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttons);

        // Botón normal
        Button btnNormal = findViewById(R.id.btnNormal);
        btnNormal.setOnClickListener(v ->
                Toast.makeText(this, "Botón Normal presionado", Toast.LENGTH_SHORT).show()
        );

        // Botón con imagen
        ImageButton btnImagen = findViewById(R.id.btnImagen);
        btnImagen.setOnClickListener(v ->
                Toast.makeText(this, "Botón con Imagen presionado", Toast.LENGTH_SHORT).show()
        );

        // RadioButton
        RadioButton rbOpcion1 = findViewById(R.id.rbOpcion1);
        rbOpcion1.setOnClickListener(v ->
                Toast.makeText(this, "Opción 1 seleccionada", Toast.LENGTH_SHORT).show()
        );

        // ToggleButton
        ToggleButton tbEjemplo = findViewById(R.id.tbEjemplo);
        tbEjemplo.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                Toast.makeText(this, "Toggle Activado", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Toggle Desactivado", Toast.LENGTH_SHORT).show();
            }
        });

        // Botón volver
        Button btnVolver = findViewById(R.id.btnVolverButtons);
        btnVolver.setOnClickListener(v -> finish());
    }
}
