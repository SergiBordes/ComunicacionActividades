package es.upv.comunicacinactividades;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class VerificarActivity extends Activity {

    TextView tv;
    String st;

    @Override public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.verificar);

        tv=findViewById(R.id.textView3);
        st=getIntent().getExtras().getString("Value");
        tv.setText("Hola "+st+", ¿Aceptas las condiciones?");

    }

}
