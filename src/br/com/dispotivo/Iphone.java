package br.com.dispotivo;

import br.com.dispotivo.aparelho.AparelhoTelefonico;
import br.com.dispotivo.aparelho.Telefone;
import br.com.dispotivo.navegador.Navegador;
import br.com.dispotivo.navegador.NavegadorInternet;
import br.com.dispotivo.reprodutor.Musica;
import br.com.dispotivo.reprodutor.ReprodutorMusical;

public class Iphone {

    // Atributos
    private ReprodutorMusical musica;
    private AparelhoTelefonico telefone;
    private NavegadorInternet navegador;

    // Construtor
    // O Construtor está inicializando já com as classes correspondentes de cada funcionalidade interna
    public Iphone() {
        this.musica = new Musica();
        this.telefone = new Telefone();
        this.navegador = new Navegador();
        
    }

    // Metodo Getter
    public ReprodutorMusical getMusica() {
        return musica;
    }

    public AparelhoTelefonico getTelefone() {
        return telefone;
    }

    public NavegadorInternet getNavegador() {
        return navegador;
    }

    // Metodos Personalizados
    // Metodo para ligar o aparelho
    public void ligarAparelho() {
        System.out.println("Ligando o IPhone...");
        System.out.println("Aparelho pronto para uso.");
    }

    // Metodo para desligar o aparelho
    public void desligarAparelho() {
        System.out.println("Desligando o IPhone...");
    }

    // Metodo para abrir um aplicativo
    public void abrirAplicativo(String nomeApp) {
        System.out.println("Abrindo o aplicativo: " + nomeApp);
    }

}
