package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codigo, nht;
        double valor = 0, salMin = 450.0, salInicial, aux, salFinal;
        String turno, categoria;

        for (int cont = 1; cont <= 10; cont++) {
            System.out.print("Código do funcionário: ");
            codigo = scanner.nextInt();

            System.out.print("Número de horas trabalhadas: ");
            nht = scanner.nextInt();

            do {
                System.out.print("Turno (M, V, N): ");
                turno = scanner.next().toUpperCase();
            } while (!turno.equals("M") && !turno.equals("V") && !turno.equals("N"));

            do {
                System.out.print("Categoria (G, O): ");
                categoria = scanner.next().toUpperCase();
            } while (!categoria.equals("G") && !categoria.equals("O"));

            if (categoria.equals("G")) {
                if (turno.equals("N")) {
                    valor = salMin * 0.18;
                } else {
                    valor = salMin * 0.15;
                }
            } else {
                if (turno.equals("N")) {
                    valor = salMin * 0.13;
                } else {
                    valor = salMin * 0.10;
                }
            }

            salInicial = nht * valor;

            if (salInicial <= 300) {
                aux = salInicial * 0.20;
            } else if (salInicial < 600) {
                aux = salInicial * 0.15;
            } else {
                aux = salInicial * 0.05;
            }

            salFinal = salInicial + aux;

            System.out.println("Código: " + codigo);
            System.out.println("Horas trabalhadas: " + nht);
            System.out.printf("Valor da hora: R$ %.2f\n", valor);
            System.out.printf("Salário inicial: R$ %.2f\n", salInicial);
            System.out.printf("Auxílio alimentação: R$ %.2f\n", aux);
            System.out.printf("Salário final: R$ %.2f\n", salFinal);
            System.out.println("------------------------------");
        }

        scanner.close();
    }
}