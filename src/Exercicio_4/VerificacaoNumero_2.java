package Exercicio_4;

import java.util.Scanner;

public class VerificacaoNumero_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = sc.nextInt();

        System.out.println("Antecessor: " + (numero - 1));
        System.out.println("Sucessor: " + (numero + 1));


    }
}

