package com.mapsdos.dariocampaa.coldeportes;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;


public class MainActivityTres extends AppCompatActivity {
    EditText et1, et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_tres);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Ingrese los valores sin comas ni puntos", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        et1 = (EditText) findViewById(R.id.textView2);
        et2 = (EditText) findViewById(R.id.textView3);
        Button btnSumar = (Button) findViewById(R.id.button6);
        final TextView tvResultado = (TextView) findViewById(R.id.textView4);
        final TextView tvResultado1 = (TextView) findViewById(R.id.textView7);

        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int aux1 = Integer.valueOf(et1.getText().toString());
                int aux2 = Integer.valueOf(et2.getText().toString());
                int aux3 = aux2*aux2;
                double aux4 = aux3/100;
                double resultado = aux1 / aux4;
                double res = resultado*100;

                tvResultado.setText("INDICE DE MASA CORPORAL:  " + res);

                if (res < 18.489999999999998) {
                    tvResultado1.setText("BAJO PESO");
                }

                if (res > 18.5 && res < 24.899999999999999) {
                    tvResultado1.setText("NORMAL");
                }

                if (res > 25 && res < 29.899999999999999){

                    tvResultado1.setText("SOBREPESO");
                }

                if (res > 30) {
                    tvResultado1.setText("OBESIDAD");
                }
            }
        });
    }



}
