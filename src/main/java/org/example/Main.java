package org.example;

public class Main {
    public static void main(String[] args) {
        //Инициализируем двумерный массив
        Integer[][] arr = {{0, -7, 12, 2}, {1, 7, -3, -3}, {-64, 2, 2, 0}};

        int column = arr[0].length;//Колонки
        int line = arr.length;//Строки
        Integer swap;//Для обмена элементов
        int k = 0;//Счетчик одномерного массива
        Integer[] arr_one = new Integer[column * line];//Одномерный массив для сортировки
        //Записываем элементы двурмерного массива в одномерный для сортировки
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                arr_one[k] = arr[i][j];
                k = k + 1;
            }
        }
        //Выводим в консоль одномерный массив
        for (int i = 0; i < arr_one.length; i++) {
            System.out.print(arr_one[i] + " ");
        }
        System.out.println();
        //Сортируем одномерный массив методом пузырька
        for (int i = 0; i < arr_one.length - 1; i++) {
            for (int j = 0; j < arr_one.length - i - 1; j++)
                if (arr_one[j] > arr_one[j + 1]) {
                    swap = arr_one[j];
                    arr_one[j] = arr_one[j + 1];
                    arr_one[j + 1] = swap;
                }
        }
        //Выводим отсортированный одномерный массив
        for (int i = 0; i < arr_one.length; i++) {
            System.out.print(arr_one[i] + " ");
        }
        //Заполняем отсортированный двумерный массив
        k = 0;
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = arr_one[k];
                k = k + 1;
            }
        }
        System.out.println();//Выводим отсортированный двумерный массив
        System.out.println();//Пропускаем строку для удобочитаемости
        for (Integer[] num : arr) {
            for (Integer num1 : num) {
                System.out.print(" " + num1);
            }
            System.out.println();
        }
    }
}


