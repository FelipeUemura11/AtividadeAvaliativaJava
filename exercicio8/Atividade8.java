import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Atividade8 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        List<Pedido> pedidos = new ArrayList<>();
        int opcao = 0;
        float precoPizza;
        String tamanhoPizza, saborPizza;

        do{
            System.out.println("[1] Inserir novo pedido");
            System.out.println("[2] Lista de pedidos");
            System.out.println("[3] Cancelar pedido");
            System.out.println("[4] Sair do programa");

            System.out.print("--->Escolha uma das opcoes: ");
            opcao = input.nextInt();

            switch(opcao){
                case 1:

                    System.out.print("Informe o id do cliente: ");
                    int idCliente = input.nextInt();

                    System.out.println("Escolha o tamanho da pizza: ");

                    System.out.println("[1] Pequena - R$35");
                    System.out.println("[2] Media - R$50");
                    System.out.println("[3] Grande - R$75");

                    System.out.print("--->Escolha de 1 a 3: ");
                    int tamPizza = input.nextInt();

                    if(tamPizza == 1){
                        tamanhoPizza = "Pequena";
                        precoPizza = 35;
                    }else if(tamPizza == 2){
                        tamanhoPizza = "Media";
                        precoPizza = 50;
                    }else{
                        tamanhoPizza = "Grande";
                        precoPizza = 75;
                    }
                        

                    System.out.println("Informe o sabor da pizza: ");

                    System.out.println("[1] Calabresa - Ingredientes: tomate, linguica calabresa, azeite, e queijo");
                    System.out.println("[2] Portuguesa - Ingredientes: tomate, presunto, cebola, ovo cuzido e queijo");
                    System.out.println("[3] Strogonoff - Ingredientes: queijo mussarela, ovo, batata palha, requeijao e carne");
                    System.out.println("[4] Quatro Queijos - Ingredientes: queijo provolone, queijo gorgonzola, mucarela ralada e parmesao");
                    System.out.println("[5] Milho com bacon - queijo chedar, milho e bacon");

                    System.out.print("--->Escolha de 1 a 5: ");
                    int sbrPizza = input.nextInt();

                    if(sbrPizza == 1){
                        saborPizza = "Calabresa";
                    }else if(sbrPizza == 2){
                        saborPizza = "Portuguesa";
                    }else if(sbrPizza == 3){
                        saborPizza = "Strogonoff";
                    }else if(sbrPizza == 4){
                        saborPizza = "Quatro Queijos";
                    }else{
                        saborPizza = "Milho com bacon";
                    }
                    input.nextLine();
                    System.out.print("Informe o endereco do Cliente: ");
                    String endCliente = input.nextLine();
                    
                    pedidos.add(new Pedido(idCliente, saborPizza, tamanhoPizza, endCliente, precoPizza));
                    break;
                case 2:
                    System.out.println("--->Lista de pedidos<---");
                    for(Pedido pedido : pedidos){
                        System.out.println(pedido.listaPedidos());
                    }
                    break;
                case 3:
                    System.out.print("Informe o id do pedido que deseje excluir: ");
                    int idExc = input.nextInt();

                    for(int i = 0; i < pedidos.size(); i++){
                        if(pedidos.get(i).getIdCliente() == idExc){
                            pedidos.remove(pedidos.get(i));
                            System.out.println("Pedido removido!");   
                        }
                    }
                    break;
            }
        }while(opcao != 4);

        System.out.println("Saindo do programa...");

    }
}
