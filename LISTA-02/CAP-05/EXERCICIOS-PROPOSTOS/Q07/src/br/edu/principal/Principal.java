package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pessoasAcimaDe50 = 0;
        double somaAlturasEntre10e20 = 0;
        int pessoasComPesoInferiorA40 = 0;
        int totalPessoas = 5;

        int pessoasEntre10e20 = 0;
        
        for (int i = 1; i <= totalPessoas; i++) {
            System.out.println("Pessoa " + i + ":");
            System.out.print("Digite a idade: ");
            int idade = scanner.nextInt();
            System.out.print("Digite a altura: ");
            double altura = scanner.nextDouble();
            System.out.print("Digite o peso: ");
            double peso = scanner.nextDouble();

            if (idade > 50) {
                pessoasAcimaDe50++;
            }
            
            if (idade >= 10 && idade <= 20) {
                somaAlturasEntre10e20 += altura;
                pessoasEntre10e20++;
            }
            
            if (peso < 40) {
                pessoasComPesoInferiorA40++;
            }
        }

        double mediaAlturaEntre10e20 = 0;
        if (pessoasEntre10e20 > 0) {
            mediaAlturaEntre10e20 = somaAlturasEntre10e20 / pessoasEntre10e20;
        }

        double porcentagemPesoInferiorA40 = (double) pessoasComPesoInferiorA40 / totalPessoas * 100;

        System.out.println("Quantidade de pessoas com idade superior a 50 anos: " + pessoasAcimaDe50);
        System.out.println("Média das alturas das pessoas com idade entre 10 e 20 anos: " + mediaAlturaEntre10e20);
        System.out.println("Porcentagem de pessoas com peso inferior a 40 kg: " + porcentagemPesoInferiorA40 + "%");
    }
}