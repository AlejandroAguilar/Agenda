package com.alexaguilar.infopersonal;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//public class MainActivity extends ListActivity {

    private TextView tvNombre;
    private DatePicker dpFecha;
    private TextView tvTelefono;
    private TextView tvEmail;
    private TextView tvDescripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ///////////// Recibe valores para editar
        /*
        Bundle parametros = getIntent().getExtras();


        String nombre = parametros.getString(getResources().getString(R.string.Nombre));                // Nombre
        String fecha = parametros.getString(getResources().getString(R.string.Fecha));                  // Fecha
        String telefono = parametros.getString(getResources().getString(R.string.Telefono));            // Telefono
        String email = parametros.getString(getResources().getString(R.string.Email));                  // Email
        String descripcion = parametros.getString(getResources().getString(R.string.Descripcion));

        tvNombre = (TextView) findViewById(R.id.etNombreUsuario);
        dpFecha = (DatePicker) findViewById(R.id.datePicker);
        tvTelefono = (TextView) findViewById(R.id.etTelefono);
        tvEmail = (TextView) findViewById(R.id.etEmail);
        tvDescripcion = (TextView) findViewById(R.id.etDescripcion);

        tvNombre.setText(nombre);
        tvTelefono.setText(telefono);
        tvEmail.setText(email);
        tvDescripcion.setText(descripcion);
*/
        /////////////





        Button btnSguiente = (Button) findViewById(R.id.btnSiguiente);

        btnSguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Toma variables de los inputs
                EditText nombreEdit;
                DatePicker fechaEdit;
                EditText telefonoEdit;
                EditText emailEdit;
                EditText descripcionEdit;
                String fechaCompleta = "";

                nombreEdit      = (EditText)findViewById(R.id.etNombreUsuario);
                fechaEdit       = (DatePicker)findViewById(R.id.datePicker);
                telefonoEdit    = (EditText)findViewById(R.id.etTelefono);
                emailEdit       = (EditText)findViewById(R.id.etEmail);
                descripcionEdit = (EditText)findViewById(R.id.etDescripcion);

                fechaCompleta = fechaEdit.getYear()+"-"+fechaEdit.getMonth()+"-"+fechaEdit.getDayOfMonth();

                // Envio de variables
                Intent intent = new Intent(MainActivity.this, ConfirmarDatos.class);
                intent.putExtra(getResources().getString(R.string.Nombre),nombreEdit.getText().toString());
                intent.putExtra(getResources().getString(R.string.Fecha),fechaCompleta);
                intent.putExtra(getResources().getString(R.string.Telefono),telefonoEdit.getText().toString());
                intent.putExtra(getResources().getString(R.string.Email),emailEdit.getText().toString());
                intent.putExtra(getResources().getString(R.string.Descripcion), descripcionEdit.getText().toString());

                startActivity(intent);
                //startActivityForResult(intent, 1);


            }
        });


    }


}
