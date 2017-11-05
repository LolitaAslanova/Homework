/**
 * Урок 4, задание 2
 * Имеется гирлянда, состоящая из 32 лампочек. Каждая лампочка имеет два состояния - включена или выключена.
 * В начале работы программы случайным образом задайте какие лампочки будут включены. Напишите следующие методы:
 * a) метод который будет мигать лампочками гирлянды заданное количество раз (операция ~);
 * б) метод, который будет запускать гирлянду в режим бегущей строки (операция << или >>);
 * в) метод, который будет выяснять включена ли лампочки на первой позиции (наложение маски с помощью &);
 * г) метод который будет распечатывать текущее состояние гирлянды.
 * Используйте побитовые операции. Для получения двоичного формата числа используйте метод Integer.toBinaryString(a).
 */


package com.company;

public class Girlanda {
    public static void main(String[] args) {
        String bin;
        int op1, op2, op3, op4;
        int i = (int) (Math.random() * 100000000);
        bin = Integer.toBinaryString(i);
        System.out.println("Рандомное число в 10 формате " + i);
        System.out.println("Число в 2 формате " + bin);
        op1 = ~i;
        op2 = i << 3;
        op3 = i >> 2;
        op4 = i & i;
        System.out.println("Операция тильда");
        System.out.println(Integer.toBinaryString(op1));
        System.out.println("Операция << ");
        System.out.println(Integer.toBinaryString(op2));
        System.out.println("Операция >> ");
        System.out.println(Integer.toBinaryString(op3));
        System.out.println("Операция & ");
        System.out.println(Integer.toBinaryString(op4));
    }
}