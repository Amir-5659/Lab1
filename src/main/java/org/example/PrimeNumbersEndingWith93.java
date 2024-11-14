package org.example;

public class PrimeNumbersEndingWith93 {
    public static void main(String[] args) {
        int start = 194441;
        int end = 196500;
        int count = 0; // Счетчик для порядкового номера простых чисел

        System.out.printf("%-10s %-10s%n", "Номер", "Простое число");

        for (int num = start; num <= end; num++) {
            if (num % 10 == 3 && isPrime(num)) {
                count++;
                System.out.printf("%-10d %-10d%n", count, num);
            }
        }
    }

    // Метод для проверки, является ли число простым
    private static boolean isPrime(int number) {
        if (number < 2) return false; // Числа меньше 2 не простые
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Если есть делитель, число не простое
            }
        }
        return true; // Если делителей нет, число простое
    }
}