package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int segundos;
        System.out.print("Digite a quantidade de segundos: ");
        segundos = sc.nextInt();

        int[] hms = new int[3]; 
        transformacao(segundos, hms);

        System.out.println("Horas: " + hms[0]);
        System.out.println("Minutos: " + hms[1]);
        System.out.println("Segundos: " + hms[2]);
    }

    public static void transformacao(int segundos, int[] tempo) {
        tempo[0] = segundos / 3600;
        int resto = segundos % 3600;
        tempo[1] = resto / 60;
        tempo[2] = resto % 60;
    }
}
