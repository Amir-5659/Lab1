package org.example;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод натурального числа
        System.out.print("Введите натуральное число x: ");
        String x = scanner.nextLine();

        // Проверка на пустую строку или не натуральное число
        if (x.isEmpty() || !x.matches("\\d+")) {
            System.out.println("Ошибка: введите натуральное число.");
            return;
        }

        // Переворот числа
        String reversed = new StringBuilder(x).reverse().toString();

        // Удаление ведущих нулей
        reversed = reversed.replaceFirst("^0+(?!$)", "");

        // Вывод результата
        System.out.println("Число в обратном порядке: " + reversed);

        scanner.close();
    }
}