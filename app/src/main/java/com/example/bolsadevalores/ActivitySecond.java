package com.example.bolsadevalores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;

public class ActivitySecond extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        inTheActivitySecond();
    }

    public void inTheActivitySecond() {
        Bundle b = getIntent().getExtras();
        String lpa = null;
        String pl  = null;
        String roe = null;
        String vpa = null;
        String pvp = null;
        TextView vLPA = findViewById(R.id.textLPA);
        TextView vPL = findViewById(R.id.textPL);
        TextView vROE = findViewById(R.id.textROE);
        TextView vVPA = findViewById(R.id.textVPA);
        TextView vPVP = findViewById(R.id.textPVP);
        if (b != null) {
            lpa = b.getString("ativo");
            vLPA.setText(lpa);
            pl = b.getString("pl");
            vPL.setText(pl);
            roe = b.getString("roe");
            vROE.setText(roe);
            vpa = b.getString("vpa");
            vVPA.setText(vpa);
            pvp = b.getString("pvp");
            vPVP.setText(pvp);
        }
    }
}
