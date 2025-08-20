package Exercicio_24;

import java.util.Locale;
import java.util.Scanner;

public class CalculoCombustivel {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a velocidade média: ");
        int velocidade = sc.nextInt();
        System.out.print("Digite a distancia: ");
        double distancia = sc.nextDouble();

        double litros = distancia / 12;

        System.out.printf("Tempo de viagem (em horas): %.2f%n",  distancia / velocidade);
        System.out.println("Velocidade média (km/h): " + velocidade);
        System.out.println("Distancia percorrida: " + distancia);
        System.out.printf("Litros necessarios: %.2f", litros);

        sc.close();

    }
}
