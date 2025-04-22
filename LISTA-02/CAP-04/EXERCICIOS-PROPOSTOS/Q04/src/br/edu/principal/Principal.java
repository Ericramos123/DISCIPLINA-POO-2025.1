package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1, num2, num3, maior;

        System.out.print("Digite o primeiro número: ");
        num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        num2 = scanner.nextDouble();

        System.out.print("Digite o terceiro número: ");
        num3 = scanner.nextDouble();

        maior = num1;

        if (num2 > maior) {
            maior = num2;
        }
        if (num3 > maior) {
            maior = num3;
        }

        System.out.println("O maior número é: " + maior);

        scanner.close();
    }
}