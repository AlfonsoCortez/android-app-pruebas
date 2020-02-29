package com.example.pruebas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class informacion extends AppCompatActivity {

    Button btnInfo;
    String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion);

        btnInfo= (Button)findViewById(R.id.btnVerCode);

        btnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abrirNavegador = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/AlfonsoCortez/android-app-pruebas"));
                startActivity(abrirNavegador);
            }
        });
    }
}
