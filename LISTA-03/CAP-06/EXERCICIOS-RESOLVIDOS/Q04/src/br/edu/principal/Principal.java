package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        double[] num = new double[8];
        double[] neg = new double[8];
        double[] pos = new double[8];
        int cont_n = 0, cont_p = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 8; i++) {
            System.out.print("Digite um número para a posição " + i + " do vetor 'num': ");
            num[i] = sc.nextDouble();
            if (num[i] >= 0) {
                pos[cont_p++] = num[i];
            } else {
                neg[cont_n++] = num[i];
            }
        }

        if (cont_n == 0) {
            System.out.println("Vetor de negativos vazio.");
        } else {
            System.out.println("\nVetor de negativos:");
            for (int i = 0; i < cont_n; i++) {
                System.out.println(neg[i]);
            }
        }

        if (cont_p == 0) {
            System.out.println("Vetor de positivos vazio.");
        } else {
            System.out.println("\nVetor de positivos:");
            for (int i = 0; i < cont_p; i++) {
                System.out.println(pos[i]);
            }
        }

        sc.close();
    }
}
