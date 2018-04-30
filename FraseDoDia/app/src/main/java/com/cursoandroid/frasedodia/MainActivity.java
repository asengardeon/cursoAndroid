package com.cursoandroid.frasedodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textoNovaFrase;
    private Button botaoNovaFrase;
    private String[] frases = {"Frase 1", "Frase 2", "Frase 3", "Frase 4"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoNovaFrase = findViewById(R.id.botaoNovaFraseId);
        textoNovaFrase = findViewById(R.id.textoNovaFraseId);

        //textoNovaFrase.setText(frases[0]);
        botaoNovaFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                textoNovaFrase.setText(frases[random.nextInt(frases.length)]);
            }
        });
    }
}
