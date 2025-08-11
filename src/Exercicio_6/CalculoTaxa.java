package Exercicio_6;

import java.util.Locale;
import java.util.Scanner;

public class CalculoTaxa {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = sc.nextInt();
        double resultado = numero + (numero * 0.5);

        System.out.println("Reajuste: " + resultado);

    }
}

