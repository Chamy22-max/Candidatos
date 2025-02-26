package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op1, op2;
        int internet = 0, radio = 0, television = 0, candidato1 = 0, candidato2 = 0, candidato3 = 0, totalvotos = 0, votos = 0;
        int candidato1Internet = 0, candidato2Internet = 0, candidato3Internet = 0;
        int candidato1Radio = 0, candidato2Radio = 0, candidato3Radio = 0;
        int candidato1Television = 0, candidato2Television = 0, candidato3Television = 0;
        int totalcampa1 = 0, totalcampa2 = 0, totalcampa3 = 0;
        boolean retirar = true;
        while (retirar) {
            System.out.println("Escoja lo que quiere realizar:");
            System.out.println("1: Votar por Candidato 1");
            System.out.println("2: Votar por Candidato 2");
            System.out.println("3: Votar por Candidato 3");
            System.out.println("4: Vaciar las Urnas de votación");
            System.out.println("5: Número total de votos");
            System.out.println("6: Costo promedio de Campaña");
            op1 = sc.nextInt();

            switch (op1) {
                case 1:
                    System.out.println("medio de votación:");
                    System.out.println("1: Campaña internet $700000");
                    System.out.println("2: Campaña radio $200000");
                    System.out.println("3: Campaña por televisión $600000");
                    op2 = sc.nextInt();
                    if (op2 == 1) {
                        candidato1++;
                        candidato1Internet++;
                        internet++;
                        totalcampa1 += 700000;
                    } else if (op2 == 2) {
                        candidato1++;
                        candidato1Radio++;
                        radio++;
                        totalcampa1 += 200000;
                    } else if (op2 == 3) {
                        candidato1++;
                        candidato1Television++;
                        television++;
                        totalcampa1 += 600000;
                    } else {
                        System.out.println("Opción inválida");
                    }
                    totalvotos++;
                    System.out.println("Gracias por su voto");
                    break;
                case 2:
                    System.out.println("Medio de votación:");
                    System.out.println("1: Campaña internet $700000");
                    System.out.println("2: Campaña radio $200000");
                    System.out.println("3: Campaña por televisión $600000");
                    op2 = sc.nextInt();
                    if (op2 == 1) {
                        candidato2++;
                        candidato2Internet++;
                        internet++;
                        totalcampa2 += 700000;
                    } else if (op2 == 2) {
                        candidato2++;
                        candidato2Radio++;
                        radio++;
                        totalcampa2 += 200000;
                    } else if (op2 == 3) {
                        candidato2++;
                        candidato2Television++;
                        television++;
                        totalcampa2 += 600000;
                    } else {
                        System.out.println("Opción inválida");
                    }
                    totalvotos++;
                    System.out.println("Gracias por su voto");
                    break;
                case 3:
                    System.out.println("Medio de votación:");
                    System.out.println("1: Campaña internet $700000");
                    System.out.println("2: Campaña radio $200000");
                    System.out.println("3: Campaña por televisión $600000");
                    op2 = sc.nextInt();
                    if (op2 == 1) {
                        candidato3++;
                        candidato3Internet++;
                        internet++;
                        totalcampa3 += 700000;
                    } else if (op2 == 2) {
                        candidato3++;
                        candidato3Radio++;
                        radio++;
                        totalcampa3 += 200000;
                    } else if (op2 == 3) {
                        candidato3++;
                        candidato3Television++;
                        television++;
                        totalcampa3 += 600000;
                    } else {
                        System.out.println("Opción inválida");
                    }
                    totalvotos++;
                    System.out.println("Gracias por su voto");
                    break;
                case 4:
                    candidato1 = candidato2 = candidato3 = 0;
                    candidato1Internet = candidato1Radio = candidato1Television = 0;
                    candidato2Internet = candidato2Radio = candidato2Television = 0;
                    candidato3Internet = candidato3Radio = candidato3Television = 0;
                    internet = radio = television = 0;
                    totalcampa1 = totalvotos = 0;
                    totalcampa2 = totalvotos = 0;
                    totalcampa3 = totalvotos = 0;
                    System.out.println("Las urnas han sido vaciadas.");
                    break;
                case 5:
                    System.out.println("Número total de votos por candidato:");
                    System.out.println("Candidato 1: " + candidato1 + " votos");
                    System.out.println("   Votos en internet: " + candidato1Internet);
                    System.out.println("   Votos en radio: " + candidato1Radio);
                    System.out.println("   Votos en televisión: " + candidato1Television);

                    System.out.println("Candidato 2: " + candidato2 + " votos");
                    System.out.println("   Votos en internet: " + candidato2Internet);
                    System.out.println("   Votos en radio: " + candidato2Radio);
                    System.out.println("   Votos en televisión: " + candidato2Television);

                    System.out.println("Candidato 3: " + candidato3 + " votos");
                    System.out.println("   Votos en internet: " + candidato3Internet);
                    System.out.println("   Votos en radio: " + candidato3Radio);
                    System.out.println("   Votos en televisión: " + candidato3Television);
                    break;
                case 6:
                    System.out.println("Total campaña candidato 1: " + totalcampa1 + " promedio");

                    System.out.println("Total campaña candidato 2: " + totalcampa2 + " promedio");

                    System.out.println("Total campaña candidato 3: " + totalcampa3 + " promedio");

                    System.out.println("Total campaña de los 3 candidatos: " + (totalcampa3+totalcampa2+totalcampa1)/3 + " promedio");
            }
        }
    }
}
