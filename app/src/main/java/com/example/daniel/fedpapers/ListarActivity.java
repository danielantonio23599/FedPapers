package com.example.daniel.fedpapers;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ListarActivity extends Activity implements AdapterView.OnItemClickListener {

    private ListView listView;


    @Override
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_listar);


        //private ArrayList<Integer> foto = new ArrayList<>();
        ;
        // this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        Intent intent = getIntent();
        ArrayList<String> remetente = intent.getStringArrayListExtra("remetente");
        ArrayList<String> assunto = intent.getStringArrayListExtra("assumto");

        listView = (ListView) findViewById(R.id.lvMemorando);
        AdapterPrincipalActivity s = new AdapterPrincipalActivity(this);

        s.setRemetente(remetente);
        s.setAssunto(assunto);
        s.setDatahora(assunto);


        listView.setAdapter(s);
        listView.setOnItemClickListener(this);
    }

    public void onItemClick(AdapterView<?> parent, View view, int idx, long id) {
       /* if (listaCheck.get(idx))
            listaCheck.set(idx, false);
        else
            listaCheck.set(idx, true);
        s = (String) parent.getAdapter().getItem(idx); // Objeto selecionado, que neste caso era de um array de strings
        cod = idx;
*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_conf) {
            //Intent i = new Intent(this, ConfiguracaoActivity.class);
           // startActivity(i);
            return true;

        } if (id == R.id.action_contatus) {
            Intent i = new Intent(this, ContatosActivity.class);
            startActivity(i);
            return true;
        } if (id == R.id.action_Criar) {
            Intent i = new Intent(this, CriarActivity.class);
            startActivity(i);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}

