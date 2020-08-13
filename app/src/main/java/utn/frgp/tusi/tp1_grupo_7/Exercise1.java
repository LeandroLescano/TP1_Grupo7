package utn.frgp.tusi.tp1_grupo_7;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import utn.frgp.tusi.tp1_grupo_7.R;

public class Exercise1 extends AppCompatActivity {

    @Override
    public void setTitle(int titleId) {
        super.setTitle("Suma");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercise1_layout);
    }

}
