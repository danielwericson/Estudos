package Exercicio_14;

import java.util.Scanner;

public class TrocaDeValores {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int valorA = sc.nextInt();
        System.out.print("Digite outro valor: ");
        int valorB = sc.nextInt();

        valorA = valorB;
        valorB = valorA;

        System.out.println();
        System.out.println("Valor A: " + valorA);
        System.out.println("Valor B: " + valorB);

        sc.close();
    }
}
