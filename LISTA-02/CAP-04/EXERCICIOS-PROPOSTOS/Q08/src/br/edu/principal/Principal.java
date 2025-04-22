package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salario;

        System.out.print("Digite o salário do funcionário: ");
        salario = scanner.nextDouble();

        if (salario <= 300) {
            double salarioReajustado = salario + (salario * 0.35);
            System.out.printf("Salário reajustado: R$ %.2f\n", salarioReajustado);
        } else {
            double salarioReajustado = salario + (salario * 0.15); 
            System.out.printf("Salário reajustado: R$ %.2f\n", salarioReajustado);
        }

        scanner.close();
    }
}