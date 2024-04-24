import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Atividade5 {
    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        List<Carro> carros = new ArrayList<>();
        int opcao = 0;

        do{
            System.out.println("[1] Adicione um carro");
            System.out.println("[2] Alterar velocidade do carro");
            System.out.println("[3] Lista de carros");
            System.out.println("[4] Sair do programa");

            System.out.print("--->Escolha uma das opcoes[1 - 4]: ");
            opcao = input.nextInt();

            switch(opcao){
                case 1:

                    System.out.print("Informe o id do carro: ");
                    int id = input.nextInt();
                    input.nextLine();

                    System.out.print("Informe a placa do carro: ");
                    String placa = input.nextLine();

                    System.out.print("Informe a marca do carro: ");
                    String marca = input.nextLine();

                    System.out.print("Informe o modelo do carro: ");
                    String modelo = input.nextLine();

                    System.out.print("Informe o ano do carro: ");
                    int ano = input.nextInt();

                    System.out.print("Informe a velocidade atual do carro: ");
                    int velocidadeAtual = input.nextInt();

                    carros.add(new Carro(id, placa, marca, modelo, ano, velocidadeAtual));
                    break;
                case 2:
                    System.out.print("-->Informe o id do carro para altera-lo: ");
                    int idAux = input.nextInt();

                    for(Carro carro : carros){
                        if(carro.getId() == idAux){
                            System.out.print("Digite (1) para acelerar ou (2) para frear o carro: ");
                            int escolha = input.nextInt();
        
                            if(escolha == 1){
                                System.out.print("Quanto deseja acelerar o carro? ");
                                double acelerar_porcento = input.nextDouble();

                                carro.setAcelerar(acelerar_porcento);

                                System.out.println("Velocidade atualizada!!!");
                                System.out.println(carro.getVelocidadeAtual());
                            }else{
                                System.out.print("Quanto deseja frear o carro? ");
                                double frear_porcento = input.nextDouble();

                                carro.setFrear(frear_porcento);

                                System.out.println("Velocidade atualizada!!!");
                                System.out.println(carro.getVelocidadeAtual());
                            }

                        }
                    }
                    break;
                case 3:

                    System.out.println("--->Lista de carros<---");
                    for(Carro carro : carros){
                        System.out.println(carro.exibirCarros());
                    }
                    break;
            }
        }while(opcao != 4);

        System.out.println("Saindo do programa...");

    }

}
