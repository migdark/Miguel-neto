import java.util.Scanner;

public class Main {
    public static void Menu() {
        System.out.println("*1* - Criar uma nova conta:");
        System.out.println("*2* - Saque");
        System.out.println("*3* - Depositar dinheiro");
        System.out.println("*4* - Mostrar Saldo");
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ContaCorrente conta;
        conta = new ContaCorrente();
        Menu();
        int opcao = scan.nextInt();

        while (opcao != 4) {
            switch (opcao) {
                case 1:
                    System.out.println("insera o tipo de conta POUPANCA/CORRENTE: ");
                    String typeConta = scan.next();

                    System.out.println("Insira a sua agencia de Preferencia: ");
                    int agencia = scan.nextInt();

                    System.out.println("Insira seu CPF: ");
                    String cpf = scan.next();

                    System.out.println("Insira a sua Senha: ");
                    String senha = scan.next();

                    conta.tipoDaConta = typeConta;
                    conta.agencia = agencia;
                    conta.cpf = cpf;
                    conta.senha = senha;

                    break;

                case 2:
                    System.out.println("Digite o Valor do Saque : ");
                    Double valorSacar = scan.nextDouble();
                    conta.sacar(valorSacar);
                    break;

                case 3:
                    System.out.println("Digite o valor do deposito: ");
                    Double valorDepositar = scan.nextDouble();
                    conta.depositar(valorDepositar);
                    break;

                case 4:
                    conta.showSaldo();
                    break;

                default:
                    System.out.println("OPÇÂO NAO ACEITA");
                    Menu();
            }
            opcao = scan.nextInt();
        }

    }
    
}
