package ru.yandex.practicum;

public class Practicum {
    public static void main(String[] args) {
        int[] array = {1, 2, 65, 3, 5, 7, 54, 12, 46, 4, 2};
        System.out.println("Индекс искомого элемента: " + find(array, 3));
    }

    public static int find(int[] array, int elem) {
        int index = -1;
        for (int i : array) {
            if (elem == i) {
                return elem;
            }
        }
        return index;
    }
}