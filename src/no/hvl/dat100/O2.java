package no.hvl.dat100;

import java.util.Scanner;

public class O2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            boolean valid = false;

            while (!valid) {
                try {

                    System.out.print("Student-" + (i+1) + " - Poeng: ");
                    int points = Integer.parseInt(input.nextLine());


                    if (points > 0 && points <= 100) {
                        sum += points;
                        valid = true;

                        getGrade(points);
                    } else {
                        System.out.println("Ikke gyldig poeng skår");
                    }

                } catch (Exception error ) {
                    System.out.println("you absolute donkey why u input invalid input.... error " + error.getMessage());
                    valid = false;
                }
            }
        }

        if((sum / 10) >= 0) {
            getGrade(sum/10);
        } else {
            System.out.println("Ikke gyldig Poeng skår");
        }

        input.close();
    }

    public static void getGrade(int point) {
        if (point < 40) {
            System.out.println("Karakter: F");
        } else if (point < 50) {
            System.out.println("Karakter: E");
        } else if (point < 60) {
            System.out.println("Karakter: D");
        } else if (point < 80) {
            System.out.println("Karakter: C");
        } else if (point < 90) {
            System.out.println("Karakter: B");
        } else if (point <= 100) {
            System.out.println("Karakter: A");
        } else {
            System.out.println("Ikke gyldig Poeng skår");
        }
    }
}
