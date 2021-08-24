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
public class Main {

    public static void main(String[] args) {
        Usuario usuario1 = new Usuario(true);
        Netflix netflix1 = new Netflix(usuario1);
        netflix1.adicionarFilme();

        Usuario usuario2 = new Usuario(false);
        Netflix netflix2 = new Netflix(usuario2);
        netflix2.adicionarSerie();
                
        Usuario usuario3 = new Usuario(false);
        Netflix netflix3 = new Netflix(usuario2);
        netflix3.adicionarFilme();
        
        Usuario usuario4 = new Usuario(true);
        Netflix netflix4 = new Netflix(usuario2);
        netflix4.adicionarSerie();
        
        Usuario usuario5 = new Usuario(true);
        Netflix netflix5 = new Netflix(usuario2);
        netflix5.adicionarSerie();
    }

}
