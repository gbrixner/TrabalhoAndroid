package com.example.bolsadevalores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Double LPA;
    Double PL;
    Double ROE;
    Double VPA;
    Double PVP;
    String Ativo;
    EditText vAtivo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnMessageOnClick(View view) {
         vAtivo = findViewById(R.id.editText);
        if ((vAtivo.getText().length() == 0) || (vAtivo.getText().length() > 4)) {
            return;
        }
        EditText vLucroLiquido = findViewById(R.id.editText2);
        EditText vPatrimonioLiquido = findViewById(R.id.editText3);
        EditText vNumAcoes = findViewById(R.id.editText4);
        EditText vPrecoAtual = findViewById(R.id.editText5);

        Ativo = MainActivity.this.vAtivo.getText().toString();
        LPA = Double.parseDouble(String.valueOf(vLucroLiquido.getText())) / Double.parseDouble(String.valueOf(vNumAcoes.getText()));
        PL  = Double.parseDouble(String.valueOf(vPrecoAtual.getText())) / LPA;
        ROE = (Double.parseDouble(String.valueOf(vLucroLiquido.getText())) / Double.parseDouble(String.valueOf(vPatrimonioLiquido.getText()))) * 100;
        VPA = Double.parseDouble(String.valueOf(vPatrimonioLiquido.getText())) / Double.parseDouble(String.valueOf(vNumAcoes.getText()));
        PVP = Double.parseDouble(String.valueOf(vPrecoAtual.getText())) / VPA;

        Intent intent = new Intent(MainActivity.this, ActivitySecond.class);
        Bundle b = new Bundle();
        b.putString("ativo", Ativo);
        b.putString("lpa", LPA.toString());
        b.putString("pl", PL.toString());
        b.putString("roe", ROE.toString());
        b.putString("vpa", VPA.toString());
        b.putString("pvp", PVP.toString());
        intent.putExtras(b);
        startActivity(intent);
        finish();
    }
}
