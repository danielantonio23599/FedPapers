package com.example.daniel.fedpapers;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterPrincipalActivity extends BaseAdapter {

    private ArrayList<String> remetente = new ArrayList<String>();
    private ArrayList<String> assunto = new ArrayList<String>();
    private ArrayList<String> datahora = new ArrayList<String>();
    private ArrayList<ImageView> fotoRemet = new ArrayList<ImageView>();
    private Context context;

    public void setRemetente(ArrayList<String> remetente) {
        this.remetente = remetente;
    }

    public void setAssunto(ArrayList<String> assunto) {
        this.assunto = assunto;
    }

    public void setDatahora(ArrayList<String> datahora) {
        this.datahora = datahora;
    }

    public void setFotoRemet(ArrayList<ImageView> fotoRemet) {
        this.fotoRemet = fotoRemet;
    }

    public AdapterPrincipalActivity(Context context) {
        super();
        this.context = context;
    }

    @Override
    public int getCount() {
        return remetente.size();
    }

    @Override
    public Object getItem(int position) {
        return remetente.get(position);
    }

    public Object getFotoRemet(int position) {
        return fotoRemet.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public View getView(final int position, View convertView, ViewGroup parent) {
        String itemLista = remetente.get(position);
        View view = LayoutInflater.from(context).inflate(R.layout.activity_adapter_principal, parent, false);
        ImageView f = (ImageView) view.findViewById(R.id.ivFoto);
        TextView a = (TextView) view.findViewById(R.id.tvAssunto);
        TextView r = (TextView) view.findViewById(R.id.tvRemetente);
        TextView dh = (TextView) view.findViewById(R.id.tvDH);
        f.setImageResource(R.drawable.user);
        a.setText(itemLista);
        r.setText(itemLista);
        dh.setText(itemLista);
        return view;
    }


}
