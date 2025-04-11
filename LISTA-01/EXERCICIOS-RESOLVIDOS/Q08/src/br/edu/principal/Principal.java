package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do depósito: ");
        double dep = scanner.nextDouble();
        System.out.print("Digite a taxa de juros (%): ");
        double taxa = scanner.nextDouble();
        double rend = dep * taxa / 100;
        double total = dep + rend;
        System.out.println("Rendimento = " + rend);
        System.out.println("Total após rendimento = " + total);
        scanner.close();
    }
}