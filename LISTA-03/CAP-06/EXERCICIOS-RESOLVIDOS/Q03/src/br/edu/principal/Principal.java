package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        double[] vet1 = new double[10];
        double[] vet2 = new double[10];
        double[] vet3 = new double[20];
        int j = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número do vetor 1 na posição " + i + ": ");
            vet1[i] = sc.nextDouble();
            vet3[j++] = vet1[i];

            System.out.print("Digite o número do vetor 2 na posição " + i + ": ");
            vet2[i] = sc.nextDouble();
            vet3[j++] = vet2[i];
        }



        System.out.println("\nVetor 3 (intercalado):");
        for (int i = 0; i < 20; i++) {
            System.out.println("Posição " + i + ": " + vet3[i]);
        }
    }
}
