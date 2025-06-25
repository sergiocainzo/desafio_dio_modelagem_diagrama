import br.com.dispotivo.Iphone;

public class App {
    public static void main(String[] args) throws Exception {
        // Atributo
        Iphone dispositivo = new Iphone();

        // Ligando o aparelho
        dispositivo.ligarAparelho();

        // Testando o Reprodutor Musical
        System.out.println("\n--- Testando Reprodutor Musical ---");
        dispositivo.getMusica().selecionar("Queens of the Stone Age = No one Knows"); // Musica Selecionada
        dispositivo.getMusica().tocar(); // Iniciando a Musica selecionada
        dispositivo.getMusica().pausar(); // Pausando Musica
        dispositivo.getMusica().tocar(); // continuar a musica
        dispositivo.getMusica().selecionar("Little V - U Got That"); // Musica Selecionada
        dispositivo.getMusica().tocar(); // Iniciando a Musica selecionada

        // Testando o Aparelho Telefônico
        System.out.println("\n--- Testando Aparelho Telefônico ---");
        dispositivo.getTelefone().ligar("55 12345-6789"); // Adicionando o numero para ser discado
        dispositivo.getTelefone().atenderChamada(); // Simula um atendimento de ligação
        dispositivo.getTelefone().desligarChamada(); // Simula um desligamento de chamada
        dispositivo.getTelefone().iniciarCorreioVoz(); // Simula ligação de correio de voz

        // Testando o Navegador de Internet
        System.out.println("\n--- Testando Navegador de Internet ---");
        dispositivo.getNavegador().exibirNovaAba("https://www.google.com"); // Adicionando URL para exibição
        dispositivo.getNavegador().adicionarNovaAba(); // Simula uma adicção de Nova ABA
        dispositivo.getNavegador().atualizarPagina(); // Atualiza a página
        dispositivo.getNavegador().exibirNovaAba("https://www.youtube.com"); // Mudando a URL de exibição
        dispositivo.getNavegador().fecharAba(); // Simula o fechamento da aba

        // Desligando o aparelho
        dispositivo.desligarAparelho();
    }
}
