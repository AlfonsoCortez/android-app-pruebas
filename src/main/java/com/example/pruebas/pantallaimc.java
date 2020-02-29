package com.example.pruebas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class pantallaimc extends AppCompatActivity {

    Button botonCalcular;
    EditText etPeso;
    EditText etAltura;
    TextView twVisualizar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantallaimc);

        twVisualizar = (TextView)findViewById(R.id.twVisualizar);
        botonCalcular = (Button)findViewById(R.id.btnCalcularIMC);
        etPeso = (EditText)findViewById(R.id.etPeso);
        etAltura = (EditText)findViewById(R.id.etAltura);


        botonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double altura = Double.parseDouble(etAltura.getText().toString());
                double peso = Double.parseDouble(etPeso.getText().toString());

                double AlturaAl2 = Math.pow(altura, 2);
                double resultadoImc = peso/(altura * altura);

                if(resultadoImc <= 18.5){
                    twVisualizar.setText("Tienes un peso insuficiente" );

                }else if(resultadoImc > 18.5 && resultadoImc < 24.9){

                    twVisualizar.setText("Tienes un peso normal");

                }else if(resultadoImc > 25 && resultadoImc < 26.9){

                    twVisualizar.setText("Tienes un Sobrepeso grado I");

                }else if(resultadoImc > 27 && resultadoImc < 29.9){

                    twVisualizar.setText("Tienes un Sobrepeso grado II (preobesidad)");

                }else if(resultadoImc > 30 && resultadoImc < 34.9){

                    twVisualizar.setText("Tienes un Obesidad de tipo I");

                }else if(resultadoImc > 35 && resultadoImc < 39.9){

                    twVisualizar.setText("Tienes un Obesidad de tipo II");

                }else if(resultadoImc > 40 && resultadoImc < 49.9){

                    twVisualizar.setText("Tienes un Obesidad de tipo III (mórbida)");

                }else if(resultadoImc > 50 ){

                    twVisualizar.setText("Tienes un Obesidad de tipo IV (extrema)");

                }else{
                    twVisualizar.setText("Dato invalido.");

                }



                /* twVisualizar.setText(""+resultadoImc); */

            }
        });
    }
}
