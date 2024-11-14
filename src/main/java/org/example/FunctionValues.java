package org.example;

import java.util.Scanner;

public class FunctionValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод: целое число N и вещественные точки A и B
        System.out.print("Введите целое число N (> 2): ");
        int N = scanner.nextInt();

        if (N <= 2) {
            System.out.println("N должно быть больше 2.");
            return;
        }

        System.out.print("Введите вещественное число A (A < B): ");
        double A = scanner.nextDouble();

        System.out.print("Введите вещественное число B (B > A): ");
        double B = scanner.nextDouble();

        if (A >= B) {
            System.out.println("A должно быть меньше B.");
            return;
        }

        // Вычисление шага H
        double H = (B - A) / (N - 1);

        // Вывод значений функции F в N равноотстоящих точках
        System.out.println("Значения функции F(X) в N равноотстоящих точках:");
        for (int i = 0; i < N; i++) {
            double X = A + i * H;
            double F_X = 1 - Math.sin(X);
            System.out.printf("F(%.2f) = %.4f%n", X, F_X);
        }

        scanner.close();
    }
}