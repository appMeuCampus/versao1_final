package br.edu.ifmg.bambui.appmeucampus.meucampus.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import br.edu.ifmg.bambui.appmeucampus.meucampus.Activities.listener.OnListClickInteractionListener;
import br.edu.ifmg.bambui.appmeucampus.meucampus.R;
import br.edu.ifmg.bambui.appmeucampus.meucampus.classes.Eventos_Classe;

public class EventoViewHolder extends RecyclerView.ViewHolder {

    public TextView titulo;

    public EventoViewHolder(View itemView) {
        super(itemView);
        this.titulo = (TextView) itemView.findViewById(R.id.card_nome_evento);
    }

    public void bindData(final Eventos_Classe eventoo, final OnListClickInteractionListener listener){
        this.titulo.setText(eventoo.getNome());
        this.titulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onClick(eventoo);
            }
        });
    }
}