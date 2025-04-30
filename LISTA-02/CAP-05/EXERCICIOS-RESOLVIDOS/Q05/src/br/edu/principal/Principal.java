package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numTermos, x, expoente, fim, fat, den = 1, denominador = 1;
        double s = 0;

        System.out.print("Digite o número de termos: ");
        numTermos = scanner.nextInt();

        System.out.print("Digite o valor de X (positivo): ");
        x = scanner.nextInt();

        for (int i = 1; i <= numTermos; i++) {
            fim = denominador;
            fat = 1;

            for (int j = 1; j <= fim; j++) {
                fat = fat * j;
            }

            expoente = i + 1;

            if (expoente % 2 == 0) {
                s = s - Math.pow(x, expoente) / fat;
            } else {
                s = s + Math.pow(x, expoente) / fat;
            }

            if (denominador == 4) {
                den = -1;
            }
            if (denominador == 1) {
                den = 1;
            }

            if (den == 1) {
                denominador = denominador + 1;
            } else {
                denominador = denominador - 1;
            }
        }

        System.out.printf("O valor da série é: %.6f\n", s);

        scanner.close();
    }
}