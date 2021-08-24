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
public class Netflix implements Observavel {

    public String acao = "";
    public Usuario usuario;

    public Netflix(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public void adicionarFilme() {
        acao = "addFilme";
        System.out.println("Adicionar filme à Netflix");
        this.notificarObserver(acao);
    }

    @Override
    public void adicionarSerie() {
        acao = "addSerie";
        System.out.println("Adicionar série à Netflix");
        this.notificarObserver(acao);
    }

    @Override
    public void notificarObserver(String acao) {
        NotificacaoUsuario notificacaoUsuario = new NotificacaoUsuario();
        System.out.println(notificacaoUsuario.update(this.usuario, acao));
    }
}
