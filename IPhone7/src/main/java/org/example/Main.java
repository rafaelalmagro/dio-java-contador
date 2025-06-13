package org.example;
public class Main {
    public static void main(String[] args) {
        MeuIpPhone7 iphone = new MeuIpPhone7();

        // Testando Reprodutor Musical
        iphone.selecionarMusica("Imagine - John Lennon");
        iphone.tocar();
        iphone.pausar();

        // Testando Aparelho Telefônico
        iphone.ligar("123456789");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        // Testando Navegador na Internet
        iphone.exibirPagina("https://www.openai.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}