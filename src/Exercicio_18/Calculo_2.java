package Exercicio_18;

import java.util.Locale;

public class Calculo_2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);


        System.out.println("Francisco tem 1,50m e cresce 2 centímetros por ano, enquanto Sara tem 1,10m e cresce 3 centímetros por ano. \nFaça um algoritmo que calcule e imprima na tela em quantos anos serão necessários para que Francisco seja maior que Sara.");

        double franciscoAltura = 1.50;
        double saraAltura = 1.10;

        System.out.println();
        int anos = 40;
        System.out.println("Resposta: 40 \n40 * 0.02 + 1.50 -> alturaFrancisco \n40 * 0.03 + 1.10 -> alturaSara ");

        System.out.println();
        System.out.printf("Altura Francisco: %.2f%n",(anos * 0.02) + franciscoAltura);
        System.out.printf("Altura Sara: %.2f", (anos * 0.03) + saraAltura);
        System.out.println();
        System.out.println("\nSerão necessarios " + anos + " anos para que Francisco seja maior que Sara.");



    }
}
