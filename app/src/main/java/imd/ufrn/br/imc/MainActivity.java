package imd.ufrn.br.imc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText etPeso;
    private EditText etAltura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etPeso = (EditText) findViewById(R.id.etPeso);
        etAltura = (EditText) findViewById(R.id.etAltura);
    }

    public void calcularImc(View view) {

        double peso = Double.parseDouble(etPeso.getText().toString());
        double altura = Double.parseDouble(etAltura.getText().toString());
        double imc  = peso / Math.pow(altura, 2);

        Intent intent = new Intent(MainActivity.this, ImcActivity.class);
        intent.putExtra("resultadoImc", imc);
        startActivity(intent);

    }
}
