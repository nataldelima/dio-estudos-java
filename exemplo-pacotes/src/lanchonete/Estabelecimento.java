package lanchonete;

import lanchonete.area.cliente.Cliente;
import lanchonete.atendimento.Atendente;
import lanchonete.atendimento.cozinha.Almoxarife;
import lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro();
        // ações que não precisam estarem disponíveis para toda a aplicação

        // ações que estabelecimento precisa ter ciência

        cozinheiro.adicionarComboNoBalcao();

        Almoxarife almoxarife = new Almoxarife();
        // ações que não precisam estarem disponíveis para toda a aplicação
        // ação que somente o seu pacote cozinha precisa conhecer (default)

        Atendente atendente = new Atendente();
        atendente.receberPagamento();
        atendente.servindoMesa();
        // ação que somente o seu pacote cozinha precisa conhecer (default)

        Cliente cliente = new Cliente();
        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();

        // já pensou os clientes ouvindo que o gás acabou ?

    }
}