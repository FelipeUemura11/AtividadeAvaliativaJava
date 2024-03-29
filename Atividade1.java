import java.util.Scanner;

public class Atividade1 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int operacao = 0;
        
        System.out.print("Informe um numero: ");
        float num1 = input.nextFloat();

        System.out.print("Informe outro numero: ");
        float num2 = input.nextFloat();

        while(operacao != 5){
            System.out.println("[1] Fazer soma");
            System.out.println("[2] Fazer subtracao");
            System.out.println("[3] Fazer divisao");
            System.out.println("[4] Fazer multiplicacao");
            System.out.println("[5] Saida.");
    
            System.out.print("Informe qual a operacao desejada(1 a 5): ");
            operacao = input.nextInt();

            double resultado = 0;
    
            switch(operacao){
    
                case 1:
                    resultado = calculadora.adicao(num1, num2);
                    System.out.println("Resultado da soma: "+resultado);
                    break;
                case 2:
                    resultado = calculadora.subtracao(num1, num2);
                    System.out.println("Resultado da subtracao: "+resultado);
                    break;
                case 3:
                    if(num2 <= 0){
                        System.out.print("Nao foi possivel fazer a divisao por zero!\n");
                        break;
                    }else{
                        resultado = calculadora.divisao(num1, num2);
                        System.out.println("Resultado da divisao: "+resultado);
                        break;
                    }
                case 4:
                    resultado = calculadora.multiplicacao(num1, num2);
                    System.out.println("Resultado da multiplicacao: "+resultado);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Erro na digitacao tente novamente");
            }
        }
        System.out.println("Saindo do programa...");

    }
}
