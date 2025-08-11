package Exercicio_3;

import java.util.Scanner;

public class Calculo_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int A = sc.nextInt();
        System.out.print("Digite outro numero: ");
        int B = sc.nextInt();

        if (A == B){
            int C = A + B;
            System.out.println("Resultado: " + C);
        } else {
            int C = A * B;
            System.out.println("Resultado: " + C);
        }
    }
}

