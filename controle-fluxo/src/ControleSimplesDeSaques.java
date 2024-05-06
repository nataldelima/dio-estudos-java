import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double limiteDiario = scanner.nextDouble();

        // TODO: Crie um loop 'for' para iterar sobre os saques:
        for (;;) {
            // TODO: Solicite ao usuário o valor do saque:
            double valorSaque = scanner.nextDouble();

            // TODO: Verifique se o valor do saque é zero, encerrando as transações:
            if (valorSaque == 0) {
                System.out.println("Transacoes encerradas.");
                break;
            }
            // Dica: Utilize um 'if/else' para verificar as condições do valorSaque e o
            // limiteDiario;
            // TODO: Se o valor do saque não ultrapassar o limite diário, subtraia o valor
            // do saque do limite diário:
            if (valorSaque > limiteDiario) {

                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
            } else {
                limiteDiario -= valorSaque;
                System.out.println("Saque realizado. Limite restante: " + limiteDiario + "\nTransacoes encerradas.");

                // TODO: Informe que o saque foi realizado e mostre o limite restante:

            }
        }

        // Fechamos o Scanner para evitar vazamento de recursos:
        scanner.close();
    }
}