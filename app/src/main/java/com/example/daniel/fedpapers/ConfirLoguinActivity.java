package com.example.daniel.fedpapers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class ConfirLoguinActivity extends AppCompatActivity {
    ArrayList<String> remetente;
    ArrayList<String> assunto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confir_loguin);
        Intent intent = getIntent();
         remetente = intent.getStringArrayListExtra("remetente");
         assunto = intent.getStringArrayListExtra("assumto");
    }
    public void onClickEntrar(View v){
        Intent i = new Intent( this,ListarActivity.class);
       i.putStringArrayListExtra("remetente",remetente);
        i.putStringArrayListExtra("assunto",assunto);
        startActivity(i);
    }
}
