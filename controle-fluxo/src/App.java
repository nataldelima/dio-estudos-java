// public class App {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         double saldo = 0;
//         double valor = 0;

//         System.out.println("=======SELECIONE UMA OPÇÃO=======");
//         System.out.println("1. Depositar");
//         System.out.println("2. Sacar");
//         System.out.println("3. Consultar Saldo");
//         System.out.println("4. Encerrar");

//         // Loop infinito para manter o programa em execução até que o usuário decida
//         // sair
//         while (true) {

//             int opcao = scanner.nextInt();
//             // TODO: Implemente as condições necessárias para avaliaa a opção escolhida:
//             // Dica: Utilze o switch/case para o programa realizar as operações escolhidas
//             // pelo usuário.

//             switch (opcao) {
//                 case 1:
//                     System.out.println("Valor a ser depositado: ");
//                     valor = scanner.nextDouble();
//                     saldo += valor;
//                     System.out.println("Saldo atual: " + saldo);
//                     break;
//                 case 2:
//                     System.out.println("Valor para Saque: ");
//                     valor = scanner.nextDouble();
//                     if (valor > saldo) {
//                         System.out.println("Saldo insuficiente!");
//                     } else {
//                         saldo -= valor;
//                         System.out.println("Valor depositado: R$" + valor);
//                     }
//                     break;
//                 case 3:
//                     System.out.println("Saldo atual:" + saldo);
//                     break;
//                 case 4:
//                     System.out.println("Finalizando");
//                     return;

//                 // Exibe mensagem de opção inválida se o usuário escolher uma opção inválida:
//                 default:
//                     System.out.println("Opção inválida. Tente novamente.");
//             }
//         }
//     }
// }

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // TODO: Inicialize um bloco try-catch para capturar exceções:
        try {

            // TODO: Leia a entrada do usuário como uma string representando o número da
            // conta:
            String numeroConta = scanner.next();

            // TODO: Chame o método verificarNumeroConta, passando o número da conta como
            // argumento:
            verificarNumeroConta(numeroConta);

            // Imprime que o número de conta é válido:
            System.out.println("Numero de conta valido.");
        } catch (IllegalArgumentException e) {
            // TODO: Capture a exceção do tipo IllegalArgumentException, que pode ser
            // lançada pelo método verificarNumeroConta:

            // Aqui é impresso uma mensagem de erro, mostrando a mensagem associada à
            // exceção:
            System.out.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    // Declaração do método verificarNumeroConta, que verifica se o número de conta
    // tem exatamente 8 dígitos:
    private static void verificarNumeroConta(String numeroConta) throws IllegalArgumentException {

        // TODO: Verifique se o número da conta tem exatamente 8 dígitos:

        // TODO: Implemente uma exceção do tipo IllegalArgumentException, caso o número
        // de conta não tenha 8 dígitos:
        if (numeroConta.length() != 8) {
            throw new verificarNumeroConta();
        }
    }
}
