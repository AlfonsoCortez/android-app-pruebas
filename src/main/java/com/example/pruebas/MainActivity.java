package com.example.pruebas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    //Declarando variables

    Button boton1;
    Button boton2;

    TextView mostrarTexto;
    EditText casillaTexto;
    Button boton;
    Button botonRediccionar;
    Button btnInfo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mostrarTexto = (TextView)findViewById(R.id.texto);
        boton = (Button)findViewById(R.id.boton);
        casillaTexto = (EditText)findViewById(R.id.entrada);
        botonRediccionar = (Button)findViewById(R.id.botonRedireccionar);
        btnInfo = (Button)findViewById(R.id.btnInfo);

        boton1 = (Button)findViewById(R.id.boton1);
        boton2 = (Button)findViewById(R.id.boton2);

        btnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,informacion.class);
                startActivity(intent);
            }
        });
        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,pantallaimc.class);
                startActivity(intent);
            }
        });


        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,calculadora.class);
                startActivity(intent);
            }
        });

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String texto = casillaTexto.getText().toString();
                mostrarTexto.setText(texto);
            }
        });

        botonRediccionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,pantallaimc.class);
                startActivity(intent);
            }
        });




    }
}
