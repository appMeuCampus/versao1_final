package br.edu.ifmg.bambui.appmeucampus.meucampus.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import br.edu.ifmg.bambui.appmeucampus.meucampus.Activities.listener.OnListClickInteractionListener;
import br.edu.ifmg.bambui.appmeucampus.meucampus.R;
import br.edu.ifmg.bambui.appmeucampus.meucampus.classes.Noticias_Classe;

public class NoticiaViewHolder extends RecyclerView.ViewHolder {

    public TextView titulo;

    public NoticiaViewHolder(View itemView) {
        super(itemView);
        this.titulo = (TextView) itemView.findViewById(R.id.card_titulo_noticia);
    }

    public void bindData(final Noticias_Classe noticiaa, final OnListClickInteractionListener listener){
        this.titulo.setText(noticiaa.getTitulo());
        this.titulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onClick(noticiaa);
            }
        });
    }
}