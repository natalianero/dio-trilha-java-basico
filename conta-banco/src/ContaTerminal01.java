import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContaTerminal01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Double> saldos = new HashMap<>();

        try {
            // Preenche alguns saldos iniciais para nomes específicos
            saldos.put("Natalia", 1000.0);
            saldos.put("Joao", 2000.0);

            // Solicitar ao usuário que insira seu nome
            System.out.print("Digite seu nome completo: ");
            String nome = scanner.nextLine();

            // Verifica se o nome está no mapa de saldos
            if (saldos.containsKey(nome)) {
                double saldoAtual = saldos.get(nome);

                // Mostrar o saldo associado ao nome
                System.out.println("Olá " + nome + ", seu saldo atual é " + saldoAtual + ".");
            } else {
                System.out.println("Nome não encontrado. Criando uma nova entrada para " + nome + ".");

                // Solicitar ao usuário que insira o saldo inicial
                System.out.print("Digite o saldo inicial: ");
                double saldoInicial = scanner.nextDouble();

                // Adiciona o novo nome e saldo ao mapa
                saldos.put(nome, saldoInicial);

                System.out.println("Conta criada com sucesso para " + nome + " com saldo inicial de " + saldoInicial + ".");
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao processar a entrada. Certifique-se de fornecer dados válidos.");
        } finally {
            // Fecha o Scanner para evitar vazamentos de recursos
            scanner.close();
        }
    }
}
