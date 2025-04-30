package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalPessoas = 10;
        int somaIdades = 0;
        int pessoasComPesoSuperiorA90EAlturaInferiorA150 = 0;
        int pessoasComIdadeEntre10E30EAlturaSuperiorA190 = 0;
        int pessoasComAlturaSuperiorA190 = 0;

        for (int i = 1; i <= totalPessoas; i++) {
            System.out.println("Pessoa " + i + ":");
            System.out.print("Digite a idade: ");
            int idade = scanner.nextInt();
            System.out.print("Digite o peso (kg): ");
            double peso = scanner.nextDouble();
            System.out.print("Digite a altura (m): ");
            double altura = scanner.nextDouble();

            somaIdades += idade;

            if (peso > 90 && altura < 1.50) {
                pessoasComPesoSuperiorA90EAlturaInferiorA150++;
            }

            if (altura > 1.90) {
                pessoasComAlturaSuperiorA190++;
                if (idade >= 10 && idade <= 30) {
                    pessoasComIdadeEntre10E30EAlturaSuperiorA190++;
                }
            }
        }

        double mediaIdades = (double) somaIdades / totalPessoas;

        double porcentagemIdadeEntre10E30 = 0;
        if (pessoasComAlturaSuperiorA190 > 0) {
            porcentagemIdadeEntre10E30 = (double) pessoasComIdadeEntre10E30EAlturaSuperiorA190 / pessoasComAlturaSuperiorA190 * 100;
        }

        System.out.println("Média das idades: " + mediaIdades);
        System.out.println("Quantidade de pessoas com peso superior a 90kg e altura inferior a 1,50m: " + pessoasComPesoSuperiorA90EAlturaInferiorA150);
        System.out.println("Porcentagem de pessoas com idade entre 10 e 30 anos e altura superior a 1,90m: " + porcentagemIdadeEntre10E30 + "%");
    }
}