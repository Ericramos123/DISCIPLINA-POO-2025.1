package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1, num2;
        String opcao;

        System.out.print("Digite o primeiro número: ");
        num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        num2 = scanner.nextDouble();

        System.out.println("\nEscolha uma opção:");
        System.out.println("a - O primeiro número elevado ao segundo número");
        System.out.println("b - Raiz quadrada de cada número");
        System.out.println("c - Raiz cúbica de cada número");
        System.out.print("Opção: ");
        opcao = scanner.next().toLowerCase(); 

        switch (opcao) {
            case "a":
                double potencia = Math.pow(num1, num2);
                System.out.printf("%.2f elevado a %.2f = %.2f\n", num1, num2, potencia);
                break;

            case "b":
                if (num1 >= 0 && num2 >= 0) {
                    System.out.printf("Raiz quadrada de %.2f = %.2f\n", num1, Math.sqrt(num1));
                    System.out.printf("Raiz quadrada de %.2f = %.2f\n", num2, Math.sqrt(num2));
                } else {
                    System.out.println("Erro: não é possível calcular raiz quadrada de número negativo.");
                }
                break;

            case "c":
                System.out.printf("Raiz cúbica de %.2f = %.2f\n", num1, Math.cbrt(num1));
                System.out.printf("Raiz cúbica de %.2f = %.2f\n", num2, Math.cbrt(num2));
                break;

            default:
                System.out.println("Opção inválida. Encerrando o programa.");
        }

        scanner.close();
    }
}