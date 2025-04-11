package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();
        double area = 3.1415 * raio * raio;
        System.out.println("Área do círculo = " + area);
        scanner.close();
    }
}