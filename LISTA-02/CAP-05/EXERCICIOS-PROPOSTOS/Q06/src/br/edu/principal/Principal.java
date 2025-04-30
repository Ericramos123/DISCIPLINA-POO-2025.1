package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalAVista = 0;
        double totalAPrazo = 0;
        double valorTotal = 0;
        double valorPrimeiraPrestacao = 0;

        for (int i = 1; i <= 15; i++) {
            System.out.print("Digite o código da transação (V para à vista ou P para a prazo): ");
            String codigo = scanner.next();
            System.out.print("Digite o valor da transação: ");
            double valor = scanner.nextDouble();

            if (codigo.equalsIgnoreCase("V")) {
                totalAVista += valor;
            } else if (codigo.equalsIgnoreCase("P")) {
                totalAPrazo += valor;
            } else {
                System.out.println("Código inválido. Tente novamente.");
                i--; 
                continue;
            }

            valorTotal += valor;
        }

        if (totalAPrazo > 0) {
            valorPrimeiraPrestacao = totalAPrazo / 3; 
        }

        System.out.println("Valor total das compras à vista: R$ " + totalAVista);
        System.out.println("Valor total das compras a prazo: R$ " + totalAPrazo);
        System.out.println("Valor total das compras efetuadas: R$ " + valorTotal);
        System.out.println("Valor da primeira prestação das compras a prazo: R$ " + valorPrimeiraPrestacao);
    }
}