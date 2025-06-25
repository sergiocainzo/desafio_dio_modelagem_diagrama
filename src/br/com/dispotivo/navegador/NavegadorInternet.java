package br.com.dispotivo.navegador;

public interface NavegadorInternet {

    // Interface para Nova Aba
    public void exibirNovaAba(String url);

    // Interface para Adicionar Nova Aba
    public void adicionarNovaAba();

    // Interface para Atualizar Aba
    public void atualizarPagina();

    // Interface para Fechar Aba
    public void fecharAba();
}
