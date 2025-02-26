package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op1, op2, moneda20 = 0, moneda50 = 0, moneda100 = 0, moneda200 = 0, moneda500 = 0;
        boolean retirar = true;
        while (retirar)
        {
            System.out.println("¿Qué quieres hacer?:");
            System.out.println("1: Agregar una moneda");
            System.out.println("2: Contar las monedas");
            System.out.println("3: total ahorrado");
            System.out.println("4: Romper la alcancía");
            op1 = sc.nextInt();

            switch (op1) {
                case 1:
                    System.out.println("¿Qué moneda quieres agregar?");
                    System.out.println("1: Moneda de 20");
                    System.out.println("2: Moneda de 50");
                    System.out.println("3: Moneda de 100");
                    System.out.println("4: Moneda de 200");
                    System.out.println("5: Moneda de 500");
                    op2 = sc.nextInt();
                    switch (op2) {
                        case 1:
                            moneda20++;
                            System.out.println("Agrega una moneda de 20");
                            break;
                        case 2:
                            moneda50++;
                            System.out.println("Agrega una moneda de 50");
                            break;
                        case 3:
                            moneda100++;
                            System.out.println("Agrega una moneda de 100");
                            break;
                        case 4:
                            moneda200++;
                            System.out.println("Agrega una moneda de 200");
                            break;
                        case 5:
                            moneda500++;
                            System.out.println("Agrega una moneda de 500");
                            break;
                        default:
                            System.out.println("Opción no válida.");
                            break;
                    }
                    break;

                case 2:
                    System.out.println("Tienes " + moneda20 + " monedas de 20");
                    System.out.println("Tienes " + moneda50 + " monedas de 50");
                    System.out.println("Tienes " + moneda100 + " monedas de 100");
                    System.out.println("Tienes " + moneda200 + " monedas de 200");
                    System.out.println("Tienes " + moneda500 + " monedas de 500");
                    break;

                case 3:
                    int totalDinero = (moneda20 * 20) + (moneda50 * 50) + (moneda100 * 100) +
                            (moneda200 * 200) + (moneda500 * 500);
                    System.out.println("Total ahorrado: " + totalDinero);
                    break;

                case 4:
                    moneda20 = 0;
                    moneda50 = 0;
                    moneda100 = 0;
                    moneda200 = 0;
                    moneda500 = 0;
                    System.out.println("Alcancía vaciada.");
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
    }
}
