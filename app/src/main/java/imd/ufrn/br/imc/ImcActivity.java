package imd.ufrn.br.imc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.text.DecimalFormat;

public class ImcActivity extends AppCompatActivity {

    TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imc);

        tvResultado = (TextView) findViewById(R.id.tvResultado);

        double imcCalculado = 0;
        double resultado = getIntent().getDoubleExtra("resultadoImc", imcCalculado);

        tvResultado.setText("Seu IMC é: " + String.format( "%.2f", resultado ));


    }
}
