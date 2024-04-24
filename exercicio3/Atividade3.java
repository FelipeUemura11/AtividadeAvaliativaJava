import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Atividade3 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        List<contaBancaria> contas = new ArrayList<>();
        int opcao = 0;

        System.out.print("Informe o numero da conta: ");
        int numeroConta = input.nextInt();
        input.nextLine();

        System.out.print("Informe o nome do titular: ");
        String nomeTitular = input.nextLine();

        contas.add(new contaBancaria(numeroConta, nomeTitular));
        
        System.out.println("1 - Fazer deposito");
        System.out.println("2 - Fazer Saque");
        System.out.println("3 - Fazer consulta");
        System.out.println("4 - Sair.");

        System.out.print("Escolha uma das opcoes(1 - 4): ");
        opcao = input.nextInt();

        while(opcao != 4){
            input.nextLine();
            switch(opcao){
                case 1:
                    System.out.print("Deposite a quantia em reais: ");
                    contas.get(0).depositar(input.nextDouble());
                    break;
                case 2:
                    System.out.print("Saque aquantia que deseja: ");
                    contas.get(0).saque(input.nextDouble());
                    break;
                case 3:
                    System.out.print("Verifique o saldo: ");
                    contas.get(0).consulta();
                    break;
                case 4:
                    break;
                default:
                    System.out.print("Opcao Invalida! tente novamente");
            }
            System.out.print("Escolha uma das opcoes(1 - 4): ");
            opcao = input.nextInt();
        }
        System.out.println("Saindo do programa...");
    }
}
