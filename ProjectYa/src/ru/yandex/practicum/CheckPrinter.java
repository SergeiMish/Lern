package ru.yandex.practicum;

import java.util.Scanner;

public class CheckPrinter {
    public static void printCheck(String[] items) {
        for (String item: items) {

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество записей:");
        int n = Integer.parseInt(scanner.nextLine());
        String[] values = new String[n];
        for (int i=0; i<n; ++i)
            values[i] = scanner.nextLine();
        printCheck(values);
    }
}