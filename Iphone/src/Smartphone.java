public class Smartphone implements AparelhoTelefonico, NavegadorNaInternet, ReprodutorMusical {

    @Override
    public void tocar() {

        System.out.println("Tocando a música");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a música");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionado a música");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo a página na internet");
    }

    @Override
    public void adicionarNovaAba() {

        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando para um número de telefone");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo o telefone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz");
    }
}
