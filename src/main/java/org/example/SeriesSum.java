package org.example;

import java.util.Scanner;

public class SeriesSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Read the integer N (> 2)
        System.out.print("Введите целое число N (> 2): ");
        int N = scanner.nextInt();

        // Define the precision levels
        double[] precisions = {1e-3, 1e-4, 1e-5, 1e-6};

        // Print table header
        System.out.printf("%-15s %-15s %-15s%n", "Precision", "Sum", "Terms Count");

        // Calculate series sum for each precision
        for (double precision : precisions) {
            double sum = 0.0;
            int termsCount = 0;
            double term;

            do {
                term = Math.pow(-1, termsCount) / (2 * termsCount + 1);
                sum += term;
                termsCount++;
            } while (Math.abs(term) >= precision);

            // Print results for this precision
            System.out.printf("%-15.0e %-15.6f %-15d%n", precision, sum, termsCount);
        }

        scanner.close();
    }
}