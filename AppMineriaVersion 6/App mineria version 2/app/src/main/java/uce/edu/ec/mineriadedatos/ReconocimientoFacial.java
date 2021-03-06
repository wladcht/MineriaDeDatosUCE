package uce.edu.ec.mineriadedatos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ReconocimientoFacial extends AppCompatActivity {
    Button btn_reconocer;
    Button btn_registrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reconocimiento_facial);
        btn_reconocer =(Button)findViewById(R.id.btn_reconocer);
        btn_registrar =(Button)findViewById(R.id.btn_registrar);

        btn_reconocer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent( ReconocimientoFacial.this, RecognitionActivity.class);
                startActivity(i);
            }
        });

        btn_registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent( ReconocimientoFacial.this, RegistroUsuario.class);
                startActivity(i);
            }
        });

    }


}
