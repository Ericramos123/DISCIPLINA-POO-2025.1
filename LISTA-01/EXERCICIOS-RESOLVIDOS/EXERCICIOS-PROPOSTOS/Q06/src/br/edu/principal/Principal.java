package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário fixo do funcionário: R$ ");
        double salarioFixo = scanner.nextDouble();

        System.out.print("Digite o valor total das vendas: R$ ");
        double valorVendas = scanner.nextDouble();


        double comissao = valorVendas * 0.04;


        double salarioFinal = salarioFixo + comissao;


        System.out.printf("Comissão sobre as vendas: R$ %.2f\n", comissao);
        System.out.printf("Salário final do funcionário: R$ %.2f\n", salarioFinal);

        scanner.close();
    }
}