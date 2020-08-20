package utn.frgp.tusi.tp1_grupo_7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    public void setTitle(int titleId) {
        super.setTitle("TP N°1");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void redirectExercise1(View view) {
        Intent intent = new Intent(this, utn.frgp.tusi.tp1_grupo_7.Exercise1.class);
        startActivity(intent);
    }

    public void redirectExercise2(View view) {
        Intent intent = new Intent(this, utn.frgp.tusi.tp1_grupo_7.exercise2.class);
        startActivity(intent);
    }
}