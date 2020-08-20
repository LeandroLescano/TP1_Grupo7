package utn.frgp.tusi.tp1_grupo_7;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import utn.frgp.tusi.tp1_grupo_7.R;

public class Exercise1 extends AppCompatActivity {

    private EditText primerNum;
    private EditText segNum;
    private TextView res;

    @Override
    public void setTitle(int titleId) {
        super.setTitle("Suma");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercise1_layout);
        primerNum = (EditText) findViewById(R.id.ednumUno);
        segNum = (EditText) findViewById(R.id.ednumDos);
        res = (TextView) findViewById(R.id.txtRes);
    }

    public void sumar(View view)
    {
    String valorUno = primerNum.getText().toString();
    String valorDos = segNum.getText().toString();

    int numUno = Integer.parseInt(valorUno);
    int numDos = Integer.parseInt(valorDos);
    int numRes = numUno + numDos;

    String result = String.valueOf(numRes);
    res.setText(result);

    }

}
