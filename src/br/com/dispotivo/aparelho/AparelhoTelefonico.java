package br.com.dispotivo.aparelho;

public interface AparelhoTelefonico {

    // Interface para Ligar para telefone
    public void ligar(String numero);

    // Interface para Atender ligaçao
    public void atenderChamada();

    // Interface para Desligar ligação
    public void desligarChamada();

    // Interface para Correio de Voz
    public void iniciarCorreioVoz();



}
