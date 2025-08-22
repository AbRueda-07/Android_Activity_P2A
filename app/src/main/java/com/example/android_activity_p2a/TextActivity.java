package com.example.android_activity_p2a;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.MultiAutoCompleteTextView;

public class TextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);

        // Datos de ejemplo para los campos de autocompletar
        String[] nombres = {"Manzana", "Naranja", "Pera", "Mango"};

        // Configurar AutoCompleteTextView
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_dropdown_item_1line,
                nombres
        );
        AutoCompleteTextView actvEjemplo3 = findViewById(R.id.actvEjemplo3);
        actvEjemplo3.setAdapter(adapter);

        // Configurar MultiAutoCompleteTextView
        MultiAutoCompleteTextView mactvEjemplo4 = findViewById(R.id.mactvEjemplo4);
        mactvEjemplo4.setAdapter(adapter);
        mactvEjemplo4.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());

        // Botón para volver al MainActivity
        Button btnVolver = findViewById(R.id.btnVolverText);
        btnVolver.setOnClickListener(v -> finish());
    }
}
