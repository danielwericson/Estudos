package Exercicio_8;

import java.util.Locale;
import java.util.Scanner;

public class VerificacaoNumero_3 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int n1 = sc.nextInt();
        System.out.println("Digite mais um numero: ");
        int n2 = sc.nextInt();
        System.out.println("Digite outro numero: ");
        int n3 = sc.nextInt();


        if(n1 > n2 && n1 > n3){
            if (n2 > n3){
                System.out.println(n1);
                System.out.println(n2);
                System.out.println(n3);
            } else {
                System.out.println(n1);
                System.out.println(n3);
                System.out.println(n2);
            }
        } else if (n2 > n1 && n2 > n3){
            if (n1 > n3){
                System.out.println(n2);
                System.out.println(n1);
                System.out.println(n3);
            } else {
                System.out.println(n2);
                System.out.println(n3);
                System.out.println(n1);
            }
        } else if (n3 > n1 && n3 > n2){
            if (n1 > n2){
                System.out.println(n3);
                System.out.println(n1);
                System.out.println(n2);
            } else {
                System.out.println(n3);
                System.out.println(n2);
                System.out.println(n1);
            }
        }

        sc.close();

    }
}
