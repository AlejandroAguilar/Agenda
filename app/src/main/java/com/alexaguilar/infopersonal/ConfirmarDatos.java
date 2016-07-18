package com.alexaguilar.infopersonal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ConfirmarDatos extends AppCompatActivity {

    private TextView tvNombre;
    private TextView tvFecha;
    private TextView tvTelefono;
    private TextView tvEmail;
    private TextView tvDescripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar_datos);

        Bundle parametros = getIntent().getExtras();

        String nombre = parametros.getString(getResources().getString(R.string.Nombre));                // Nombre
        String fecha = parametros.getString(getResources().getString(R.string.Fecha));                  // Fecha
        String telefono = parametros.getString(getResources().getString(R.string.Telefono));            // Telefono
        String email = parametros.getString(getResources().getString(R.string.Email));                  // Email
        String descripcion = parametros.getString(getResources().getString(R.string.Descripcion));      // Descripcion

        // Se colocan las variables en pantalla
        tvNombre = (TextView) findViewById(R.id.tvConfNombre);
        tvFecha = (TextView) findViewById(R.id.tvConfFecha);
        tvTelefono = (TextView) findViewById(R.id.tvConfTelefono);
        tvEmail = (TextView) findViewById(R.id.tvConfEmail);
        tvDescripcion = (TextView) findViewById(R.id.tvConfDescripcion);

        tvNombre.setText(nombre);
        tvFecha.setText(fecha);
        tvTelefono.setText(telefono);
        tvEmail.setText(email);
        tvDescripcion.setText(descripcion);


        Button btnRegresar = (Button) findViewById(R.id.btnBotonEdicion);

        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Intent para regresar a la pantalla anterior
                Intent intent = new Intent(ConfirmarDatos.this, MainActivity.class);

                

                startActivity(intent);


            }
        });

    }
}
