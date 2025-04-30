package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cod, numVei, numAcid;
        int maior = 0, cidMaior = 0, menor = 0, cidMenor = 0;
        int somaVei = 0, somaAcid = 0, contAcid = 0;

        for (int cont = 1; cont <= 5; cont++) {
            System.out.print("Código da cidade: ");
            cod = scanner.nextInt();

            System.out.print("Número de veículos de passeio: ");
            numVei = scanner.nextInt();

            System.out.print("Número de acidentes com vítimas: ");
            numAcid = scanner.nextInt();

            if (cont == 1) {
                maior = numAcid;
                cidMaior = cod;
                menor = numAcid;
                cidMenor = cod;
            } else {
                if (numAcid > maior) {
                    maior = numAcid;
                    cidMaior = cod;
                }
                if (numAcid < menor) {
                    menor = numAcid;
                    cidMenor = cod;
                }
            }

            somaVei += numVei;

            if (numVei < 2000) {
                somaAcid += numAcid;
                contAcid++;
            }
        }

        double mediaVei = somaVei / 5.0;

        System.out.println("Maior índice de acidentes: " + maior + " (Cidade: " + cidMaior + ")");
        System.out.println("Menor índice de acidentes: " + menor + " (Cidade: " + cidMenor + ")");
        System.out.printf("Média de veículos nas cinco cidades: %.2f\n", mediaVei);

        if (contAcid == 0) {
            System.out.println("Não foi digitada nenhuma cidade com menos de 2000 veículos.");
        } else {
            double mediaAcid = somaAcid / (double) contAcid;
            System.out.printf("Média de acidentes nas cidades com menos de 2000 veículos: %.2f\n", mediaAcid);
        }

        scanner.close();
    }
}