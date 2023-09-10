package A_ТипыДанных_Переменные_Массивы.Arrays_Массивы;

import java.util.Arrays;

public class Arrays_Массивы {
    public static void main(String[] args) {
        // Создание массивов:
        System.out.println("Создание массивов:");
        int[] intArray = new int[5]; // Создание массива целых чисел размером 5
        // Создание массива чисел с плавающей точкой размером 10
        double[] doubleArray = new double[10];
        String[] stringArray = new String[3]; // Создание массива строк размером 3

        //Инициализация массивов:
        System.out.println("//Инициализация массивов:");
        // Инициализация массива целых чисел при создании
        int[] intArray_2 = {1, 2, 3, 4, 5};
        // Инициализация массива чисел с плавающей точкой после создания
        double[] doubleArray_2 = new double[] {1.1, 2.2, 3.3};
        String[] stringArray_2;
        // Инициализация массива строк после создания
        stringArray = new String[]{"apple", "banana", "cherry"};

        // Доступ к элементам массива:
        System.out.println("Доступ к элементам массива:");
        int[] intArray_4 = {10, 20, 30, 40, 50};
        int firstElement = intArray_4[0]; // Получение первого элемента (10)
        int thirdElement = intArray_4[2]; // Получение третьего элемента (30)

        // Длина массива:
        System.out.println("Длина массива:");
        int[] intArray_5 = {10, 20, 30, 40, 50};
        int length = intArray_5.length; // Получение длины массива (5)

        // Многомерные массивы:
        System.out.println("Многомерные массивы:");
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int element = matrix[1][2]; // Получение элемента (6)

        // Методы для работы с массивами:
        System.out.println("Методы для работы с массивами:");
        // import java.util.Arrays;

        int[] numbers = {5, 2, 9, 1, 5};
        Arrays.sort(numbers); // Сортировка массива
        int index = Arrays.binarySearch(numbers, 5); // Поиск элемента
        System.out.println(index);

    }
}
