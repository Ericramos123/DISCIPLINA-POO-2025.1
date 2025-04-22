package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1, num2;

        System.out.print("Digite o primeiro número: ");
        num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        num2 = scanner.nextDouble();

        if (num1 < num2) {
            System.out.println("O menor número é: " + num1);
        } else if (num2 < num1) {
            System.out.println("O menor número é: " + num2);
        } else {
            System.out.println("Os dois números são iguais.");
        }

        scanner.close();
    }
}