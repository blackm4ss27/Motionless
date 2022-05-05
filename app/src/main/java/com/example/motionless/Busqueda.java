package com.example.motionless;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Busqueda extends AppCompatActivity {

    EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busqueda);
        //enlazar la parte logica y diseño
        et1 = (EditText)findViewById(R.id.txtWeb);
    }

    public void Navegar(View view) {
        //se establecen lso cambios de pantallas
        Intent i = new Intent(this,Web.class);
        //enviar parametrosd intent, metodo put extra
        i.putExtra("SitioWeb", et1.getText().toString());
        startActivity(i);
    }
}