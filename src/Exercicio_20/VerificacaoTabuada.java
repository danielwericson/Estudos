package Exercicio_20;

import java.util.Scanner;

public class VerificacaoTabuada {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = sc.nextInt();
        int n = 10;

        for (int i = 0; i <= n; i++){
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
