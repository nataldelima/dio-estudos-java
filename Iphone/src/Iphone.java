public class Iphone extends Smartphone {

    public static void main(String[] args) {
        Smartphone iphone = new Smartphone();

        System.out.println("Funções do Reprodutor Musical");
        iphone.selecionarMusica();
        iphone.tocar();
        iphone.pausar();

        System.out.println("\nFunções do Navegador de Internet");
        iphone.exibirPagina();
        iphone.atualizarPagina();
        iphone.adicionarNovaAba();

        System.out.println("\nFunções do Aparelho Telefônico");
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();
    }
}
