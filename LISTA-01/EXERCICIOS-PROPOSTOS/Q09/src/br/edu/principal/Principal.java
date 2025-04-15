package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a base maior do trapézio: ");
        double baseMaior = scanner.nextDouble();

        System.out.print("Digite a base menor do trapézio: ");
        double baseMenor = scanner.nextDouble();

        System.out.print("Digite a altura do trapézio: ");
        double altura = scanner.nextDouble();

        double area = ((baseMaior + baseMenor) * altura) / 2;

        System.out.println("A área do trapézio é: " + area);

        scanner.close();
    }
}