package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldoMedio, credito;

        System.out.print("Digite o saldo médio do cliente no último ano: ");
        saldoMedio = scanner.nextDouble();

        if (saldoMedio > 400) {
            credito = saldoMedio * 0.30; 
        } else if (saldoMedio >= 300 && saldoMedio <= 400) {
            credito = saldoMedio * 0.25;
        } else if (saldoMedio >= 200 && saldoMedio < 300) {
            credito = saldoMedio * 0.20; 
        } else {
            credito = saldoMedio * 0.10; 
        }

        System.out.printf("Saldo médio: R$ %.2f\n", saldoMedio);
        System.out.printf("Valor do crédito: R$ %.2f\n", credito);

        scanner.close();
    }
}