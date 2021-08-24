/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2021ob01;

/**
 *
 * @author eduar
 */
public interface Observavel {

    void adicionarFilme();

    void adicionarSerie();

    void notificarObserver(String acao);
}
