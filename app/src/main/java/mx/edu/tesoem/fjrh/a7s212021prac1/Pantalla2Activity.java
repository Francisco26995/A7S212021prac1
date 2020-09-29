package mx.edu.tesoem.fjrh.a7s212021prac1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Pantalla2Activity extends AppCompatActivity {
    TextView lblsaludo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);

        lblsaludo = findViewById(R.id.lblsaluda);
        Bundle parametros = getIntent().getExtras();
        String nombre = parametros.getString("Nombre");
        lblsaludo.setText("Bienvenido "+ nombre);
    }
}