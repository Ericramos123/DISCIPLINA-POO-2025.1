package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        double A, B, C;
        int I;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um valor para A: ");
        A = input.nextDouble();

        System.out.print("Digite um valor para B: ");
        B = input.nextDouble();

        System.out.print("Digite um valor para C: ");
        C = input.nextDouble();

        System.out.print("Digite um valor para I (1 - crescente, 2 - decrescente, 3 - maior no meio): ");
        I = input.nextInt();

        if (I == 1) {
            // Ordem crescente
            if (A <= B && B <= C) {
                System.out.println("A ordem crescente dos números é: " + A + " - " + B + " - " + C);
            } else if (A <= C && C <= B) {
                System.out.println("A ordem crescente dos números é: " + A + " - " + C + " - " + B);
            } else if (B <= A && A <= C) {
                System.out.println("A ordem crescente dos números é: " + B + " - " + A + " - " + C);
            } else if (B <= C && C <= A) {
                System.out.println("A ordem crescente dos números é: " + B + " - " + C + " - " + A);
            } else if (C <= A && A <= B) {
                System.out.println("A ordem crescente dos números é: " + C + " - " + A + " - " + B);
            } else {
                System.out.println("A ordem crescente dos números é: " + C + " - " + B + " - " + A);
            }
        } else if (I == 2) {
            // Ordem decrescente
            if (A >= B && B >= C) {
                System.out.println("A ordem decrescente dos números é: " + A + " - " + B + " - " + C);
            } else if (A >= C && C >= B) {
                System.out.println("A ordem decrescente dos números é: " + A + " - " + C + " - " + B);
            } else if (B >= A && A >= C) {
                System.out.println("A ordem decrescente dos números é: " + B + " - " + A + " - " + C);
            } else if (B >= C && C >= A) {
                System.out.println("A ordem decrescente dos números é: " + B + " - " + C + " - " + A);
            } else if (C >= A && A >= B) {
                System.out.println("A ordem decrescente dos números é: " + C + " - " + A + " - " + B);
            } else {
                System.out.println("A ordem decrescente dos números é: " + C + " - " + B + " - " + A);
            }
        } else if (I == 3) {
     
            double menor, maior, meio;
            maior = A;
            if (B > maior) maior = B;
            if (C > maior) maior = C;

            menor = A;
            if (B < menor) menor = B;
            if (C < menor) menor = C;

            if ((A != maior && A != menor) || (A == B && A != C) || (A == C && A != B)) {
                meio = A;
            } else if ((B != maior && B != menor) || (B == C && B != A)) {
                meio = B;
            } else {
                meio = C;
            }

            System.out.println("A ordem desejada (maior no meio) é: " + menor + " - " + maior + " - " + meio);
        } else {
            System.out.println("Opção inválida! Digite 1, 2 ou 3.");
        }

        input.close();
    }
}
