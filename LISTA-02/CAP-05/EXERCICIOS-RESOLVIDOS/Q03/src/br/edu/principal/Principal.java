package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n, num, fat;

        System.out.print("Digite a quantidade de números: ");
        n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Digite um número inteiro e positivo: ");
            num = scanner.nextInt();

            fat = 1;
            for (int j = 1; j <= num; j++) {
                fat = fat * j;
            }

            System.out.println("Número: " + num + " | Fatorial: " + fat);
        }

        scanner.close();
    }
}