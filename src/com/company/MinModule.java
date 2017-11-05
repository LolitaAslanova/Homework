/**
 * Урок 4, задание 1
 * Создать программу, которая будет выводить на экран меньшее по модулю из трёх введённых пользователем вещественных чисел.
 * Для вычисления модуля используйте тернарную условную операцию.
 */
package com.company;

import java.util.Scanner;

public class MinModule {
    public static void main(String[] args) {
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            i = i >0 ? i : i*(-1);
            System.out.println("Введите " + (i + 1) + " число: ");
            Scanner j = new Scanner(System.in);
            arr[i] = Math.abs(j.nextInt());
        }
        if (arr[0] < arr[1] && arr[0] < arr[2]) {
            System.out.println("Первое число меньше");
        } else if (arr[1] < arr[2]) {
            System.out.println("Второе число меньше");
        } else {
            System.out.println("Третье число меньше");
        }
    }
}
