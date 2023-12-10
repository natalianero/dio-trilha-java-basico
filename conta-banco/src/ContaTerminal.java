import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Solicitar ao usuário que insira o número da Conta
            System.out.print("Digite o número da Conta: ");
            int numero = scanner.nextInt();

            // Limpa o buffer do scanner
            scanner.nextLine();

            // Solicitar ao usuário que insira a agência
            System.out.print("Digite o número da Agência: ");
            String agencia = scanner.nextLine();

            // Solicitar ao usuário que insira seu nome completo
            System.out.print("Digite seu nome completo: ");
            String nome = scanner.nextLine();

            // Solicitar ao usuário que insira o saldo
            System.out.print("Digite o saldo inicial: ");
            double saldo = scanner.nextDouble();

            // Mostrar os dados inseridos pelo usuário
            System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco.");
            System.out.println("Sua agência é " + agencia + ", conta " + numero + " e seu saldo inicial é R$ " + saldo + ".");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao processar a entrada. Certifique-se de fornecer dados válidos.");
        } finally {
            // Fecha o Scanner para evitar vazamentos de recursos
            scanner.close();
        }
    }
}

