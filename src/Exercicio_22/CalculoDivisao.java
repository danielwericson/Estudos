package Exercicio_22;

import java.util.Locale;
import java.util.Scanner;

public class CalculoDivisao {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int valorA = sc.nextInt();
        System.out.print("Digite outro numero: ");
        int valorB = sc.nextInt();

        System.out.println();
        int quociente = valorA / valorB;
        System.out.println("Quociente: " + quociente);
        int resto = valorA % valorB;
        System.out.println("Resto da divisão: " + resto);

        sc.close();

    }
}
