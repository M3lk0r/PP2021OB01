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
public class NotificacaoUsuario implements Observador {

    @Override
    public String update(Usuario usuario, String acao) {
        boolean notificacao = usuario.receberNotificacao();

        if (notificacao == false) {
            return "";
        }

        String acaoNotificacao = "\n***********************************\n";
        if (acao == "addFilme") {
            acaoNotificacao += "Notificação: novo filme adicionado à Netflix!";
        } else if (acao == "addSerie") {
            acaoNotificacao += "Notificação: nova série adicionada à Netflix!";
        }

        acaoNotificacao += "\nAcesse já para conferir!\n***********************************\n";
        return acaoNotificacao;
    }
}
