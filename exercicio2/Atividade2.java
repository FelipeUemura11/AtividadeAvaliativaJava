import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Atividade2 {
    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        List<Livro> livros = new ArrayList<>();
        int opcao = 0;

        while(opcao != 3){
            System.out.println("[1] Adicionar um livro");
            System.out.println("[2] Exibir livro");
            System.out.println("[3] Sair do programa");

            System.out.print("Escolha uma opcao(1-3): ");
            opcao = input.nextInt();

            switch(opcao){
                case 1:
                    System.out.print("Informe o id do livro: ");
                    int id = input.nextInt();
                    input.nextLine();

                    System.out.print("Informe o nome do livro: ");
                    String titulo = input.nextLine();
                    
                    System.out.print("Informe o autor do livro: ");
                    String autor = input.nextLine();

                    System.out.print("Informe o ano do livro: ");
                    int ano = input.nextInt();

                    livros.add(new Livro(id, titulo, autor, ano));
                    break;
                case 2:
                    System.out.print("Digite o id do livro que deseje exibir: ");
                    int idExibir = input.nextInt();

                    for (Livro livro : livros) {
                        if (livro.getId() == idExibir) {
                            System.out.println(livro.exibirInfo());
                        }
                    }
                case 3:
                    break;
                default:
                    System.out.println("Opcao invalida! Tente novamente.");
            }
        }
        System.out.println("Encerrando o programa...");

    }
}
