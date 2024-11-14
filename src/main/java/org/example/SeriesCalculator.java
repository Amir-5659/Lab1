package org.example;

import java.util.Scanner;

public class SeriesCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Read a real number A and an integer N
        System.out.print("Enter a real number A: ");
        double A = scanner.nextDouble();
        System.out.print("Enter a positive integer N: ");
        int N = scanner.nextInt();

        // Calculate the series: 1 - A + A^2 - A^3 + ... + (-1)^N * A^N
        double sum = 0;
        for (int i = 0; i <= N; i++) {
            double term = Math.pow(-1, i) * Math.pow(A, i);
            sum += term;
        }

        // Output the result
        System.out.println("Result of the series: " + sum);

        scanner.close();
    }
}

