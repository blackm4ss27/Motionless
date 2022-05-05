package com.example.motionless;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Web extends AppCompatActivity {

    WebView wv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        wv1 = (WebView)findViewById(R.id.wv1);

        //recuperar valores por el intent
        String URL = getIntent().getStringExtra("SitioWeb");
        //permitira al user navegar solo en el app
        wv1.setWebViewClient(new WebViewClient());
        //abrira el sitio que solicito
        wv1.loadUrl("http://" + URL);
    }

    public void Cerrar(View view) {
        finish();
    }
}