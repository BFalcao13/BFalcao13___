import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String Nome = "Sara Severiano";
        String TipoDeConta = "Corrente";
        double Saldo= 3000.00;;
        int continuar = 1;

        System.out.println("*************************************");
        System.out.println("\nNome do cliente: " + Nome);
        System.out.println("Tipo de conta: " + TipoDeConta);
        System.out.println("Saldo atual: " + String.format("%.2f", Saldo));
        System.out.println("\n*************************************");

        while (continuar !=4){

        Scanner leitura = new Scanner(System.in);

            String OpcoesBancarias = "\nOperações\n\n1- Consultar saldo\n2- Receber valor\n3- Transferir valor\n4- Sair";
            System.out.println(OpcoesBancarias);

            System.out.println("\nDigite a opção desejada: ");
            int opcao = leitura.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("O seu saldo é: R$" + String.format("%.2f", Saldo));
                    break;

                case 2:
                    System.out.println("Digite o valor que você deseja depositar: ");
                    double valorDepositado = leitura.nextDouble();
                    Saldo += valorDepositado;
                    System.out.println("Valor depositado: " + String.format("%.2f", valorDepositado));
                    System.out.println("O seu saldo atual é: R$" + String.format("%.2f", Saldo));
                    break;

                case 3:
                    boolean TransferenciaValida = false;
                    while (!TransferenciaValida) {
                        System.out.println("Digite o valor que você gostaria de transferir: ");
                        double valorTransferido = leitura.nextDouble();
                        if (valorTransferido <= Saldo) {
                            System.out.println("Valor transferido: " + String.format("%.2f", valorTransferido));
                            System.out.println("O seu saldo atual é: " + String.format("%.2f", Saldo -= valorTransferido));
                            TransferenciaValida = true;
                        } else {
                            System.out.println("Saldo insuficiente! Tente novamente com um novo valor!");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Saindo do programa...");
                    System.exit(0);
                    break;
            }

        }
    }
}
