package com.example.pruebas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class holamundo extends AppCompatActivity {


    TextView mostrarTexto;
    EditText casillaTexto;
    Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_holamundo);
        mostrarTexto = (TextView)findViewById(R.id.texto);
        boton = (Button)findViewById(R.id.boton);
        casillaTexto = (EditText)findViewById(R.id.entrada);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String texto = casillaTexto.getText().toString();
                mostrarTexto.setText(texto);
            }
        });
    }
}
