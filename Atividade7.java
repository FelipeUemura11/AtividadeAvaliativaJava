import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Atividade7 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        List<Produto> produtos = new ArrayList<>();
        int opcao = 0, quantidade = 0;

        while(opcao != 5){
            System.out.println("[1] Adicionar um novo produto");
            System.out.println("[2] Remover um produto existente");
            System.out.println("[3] Atualizar informacao de um produto");
            System.out.println("[4] Informacoes sobre os estoques");
            System.out.println("[5] Sair do programa");

            System.out.print("-->Escolha uma das opcoes: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch(opcao){
                case 1:
                    System.out.print("Informe o nome do produto novo: ");
                    String nomeProduto = scanner.nextLine();

                    System.out.print("Informe o id do produto: ");
                    int idProduto = scanner.nextInt();

                    System.out.print("Informe a quantidade do produto: ");
                    int quantProduto = scanner.nextInt();

                    System.out.print("Informe o preco do produto: ");
                    double precoProduto = scanner.nextInt();

                    produtos.add(new Produto(nomeProduto, idProduto, quantProduto, precoProduto));

                    System.out.println("!!!Item adicionado!!!");

                    break;
                case 2:
                    System.out.print("Informe o nome do produto que deseje excluir: ");
                    String nomeEx = scanner.nextLine();

                    for(int i = 0; i < produtos.size(); i++){
                        if(produtos.get(i).getNomeProduto().equals(nomeEx)){
                            produtos.remove(produtos.get(i));
                            System.out.println("Produto removido!");
                        }else{
                            System.out.println("Produto inexistente!");
                        }
                    }

                    break;
                case 3:
                    System.out.print("Informe o nome do produto que deseje atualizar: ");
                    String nomeAtulizado = scanner.nextLine();

                    for(Produto produto : produtos){
                        if(produto.getNomeProduto().equals(nomeAtulizado)){

                            System.out.println();
                            System.out.println("Nome: "+produto.getNomeProduto());
                            System.out.println("ID: "+produto.getIdProduto());
                            System.out.println("Quantidade: "+produto.getQuantProduto());
                            System.out.println("Preco: "+produto.getPrecoProduto());
                            System.out.println();

                            System.out.println("[1] Atualizar nome do item");
                            System.out.println("[2] Atualizar id do item");
                            System.out.println("[3] Atualizar quantidade do item");
                            System.out.println("[4] Atualizar preco do item");

                            System.out.print("-->Escolha uma das opcoes: ");
                            int opAtt = scanner.nextInt();
                            scanner.nextLine();

                            switch(opAtt){
                                case 1:
                                    System.out.print("Qual sera o novo nome? ");
                                    String novoNome = scanner.nextLine();

                                    produto.setNomeProduto(novoNome);

                                    System.out.println("Nome atualizado!");

                                    break;
                                case 2:
                                    System.out.print("Qual sera o novo id? ");
                                    int novoId = scanner.nextInt();

                                    produto.setIdProduto(novoId);

                                    System.out.println("ID autalizado!");

                                    break;
                                case 3:
                                    System.out.print("Quanto sera a nova quantia? ");
                                    int novoQuant = scanner.nextInt();

                                    produto.setQuantProduto(novoQuant);

                                    System.out.println("Quantidade atualizada!");

                                    break;
                                case 4:
                                    System.out.print("Qual sera o novo preco? ");
                                    double novoPreco = scanner.nextDouble();

                                    produto.setPrecoProduto(novoPreco);

                                    System.out.println("Preco Atualizado");

                                    break;
                                default:
                                    System.out.println("Opcao Invalida.");
                            }
                        }else{
                            System.out.println("Produto nao encontrado!");
                        }
                    }
                    break;
                case 4:
                    for(Produto produto : produtos){
                        System.out.println(produto.listaEstoque());
                    }
                    for(Produto produto : produtos){
                        if(produto.getIdProduto() != 0){
                            quantidade++;
                        }
                    }
                    System.out.println("->Quantidade de produtos: "+quantidade);
                    
                    break;
                case 5:
                    break;
            }

        }
        System.out.println("Saindo do programa...");

    }
}
