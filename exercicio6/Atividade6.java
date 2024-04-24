import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Atividade6 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        List<Contato> contatos = new ArrayList<>();
        int opcao = 0;


        while(opcao != 5){
            System.out.println("[1] Adicionar um usuario");
            System.out.println("[2] Remover um usuario");
            System.out.println("[3] Buscar um usuario");
            System.out.println("[4] Lista de usuarios");
            System.out.println("[5] Sair do programa");

            System.out.print("--->Escolha uma das opcoes: ");
            opcao = input.nextInt();
            input.nextLine();

            switch(opcao){
                case 1:
                    System.out.print("Informe o nome da pessoa: ");
                    String nome = input.nextLine();
        
                    System.out.print("Informe o telefone da pessoa: ");
                    String telefone = input.nextLine();
        
                    contatos.add(new Contato(nome, telefone));
                    
                    System.out.println("Contato criado!!!");
                    break;
                case 2:
                    System.out.print("Informe o nome do contato da pessoa que deseje excluir: ");
                    String nomeAux = input.nextLine();

                    for(Contato contato : contatos){
                        if(contato.getNome().equals(nomeAux)){
                            contatos.remove(contato);
                            System.out.println("Contato removido!");
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.print("Informe o nome para a busca do contato: ");
                    String nomeTemp = input.nextLine();

                    for(Contato contato : contatos){
                        if(contato.getNome().equals(nomeTemp)){
                            System.out.println("Nome: "+contato.getNome()+" Telefone: "+contato.getTelefone());
                        }else{
                            System.out.println("Contato nao encontrado!");
                        }
                    }
                    break;
                case 4:
                    System.out.println("-->Lista de contatos<--");

                    for(Contato contato : contatos){
                        System.out.println("Name: "+contato.getNome()+" Telefone: "+contato.getTelefone());
                    }
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opcao Invalida. Tente novamente!");
            }

        }

        System.out.println("Saindo do programa!");

    }
}
