package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b, c, d;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite os 4 valores do grupo " + i + ":");

            System.out.print("Valor 1: ");
            a = scanner.nextInt();
            System.out.print("Valor 2: ");
            b = scanner.nextInt();
            System.out.print("Valor 3: ");
            c = scanner.nextInt();
            System.out.print("Valor 4: ");
            d = scanner.nextInt();

            System.out.println("Grupo " + i + " na ordem lida: " + a + " " + b + " " + c + " " + d);

            if (a > b) { int temp = a; a = b; b = temp; }
            if (a > c) { int temp = a; a = c; c = temp; }
            if (a > d) { int temp = a; a = d; d = temp; }
            if (b > c) { int temp = b; b = c; c = temp; }
            if (b > d) { int temp = b; b = d; d = temp; }
            if (c > d) { int temp = c; c = d; d = temp; }

            System.out.println("Grupo " + i + " em ordem crescente: " + a + " " + b + " " + c + " " + d);

            if (a < b) { int temp = a; a = b; b = temp; }
            if (a < c) { int temp = a; a = c; c = temp; }
            if (a < d) { int temp = a; a = d; d = temp; }
            if (b < c) { int temp = b; b = c; c = temp; }
            if (b < d) { int temp = b; b = d; d = temp; }
            if (c < d) { int temp = c; c = d; d = temp; }

            System.out.println("Grupo " + i + " em ordem decrescente: " + a + " " + b + " " + c + " " + d);
            System.out.println();
        }

        scanner.close();
    }
}