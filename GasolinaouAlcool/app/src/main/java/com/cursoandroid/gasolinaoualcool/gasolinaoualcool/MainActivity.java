package com.cursoandroid.gasolinaoualcool.gasolinaoualcool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editAlcool;
    private EditText editGasolina;
    private Button botaoVerificar;
    private TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editAlcool = findViewById(R.id.edtAlcoolId);
        editGasolina = findViewById(R.id.edtGasolinaId);
        botaoVerificar = findViewById(R.id.btnVerificarId);
        txtResultado = findViewById(R.id.txtresultadoId);

        botaoVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String precoAlcool = editAlcool.getText().toString();
                String precoGasolina = editGasolina.getText().toString();
                Double valorAlcool = Double.parseDouble(precoAlcool);
                Double valorGasolina = Double.parseDouble(precoGasolina);

                double resultado = valorAlcool / valorGasolina;

                if(resultado >= 0.7){
                    txtResultado.setText("É melhor utilizar gasolina");
                }else{
                    txtResultado.setText("É melhor utilizar Alcool");
                }


            }
        });
    }
}
