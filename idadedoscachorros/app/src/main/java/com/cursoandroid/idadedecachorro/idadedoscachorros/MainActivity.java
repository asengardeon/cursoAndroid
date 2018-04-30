package com.cursoandroid.idadedecachorro.idadedoscachorros;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textoResultado;
    private Button botaoIdade;
    private EditText caixaTexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoResultado = findViewById(R.id.textoResultadoId);
        botaoIdade = findViewById(R.id.botaoDescobrirId);
        caixaTexto = findViewById(R.id.textoIdadeId);


        botaoIdade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String idadeDigitada = caixaTexto.getText().toString();
                if(idadeDigitada.isEmpty()){
                    textoResultado.setText("Nenhum numero digitado");
                }else{
                    int valorDigitado  = Integer.parseInt(idadeDigitada);
                    int resultadoFinal = valorDigitado * 7;
                    textoResultado.setText("A idade do cachorro em anos humanos é: "+resultadoFinal + " anos");
                }
            }
        });
    }
}
