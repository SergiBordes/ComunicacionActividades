package es.upv.comunicacinactividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn;
    EditText et;
    String st;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void verificar (View view) {

        btn = findViewById(R.id.button);
        et=findViewById(R.id.editText);

        Intent i = new Intent(this, VerificarActivity.class);
        st = et.getText().toString();
        i.putExtra("Value",st);
        startActivity(i);
        finish();
    }

    public void backToMain (View view) {
        Intent i = new Intent(this, BackToMain.class);
        startActivity(i);
    }

}
