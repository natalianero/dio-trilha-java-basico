import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Conta {
    private String agencia;
    private int numero;
    private String nome;
    private double saldo;

    public Conta(String agencia, int numero, String nome, double saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;
    }

    public String getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double novoSaldo) {
        this.saldo = novoSaldo;
    }
}

public class ContaTerminal02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Conta> contas = new HashMap<>();

        try {
            // Preenche algumas contas iniciais
            contas.put("Natalia", new Conta("AgenciaA", 123, "Natalia", 1000.0));
            contas.put("Joao", new Conta("AgenciaB", 456, "Joao", 2000.0));

            // Solicitar ao usuário que insira seu nome
            System.out.print("Digite seu nome completo: ");
            String nome = scanner.nextLine();

            // Verifica se o nome está no mapa de contas
            if (contas.containsKey(nome)) {
                Conta contaAtual = contas.get(nome);

                // Mostrar as informações da conta associada ao nome
                System.out.println("Olá " + contaAtual.getNome() + ", sua agência é " + contaAtual.getAgencia() +
                                   ", conta " + contaAtual.getNumero() + " e seu saldo atual é " + contaAtual.getSaldo() + ".");
            } else {
                System.out.println("Conta não encontrada. Criando uma nova entrada para " + nome + ".");

                // Solicitar ao usuário que insira a agência
                System.out.print("Digite o número da Agência: ");
                String agencia = scanner.nextLine();

                // Solicitar ao usuário que insira o número da Conta
                System.out.print("Digite o número da Conta: ");
                int numero = scanner.nextInt();

                // Solicitar ao usuário que insira o saldo inicial
                System.out.print("Digite o saldo inicial: ");
                double saldoInicial = scanner.nextDouble();

                // Criar um novo objeto Conta e adicionar ao mapa
                Conta novaConta = new Conta(agencia, numero, nome, saldoInicial);
                contas.put(nome, novaConta);

                System.out.println("Conta criada com sucesso para " + nome + " com agência " + agencia +
                                   ", conta " + numero + " e saldo inicial de " + saldoInicial + ".");
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao processar a entrada. Certifique-se de fornecer dados válidos.");
        } finally {
            // Fecha o Scanner para evitar vazamentos de recursos
            scanner.close();
        }
    }
}
