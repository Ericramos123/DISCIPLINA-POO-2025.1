package br.edu.principal;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Principal {
    public static void main(String[] args) {
        LocalDateTime dataHoraAtual = LocalDateTime.now();

        int dia = dataHoraAtual.getDayOfMonth();
        int mes = dataHoraAtual.getMonthValue();
        int ano = dataHoraAtual.getYear();

        int hora = dataHoraAtual.getHour();
        int minuto = dataHoraAtual.getMinute();

        System.out.print("Data Atual: " + dia + "/" + mes + "/" + ano + " – ");

        switch (mes) {
            case 1:
                System.out.println("janeiro");
                break;
            case 2:
                System.out.println("fevereiro");
                break;
            case 3:
                System.out.println("março");
                break;
            case 4:
                System.out.println("abril");
                break;
            case 5:
                System.out.println("maio");
                break;
            case 6:
                System.out.println("junho");
                break;
            case 7:
                System.out.println("julho");
                break;
            case 8:
                System.out.println("agosto");
                break;
            case 9:
                System.out.println("setembro");
                break;
            case 10:
                System.out.println("outubro");
                break;
            case 11:
                System.out.println("novembro");
                break;
            case 12:
                System.out.println("dezembro");
                break;
            default:
                System.out.println("Mês inválido");
        }

        System.out.println("Hora Atual: " + hora + ":" + (minuto < 10 ? "0" + minuto : minuto));
    }
}