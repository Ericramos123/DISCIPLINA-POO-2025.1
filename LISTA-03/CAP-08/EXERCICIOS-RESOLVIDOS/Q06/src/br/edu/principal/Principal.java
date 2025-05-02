package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Digite um número de 1 a 9: ");
        n = sc.nextInt();

        if (n >= 1 && n <= 9) {
            tabelaMultiplicacao(n);
        } else {
            System.out.println("Número fora do intervalo permitido (1 a 9).");
        }
    }

    public static void tabelaMultiplicacao(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((i * j) + " ");
            }
            System.out.println();
        }
    }
}
