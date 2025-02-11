public class TesteIphone {
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();

        // Testando o Reprodutor Musical
        meuIphone.tocar();
        meuIphone.selecionarMusica("Wainting for the End - Linkin Park");
        meuIphone.pausar();

        // Testando o Aparelho Telefônico
        meuIphone.ligar("988888888");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Testando o Navegador de Internet
        meuIphone.exibirPagina("https://www.google.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
