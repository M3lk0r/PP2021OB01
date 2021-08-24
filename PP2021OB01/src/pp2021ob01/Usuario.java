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
public class Usuario {

    public boolean serNotificado;

    public Usuario(boolean serNotificado) {
        this.serNotificado = serNotificado;
    }

    public Usuario() {
    }

    public boolean receberNotificacao() {
        if (this.serNotificado == true) {
            return true;
        } else {
            return false;
        }
    }
}
