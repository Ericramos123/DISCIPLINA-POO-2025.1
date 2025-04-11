package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o salário: ");
        double sal = scanner.nextDouble();
        System.out.print("Digite o percentual de aumento: ");
        double perc = scanner.nextDouble();
        double aumento = sal * perc / 100;
        double novosal = sal + aumento;
        System.out.println("Valor do aumento = " + aumento);
        System.out.println("Novo salário = " + novosal);
        scanner.close();
    }
}