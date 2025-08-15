package Exercicio_17;

import java.util.Locale;
import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma temperatura: ");
        double fahrenheit = sc.nextDouble();
        double celcius = (5 * ( fahrenheit -32) / 9);

        System.out.println();
        System.out.printf("Fahrenheit: %.1f° %n", fahrenheit);
        System.out.printf("Celcius: %.1f°", celcius);
        sc.close();
    }
}
