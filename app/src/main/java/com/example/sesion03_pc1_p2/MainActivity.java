package com.example.sesion03_pc1_p2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtUsuario, txtContraseña;
    Button btnIniciarSesion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtUsuario = findViewById(R.id.editTextUsuario);
        txtContraseña = findViewById(R.id.editTextContraseña);
        btnIniciarSesion = findViewById(R.id.btnInicioSesion);

        btnIniciarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String texto1 = txtUsuario.getText().toString();
                String texto2 = txtContraseña.getText().toString();
                Toast.makeText(MainActivity.this, texto1+" "+texto2, Toast.LENGTH_SHORT).show();
            }
        });
    }
}