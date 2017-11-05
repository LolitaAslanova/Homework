/**
 * Урок 2, задание 6
 * Создать программу, в которой вывести на консоль литералы следующих видов:
 * а) логический литерал
 * б) строковый
 * в) символьный
 * г) целочисленный 2-й
 * д) целочисленный 8-й
 * е) целочисленный 10-й
 * ж) целочисленный 16-й
 * з) литерал типа float
 * е) литерал типа double.
 */

package com.company;

public class Literaly {
    public static void main(String[] args) {
        boolean b1 = false;
        String s1 = "Hello";
        char ch1 = 'o';
        int i1 = 15, i2 = 235, i3 = 0b010010110, i4 = 0112, i5 = 0x0cccccccc;
        float f1 = 2.456f;
        double d1 = .235;
        System.out.println(b1);
        System.out.println(s1);
        System.out.println(ch1);
        System.out.println(i1 + i2);
        System.out.println(i3);
        System.out.println(i4);
        System.out.println(i5);
        System.out.println(f1);
        System.out.println(d1);
    }
}
