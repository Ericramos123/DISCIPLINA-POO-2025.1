package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o salário: ");
        double sal = scanner.nextDouble();
        double novosal = sal + sal * 25 / 100;
        System.out.println("Novo salário = " + novosal);
        scanner.close();
    }
}