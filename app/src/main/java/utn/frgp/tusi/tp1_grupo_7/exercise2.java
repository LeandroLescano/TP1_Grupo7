package utn.frgp.tusi.tp1_grupo_7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class exercise2 extends AppCompatActivity {

    private TextView Resultado;
    private TextView Muestra;
    private String Signo = "";
    private String Numero= "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercise2_layout);
        setTitle("Calculadora");
        Muestra = (TextView)findViewById(R.id.txtCuenta);
        Resultado = (TextView)findViewById(R.id.txtResultado);
    }

    public void SeleccionDeBoton(View view)
    {
        String MuestraVieja = (String) Muestra.getText();
        String NumeroViejo = Numero;
        switch (view.getId())
        {
            case R.id.btn0:
                 Muestra.setText(MuestraVieja + "0");
                 Numero = NumeroViejo + "0";
                break;
            case R.id.btn1:
                Muestra.setText(MuestraVieja + "1");
                Numero = NumeroViejo + "1";
                break;
            case R.id.btn2:
                Muestra.setText(MuestraVieja + "2");
                Numero = NumeroViejo + "2";
                break;
            case R.id.btn3:
                Muestra.setText(MuestraVieja + "3");
                Numero = NumeroViejo + "3";
                break;
            case R.id.btn4:
                Muestra.setText(MuestraVieja + "4");
                Numero = NumeroViejo + "4";
                break;
            case R.id.btn5:
                Muestra.setText(MuestraVieja + "5");
                Numero = NumeroViejo + "5";
                break;
            case R.id.btn6:
                Muestra.setText(MuestraVieja + "6");
                Numero = NumeroViejo + "6";
                break;
            case R.id.btn7:
                Muestra.setText(MuestraVieja + "7");
                Numero = NumeroViejo + "7";
                break;
            case R.id.btn8:
                Muestra.setText(MuestraVieja + "8");
                Numero = NumeroViejo + "8";
                break;
            case R.id.btn9:
                Muestra.setText(MuestraVieja + "9");
                Numero = NumeroViejo + "9";
                break;
            case R.id.btnSuma:
                if(!Validacion("+")){Muestra.setText(MuestraVieja + "+");
                Cuenta(Numero);
                Signo = "+";}
                Numero = "";
                break;
            case R.id.btnResta:
                if(!Validacion("-")){Muestra.setText(MuestraVieja + "-");
                Cuenta(Numero);
                Signo = "-";}
                Numero = "";
                break;
            case R.id.btnMultiplicar:
                if(!Validacion("*")){Muestra.setText(MuestraVieja + "*");
                Cuenta(Numero);
                Signo = "*";}
                Numero = "";
                break;
            case R.id.btnDivision:
                if(!Validacion("/")){Muestra.setText(MuestraVieja + "/");
                Cuenta(Numero);
                Signo = "/";}
                Numero = "";
                break;
            case R.id.btnBorrar:
                Muestra.setText("");
                Resultado.setText("0");
                break;
            case R.id.btnIgual:
                Cuenta(Numero);
                Signo = "";
                Numero = "0";
                break;
        }
    }

    public void Cuenta(String Num)
    {
        int VR;
        String VR2 = (String)Resultado.getText();
        if(VR2 == "")
        {
            VR = 0;
        }
        else
        {
            VR = Integer.parseInt(VR2);
        }
         switch (Signo)
         {
             case "+":
                 VR += Integer.parseInt(Num);
                 break;
             case "-":
                 VR -= Integer.parseInt(Num);
                 break;
             case "*":
                 VR = VR * Integer.parseInt(Num);
                 break;
             case "/":
                 VR = VR / Integer.parseInt(Num);
                 break;
             case "":
                VR += Integer.parseInt(Num);
                break;
         }
         VR2 = String.valueOf(VR);
         Resultado.setText(VR2);
    }

    public boolean Validacion(String Nuevo)
    {
        boolean Error = false;
        String MuestraVieja = (String) Muestra.getText();
        String UltimoCaracter= MuestraVieja.substring(MuestraVieja.length()-1);
        switch (UltimoCaracter)
        {
            case "+":
                MuestraVieja = MuestraVieja.substring(0,MuestraVieja.length()-1);
                Muestra.setText(MuestraVieja+Nuevo);
                Error = true;
                Signo = Nuevo;
            break;
            case "-":
                MuestraVieja = MuestraVieja.substring(0,MuestraVieja.length()-1);
                Muestra.setText(MuestraVieja+Nuevo);
                Error = true;
                Signo = Nuevo;
                break;
            case "*":
                MuestraVieja = MuestraVieja.substring(0,MuestraVieja.length()-1);
                Muestra.setText(MuestraVieja+Nuevo);
                Error = true;
                Signo = Nuevo;
                break;
            case "/":
                MuestraVieja = MuestraVieja.substring(0,MuestraVieja.length()-1);
                Muestra.setText(MuestraVieja+Nuevo);
                Error = true;
                Signo = Nuevo;
                break;
        }
        return  Error;
    }
}