import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Jogador> jogadores = new ArrayList<>();
        int opcao = 0;

        do{
            System.out.println("[1] Adicionar novo jogador");
            System.out.println("[2] Consultar dados dos jogadores");
            System.out.println("[3] Atualizar jogador");
            System.out.println("[4] Sair do programa");

            System.out.print("Digite uma opcao(1 - 4): ");
            opcao = input.nextInt();

            switch(opcao){
                case 1:

                    System.out.print("Informe o numero do jogador: ");
                    int numJogador = input.nextInt();
                    input.nextLine();

                    System.out.print("Informe o nome do jogador: ");
                    String nome = input.nextLine();
        
                    System.out.print("Pontos do jogador(0 - 100): ");
                    int pontos = input.nextInt();
        
                    System.out.print("Nivel do jogador(1 - 10): ");
                    int nivel = input.nextInt();
                    
                    jogadores.add(new Jogador(numJogador, nome, pontos, nivel));
                    break;
                case 2:
                    for(Jogador jogador : jogadores){
                        System.out.println(jogador.exibirJogadores());
                    }
                    break;
                case 3:
                    System.out.print("Informe o numero do jogador para atualiza-lo: ");
                    int numAux = input.nextInt();

                    for(Jogador jogador : jogadores){
                        if(jogador.getNumJogador() == numAux){
                            System.out.println(jogador.exibirJogadores());
                            System.out.print("-->Informe a nova pontuacao do jogador: ");
                            int novaPontuacao = input.nextInt();

                            jogador.setPontos(novaPontuacao);

                            System.out.print("-->Informe o novo nivel do jogador: ");
                            int novoNivel = input.nextInt();

                            jogador.setNivel(novoNivel);

                            System.out.println("-->Dados atualizados!!!");
                            System.out.println(jogador.exibirJogadores());
                        }else{
                            System.out.println("Jogador nao encontrado!");
                        }
                    }
                    break;
                default:
                    System.out.println("Opcao Invalida! Tente novamente");
                    break;
            }

        }while(opcao != 4);

        System.out.println("Saindo do programa...");
    }
}