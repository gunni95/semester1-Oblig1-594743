package no.hvl.dat100;

import java.util.Scanner;

public class O3 {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Fakultet verdi: ");
            int n = Integer.parseInt(input.nextLine());

            int sum = 1;

            if (n > 0) {
                for (int i = n; i > 0; i--) {
                    sum *= i;
                }

                System.out.println(sum);
            } else {
                System.out.println("Ikke gyldig tall");
            }
            
            input.close();
        } catch (Exception error) {
            System.out.println("Error: " + error);
        }
    }
}
