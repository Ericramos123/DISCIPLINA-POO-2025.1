package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double precoAntigo, precoAtual, acrescimo;

        System.out.print("Digite o preço antigo do produto: ");
        precoAntigo = sc.nextDouble();

        System.out.print("Digite o preço atual do produto: ");
        precoAtual = sc.nextDouble();

        acrescimo = calculoReajuste(precoAntigo, precoAtual);

        System.out.println("O percentual de acréscimo foi: " + acrescimo + "%");
    }

    public static double calculoReajuste(double PA, double PN) {
        double resultado;
        resultado = (100 * PN - 100 * PA) / PA;
        return resultado;
    }
}
