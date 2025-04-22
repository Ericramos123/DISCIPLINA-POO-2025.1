package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1, num2, resultado;
        int opcao;

        System.out.print("Digite o primeiro número: ");
        num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        num2 = scanner.nextDouble();

        System.out.println("\nEscolha uma opção:");
        System.out.println("1 - Média entre os números");
        System.out.println("2 - Diferença do maior pelo menor");
        System.out.println("3 - Produto entre os números");
        System.out.println("4 - Divisão do primeiro pelo segundo");
        System.out.print("Opção: ");
        opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                resultado = (num1 + num2) / 2;
                System.out.printf("Média: %.2f\n", resultado);
                break;

            case 2:
                resultado = Math.abs(num1 - num2);
                System.out.printf("Diferença: %.2f\n", resultado);
                break;

            case 3:
                resultado = num1 * num2;
                System.out.printf("Produto: %.2f\n", resultado);
                break;

            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.printf("Divisão: %.2f\n", resultado);
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                }
                break;

            default:
                System.out.println("Opção inválida. Encerrando o programa.");
        }

        scanner.close();
    }
}