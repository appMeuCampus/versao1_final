package br.edu.ifmg.bambui.appmeucampus.meucampus.Activities;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import br.edu.ifmg.bambui.appmeucampus.meucampus.R;
import br.edu.ifmg.bambui.appmeucampus.meucampus.classes.Toolbar_Classe;

public class TelaLugarActivity extends Toolbar_Classe {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_lugar);

        this.toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(this.toolbar);
        getSupportActionBar().setTitle("Localização");
        CreateDrawerLayout();

        String nome_do_lugar = getIntent().getStringExtra("nomeLugar");
        textView = (TextView) findViewById(R.id.textView2);
        textView.setText(nome_do_lugar);
    }
}
