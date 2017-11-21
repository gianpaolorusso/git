package com.example.utente5academy.git;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ListView listapiena;
    private Button button;
    private ListView listavuota;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listapiena = findViewById(R.id.listapiena);
        button = findViewById(R.id.button);
        listavuota = findViewById(R.id.listavuota);


    }
}
