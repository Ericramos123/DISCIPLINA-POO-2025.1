package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horaInicio, minutoInicio, horaFim, minutoFim, minutos;

        System.out.print("Digite a hora de início: ");
        horaInicio = sc.nextInt();
        System.out.print("Digite o minuto de início: ");
        minutoInicio = sc.nextInt();
        System.out.print("Digite a hora de término: ");
        horaFim = sc.nextInt();
        System.out.print("Digite o minuto de término: ");
        minutoFim = sc.nextInt();

        minutos = calculo(horaInicio, minutoInicio, horaFim, minutoFim);

        System.out.println("A duração do jogo foi de: " + minutos + " minutos.");
    }

    public static int calculo(int h_i, int m_i, int h_f, int m_f) {
        int tot_h, tot_m, total;

        if (m_f < m_i) {
            m_f += 60;
            h_f -= 1;
        }

        if (h_f < h_i) {
            h_f += 24;
        }

        tot_m = m_f - m_i;
        tot_h = h_f - h_i;

        total = (tot_h * 60) + tot_m;

        return total;
    }
}
