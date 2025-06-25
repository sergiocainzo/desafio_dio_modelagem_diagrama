package br.com.dispotivo.reprodutor;

public class Musica implements ReprodutorMusical {

    // Atributo para selecionar a música
    private String musicaAtual;


    // Getter and Setter
    public String getMusicaAtual() {
        return musicaAtual;
    }

    public void setMusicaAtual(String musicaAtual) {
        this.musicaAtual = musicaAtual;
    }

    // Metodos Personalizados da Interface
    @Override // Anotação para sobescrever metodo da superclasse.
    public void selecionar(String musica) {
        // Adicionando o atributo ao método
        this.setMusicaAtual(musica);
        System.out.println("Música selecionada: " + this.getMusicaAtual());
    }

    @Override // Anotação para sobescrever metodo da superclasse.
    public void tocar() {

        // Verificação se a música está tocando
        if (this.getMusicaAtual() != null && !this.getMusicaAtual().isEmpty()) {
            System.out.println("Tocando: " + musicaAtual);
        } else {
            System.out.println("Nenhuma música foi selecionada para tocar.");
        }
    }

    @Override // Anotação para sobescrever metodo da superclasse.
    public void pausar() {

        // Verificando se tem música tocando.
        if (this.getMusicaAtual() != null && !this.getMusicaAtual().isEmpty()) {
            System.out.println("Música pausada.");
        }

    }


}
