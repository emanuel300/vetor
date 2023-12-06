package application;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        System.out.print("Tamnho do vetor: ");
        int n = ler.nextInt();
        double[] vector = new double[n];

        for (int i = 0; i < n; i++){
            System.out.print("Altura-" + i + ": " );
            vector[i] = ler.nextDouble();
        }

        double sum = 0;
        for(int i = 0; i < n; i++){
            sum += vector[i];
        }

        double media = sum / n;

        System.out.printf("RESULTADO DA MEDIA: %.2f%n", media );



        ler.close();
    }
}
