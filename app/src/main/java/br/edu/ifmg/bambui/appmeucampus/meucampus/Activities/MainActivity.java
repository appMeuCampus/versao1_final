package br.edu.ifmg.bambui.appmeucampus.meucampus.Activities;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.webkit.WebView;
import android.widget.ImageView;

import br.edu.ifmg.bambui.appmeucampus.meucampus.R;
import br.edu.ifmg.bambui.appmeucampus.meucampus.classes.Toolbar_Classe;

public class MainActivity extends Toolbar_Classe{

    private ImageView imgfeed;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(this.toolbar);
        getSupportActionBar().setTitle("Principal");
        CreateDrawerLayout();

        imgfeed = findViewById(R.id.imgfeed);
        WebView wv = (WebView) findViewById(R.id.webviewfeed);
        wv.getSettings().setJavaScriptEnabled(true);
        wv.getSettings().setSupportZoom(false);//recomendado pelo android pois n sabe como ira se comportar caso dê zoom
        wv.loadData(getString(R.string.main), "text/html; charset=utf-8", "utf-8");

    }
}
