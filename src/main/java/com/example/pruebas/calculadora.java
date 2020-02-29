package com.example.pruebas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class calculadora extends AppCompatActivity {

    TextView twPantalla;

    String memoria1;
    String signo;
    String memoria2;

    Button bnt1;
    Button bnt2;
    Button bnt3;
    Button bnt4;
    Button bnt5;
    Button bnt6;
    Button bnt7;
    Button bnt8;
    Button bnt9;
    Button bnt0;

    Button Eliminar;
    Button Sumar;
    Button Restar;
    Button Dividir;
    Button Mutiplicar;
    Button Igual;
    Button punto;

    Button eliminarLetra;

    public static String calculadora(String memoria1,String memoria2,String signo){
        Double resultado=0.0;
        String respuesta;


        if (signo.equals("-")) {
            resultado=Double.parseDouble(memoria1)-Double.parseDouble(memoria2);

        }
        if (signo.equals("+")) {
            resultado=Double.parseDouble(memoria1)+Double.parseDouble(memoria2);

        }
        if (signo.equals("*")) {
            resultado=Double.parseDouble(memoria1)*Double.parseDouble(memoria2);

        }
        if (signo.equals("/")) {
            resultado=Double.parseDouble(memoria1)/Double.parseDouble(memoria2);

        }

        respuesta=resultado.toString();
        return respuesta;
    }

    public static boolean existePunto(String cadena){
        boolean resultado = false;

        for(int i = 0; i < cadena.length(); i++){
            if( cadena.substring(i, i+1).equals(".")){
                resultado = true;
                break;
            }
        }
        return resultado;
    }


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        twPantalla = (TextView)findViewById(R.id.twPantalla);

        bnt1 = (Button)findViewById(R.id.btnUno);
        bnt2 = (Button)findViewById(R.id.btnDos);
        bnt3 = (Button)findViewById(R.id.btnTres);
        bnt4 = (Button)findViewById(R.id.btnCuadro);
        bnt5 = (Button)findViewById(R.id.btnCinco);
        bnt6 = (Button)findViewById(R.id.btnSeis);
        bnt7 = (Button)findViewById(R.id.btnSiete);
        bnt8 = (Button)findViewById(R.id.btnOcho);
        bnt9 = (Button)findViewById(R.id.btnNueve);
        bnt0 = (Button)findViewById(R.id.btnCero);

        Eliminar = (Button)findViewById(R.id.btnCE);
        Sumar = (Button)findViewById(R.id.btnSumar);
        Restar = (Button)findViewById(R.id.btnRestar);
        Dividir = (Button)findViewById(R.id.btnDividir);
        Mutiplicar = (Button)findViewById(R.id.btnMultiplicar);
        Igual = (Button)findViewById(R.id.btnIgual);
        punto = (Button)findViewById(R.id.btnPunto);

        eliminarLetra = (Button)findViewById(R.id.btnBorrarLetra);



        Igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String resultado;
                memoria2 = twPantalla.getText().toString();

                if (!memoria2.equals("")) {
                    resultado=calculadora(memoria1, memoria2, signo);
                    twPantalla.setText(resultado);
                }
            }
        });

        Dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!twPantalla.getText().equals("")){
                    memoria1 = twPantalla.getText().toString();
                    signo = "*";
                    twPantalla.setText("");
                }
            }
        });

        Mutiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!twPantalla.getText().equals("")){
                    memoria1 = twPantalla.getText().toString();
                    signo = "*";
                    twPantalla.setText("");
                }
            }
        });

        Sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!twPantalla.getText().equals("")){
                    memoria1 = twPantalla.getText().toString();
                    signo = "+";
                    twPantalla.setText("");
                }
            }
        });

        Restar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!twPantalla.getText().equals("")){
                    memoria1 = twPantalla.getText().toString();
                    signo = "-";
                    twPantalla.setText("");
                }
            }
        });
        eliminarLetra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cadena = (twPantalla.getText().toString());

                if (cadena.length()>0) {
                    cadena=cadena.substring(0, cadena.length()-1);
                    twPantalla.setText(cadena);
                }
            }
        });

        punto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cadena;
                cadena = twPantalla.getText().toString();

                if(cadena.length()<=0){
                    twPantalla.setText("0.");
                }else{
                    if(!existePunto(twPantalla.getText().toString())){
                        twPantalla.setText(twPantalla.getText()+".");
                    }
                }
            }
        });

        Eliminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                twPantalla.setText(" ");

            }
        });

        bnt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                twPantalla.setText(twPantalla.getText()+"1");
            }
        });

        bnt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                twPantalla.setText(twPantalla.getText()+"2");
            }
        });
        bnt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                twPantalla.setText(twPantalla.getText()+"3");
            }
        });
        bnt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                twPantalla.setText(twPantalla.getText()+"4");
            }
        });
        bnt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                twPantalla.setText(twPantalla.getText()+"5");
            }
        });
        bnt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                twPantalla.setText(twPantalla.getText()+"6");
            }
        });
        bnt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                twPantalla.setText(twPantalla.getText()+"7");
            }
        });
        bnt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                twPantalla.setText(twPantalla.getText()+"8");
            }
        });
        bnt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                twPantalla.setText(twPantalla.getText()+"9");
            }
        });
        bnt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                twPantalla.setText(twPantalla.getText()+"0");
            }
        });



    }



}
