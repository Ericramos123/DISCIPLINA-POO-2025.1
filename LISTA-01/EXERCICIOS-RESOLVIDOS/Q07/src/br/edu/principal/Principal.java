package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o salário base: ");
        double sal = scanner.nextDouble();
        double imp = sal * 10 / 100;
        double salreceber = sal + 50 - imp;
        System.out.println("Salário a receber = " + salreceber);
        scanner.close();
    }
}