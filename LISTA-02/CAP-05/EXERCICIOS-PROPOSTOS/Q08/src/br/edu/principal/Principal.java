package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pessoasAcimaDe50EComPesoInferiorA60 = 0;
        int somaIdadesComAlturaInferiorA150 = 0;
        int pessoasComOlhosAzuis = 0;
        int pessoasRuivasSemOlhosAzuis = 0;

        int totalPessoas = 6;
        int pessoasComAlturaInferiorA150 = 0;

        for (int i = 1; i <= totalPessoas; i++) {
            System.out.println("Pessoa " + i + ":");
            System.out.print("Digite a idade: ");
            int idade = scanner.nextInt();
            System.out.print("Digite o peso: ");
            double peso = scanner.nextDouble();
            System.out.print("Digite a altura: ");
            double altura = scanner.nextDouble();
            System.out.print("Digite a cor dos olhos (A - azul, P - preto, V - verde, C - castanho): ");
            String corOlhos = scanner.next();
            System.out.print("Digite a cor dos cabelos (P - preto, C - castanho, L - louro, R - ruivo): ");
            String corCabelos = scanner.next();

            if (idade > 50 && peso < 60) {
                pessoasAcimaDe50EComPesoInferiorA60++;
            }

            if (altura < 1.50) {
                somaIdadesComAlturaInferiorA150 += idade;
                pessoasComAlturaInferiorA150++;
            }

            if (corOlhos.equals("A")) {
                pessoasComOlhosAzuis++;
            }

            if (corCabelos.equals("R") && !corOlhos.equals("A")) {
                pessoasRuivasSemOlhosAzuis++;
            }
        }

        double mediaIdadeComAlturaInferiorA150 = 0;
        if (pessoasComAlturaInferiorA150 > 0) {
            mediaIdadeComAlturaInferiorA150 = (double) somaIdadesComAlturaInferiorA150 / pessoasComAlturaInferiorA150;
        }

        double porcentagemOlhosAzuis = (double) pessoasComOlhosAzuis / totalPessoas * 100;

        System.out.println("Quantidade de pessoas com idade superior a 50 anos e peso inferior a 60 kg: " + pessoasAcimaDe50EComPesoInferiorA60);
        System.out.println("Média das idades das pessoas com altura inferior a 1,50 m: " + mediaIdadeComAlturaInferiorA150);
        System.out.println("Porcentagem de pessoas com olhos azuis: " + porcentagemOlhosAzuis + "%");
        System.out.println("Quantidade de pessoas ruivas e que não possuem olhos azuis: " + pessoasRuivasSemOlhosAzuis);
    }
}