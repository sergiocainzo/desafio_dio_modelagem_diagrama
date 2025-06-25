package br.com.dispotivo.navegador;

public class Navegador implements NavegadorInternet {
    // Atributo
    private String urlAtual = "";

    // Getter and Setter
    public String getUrlAtual() {
        return urlAtual;
    }

    public void setUrlAtual(String urlAtual) {
        this.urlAtual = urlAtual;
    }

    // Metodos Personalizados da Interface
    // Metodo para exibir URL
    @Override // Anotação para sobescrever metodo da superclasse.
    public void exibirNovaAba(String url) {
        this.setUrlAtual(url); // Adicionando a URL
        System.out.println("Exibindo URL: " + this.getUrlAtual());
    }

    // Metodo para adicionar ABA
    @Override // Anotação para sobescrever metodo da superclasse.
    public void adicionarNovaAba() {
        // Adicionando uma nova aba em branco
        System.out.println("Nova Aba adicionada.");
    }

    // Metodo para Atualizar Pagina
    @Override // Anotação para sobescrever metodo da superclasse.
    public void atualizarPagina() {
        // Atualizando a ABA já existente
        if (this.getUrlAtual() != null && !this.getUrlAtual().isEmpty()) {
            System.out.println("Atualizando a página: " + this.getUrlAtual());
        } else {
            // Atualizando aba em branco
            System.out.println("Nenhuma página foi atualizada.");
        }
    }

    // Metodo para fechar Aba
    @Override // Anotação para sobescrever metodo da superclasse.
    public void fecharAba() {
        System.out.println("Aba fechada.");
        this.setUrlAtual("");// Limpar a URL da aba
    }

}
