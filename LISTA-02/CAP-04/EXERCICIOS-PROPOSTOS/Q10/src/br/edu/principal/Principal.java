package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double custoFabrica, precoConsumidor, percentualDistribuidor, percentualImpostos;

        System.out.print("Digite o custo de fábrica do carro: ");
        custoFabrica = scanner.nextDouble();

        if (custoFabrica <= 12000) {
            percentualDistribuidor = 0.05; 
            percentualImpostos = 0.00;   
        } else if (custoFabrica > 12000 && custoFabrica <= 25000) {
            percentualDistribuidor = 0.10;  
            percentualImpostos = 0.15;      
        } else {
            percentualDistribuidor = 0.15;
            percentualImpostos = 0.20;  
        }

        precoConsumidor = custoFabrica + (custoFabrica * percentualDistribuidor) + (custoFabrica * percentualImpostos);

        System.out.printf("Custo de fábrica: R$ %.2f\n", custoFabrica);
        System.out.printf("Preço ao consumidor: R$ %.2f\n", precoConsumidor);

        scanner.close();
    }
}