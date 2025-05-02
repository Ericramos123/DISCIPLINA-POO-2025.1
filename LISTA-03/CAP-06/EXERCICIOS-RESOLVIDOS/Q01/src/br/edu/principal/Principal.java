package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int[] num = new int[10];
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 10 números:");

        for (int i = 0; i < 10; i++) {
            num[i] = sc.nextInt();
        }

        System.out.println("Números primos e suas posições:");
        for (int i = 0; i < 10; i++) {
            int cont = 0;
            for (int j = 1; j <= num[i]; j++) {
                if (num[i] % j == 0) {
                    cont++;
                }
            }
            if (cont == 2) {
                System.out.println("Número primo: " + num[i] + " na posição: " + i);
            }
        }

        sc.close();
    }
}
