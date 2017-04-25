package com.example.daniel.fedpapers;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class LoguinActivity extends AppCompatActivity {
    private EditText l;
    private EditText s;
    int aux1 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loguin);
        l = (EditText) findViewById(R.id.etLoguin);
        s = (EditText) findViewById(R.id.etSenha);
    }

    ArrayList<String> as = new ArrayList<String>();
    ArrayList<String> re = new ArrayList<String>();

    public void entrar(View v) {


            as.add(s.getText() + "");
            re.add(l.getText() + "");
            Intent i = new Intent(this, ConfirLoguinActivity.class);
            i.putStringArrayListExtra("remetente", re);
            i.putStringArrayListExtra("assunto", as);
        showMessage(i);


    }

    public void showMessage(final Intent intent) {

        AlertDialog alerta;
        //Cria o gerador do AlertDialog
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        //define o titulo
        builder.setTitle("Confirmação de número ");
        //define a mensagem
        builder.setMessage("Este numero de celular é está correto! ");
        //define um botão como positivo
        builder.setPositiveButton("Enviar", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface arg0, int arg1) {
                startActivity(intent);
            }
        });
        //define um botão como negativo.
        builder.setNegativeButton("Corrigir Botão", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface arg0, int arg1) {

            }
        });
        //cria o AlertDialog
        alerta = builder.create();
        //Exibe
        alerta.show();
    }
}
