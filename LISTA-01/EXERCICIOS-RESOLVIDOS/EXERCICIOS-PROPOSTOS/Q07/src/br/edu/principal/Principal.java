package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso da pessoa (em kg): ");
        double pesoAtual = scanner.nextDouble();

        double pesoComGanho = pesoAtual * 1.15;
        double pesoComPerda = pesoAtual * 0.80;

        System.out.println("Se engordar 15%, o novo peso será: " + pesoComGanho + " kg");
        System.out.println("Se emagrecer 20%, o novo peso será: " + pesoComPerda + " kg");

        scanner.close();
    }
}