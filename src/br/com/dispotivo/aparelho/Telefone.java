package br.com.dispotivo.aparelho;

public class Telefone implements AparelhoTelefonico {
    // Atributo
    private String numeroAtual = "";

    // Getter and Setter
    public String getNumeroAtual() {
        return numeroAtual;
    }

    public void setNumeroAtual(String numeroAtual) {
        this.numeroAtual = numeroAtual;
    }

    // Métodos Personalizados da Interface
    // Realizando uma chamada
    @Override // Anotação para sobescrever metodo da superclasse.
    public void ligar(String numero) {
        this.setNumeroAtual(numero); // Adicionando o número digitado
        System.out.println("Ligando para: " + this.getNumeroAtual());
    }

    // Atendendo chamada
    @Override // Anotação para sobescrever metodo da superclasse.
    public void atenderChamada() {
        System.out.println("Chamada atendida.");
    }

    // Desligando Chamada
    @Override // Anotação para sobescrever metodo da superclasse.
    public void desligarChamada() {
        System.out.println("Desligando chamada.");
        this.setNumeroAtual(""); // Limpando o numero após a chamada
    }

    // Iniciando Correio de Voz
    @Override // Anotação para sobescrever metodo da superclasse.
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }

}
