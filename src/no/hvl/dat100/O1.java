package no.hvl.dat100;

import java.util.Scanner;

public class O1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inntekt: ");
        double salary = Double.parseDouble(input.nextLine());
        double reminding = salary;
        double tax = 0;

        while (reminding > 0) {
            if (reminding >= 934051) {
                reminding -= 934051;
                tax += reminding * (14.52 / 100);
            } else if (reminding >= 580651) {
                reminding -= 580650;
                tax += reminding * (11.52 / 100);
            } else if (reminding >= 230951) {
                reminding -= 230951;
                tax += reminding * (2.41 / 100);
            } else if (reminding >= 164101) {
                reminding -= 164100;
                tax += reminding * (0.93 / 100);
            } else {
                reminding -= reminding;
            }
        }

        System.out.println();

        System.out.println("Lønn ut: " + (salary - tax));
        System.out.println("Skatt: " + tax);

        input.close();
    }
}
