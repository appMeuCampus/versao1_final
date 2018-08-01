package br.edu.ifmg.bambui.appmeucampus.meucampus.Activities.listener;

import android.view.View;

import br.edu.ifmg.bambui.appmeucampus.meucampus.classes.Eventos_Classe;
import br.edu.ifmg.bambui.appmeucampus.meucampus.classes.Noticias_Classe;

/**
 * Interface utilizada para lidar com eventos na listagem
 */
public interface OnListClickInteractionListener {

    /**
     * Trata evento de click na lista
     * @param noticiaa
     */
    void onClick(Noticias_Classe noticiaa);
    void onClick(Eventos_Classe noticiaa);
    void onClick(Integer src, View view);

}