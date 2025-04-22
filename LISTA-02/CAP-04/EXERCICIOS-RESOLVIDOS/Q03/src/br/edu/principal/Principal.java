package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        double num1, num2, num3, num4;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite três números em ordem crescente:");
        num1 = input.nextDouble();
        num2 = input.nextDouble();
        num3 = input.nextDouble();

        System.out.print("Digite um número (fora de ordem): ");
        num4 = input.nextDouble();

        if (num4 > num3) {
            System.out.println("A ordem decrescente é: " + num4 + " - " + num3 + " - " + num2 + " - " + num1);
        } else if (num4 > num2 && num4 < num3) {
            System.out.println("A ordem decrescente é: " + num3 + " - " + num4 + " - " + num2 + " - " + num1);
        } else if (num4 > num1 && num4 < num2) {
            System.out.println("A ordem decrescente é: " + num3 + " - " + num2 + " - " + num4 + " - " + num1);
        } else if (num4 < num1) {
            System.out.println("A ordem decrescente é: " + num3 + " - " + num2 + " - " + num1 + " - " + num4);
        } else {
            System.out.println("Número fora das condições previstas.");
        }

        input.close();
    }
}