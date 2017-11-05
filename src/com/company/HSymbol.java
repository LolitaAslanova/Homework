/**
 * Урок 5, задание 5
 * Распечатать 5 символов в одну строку начиная с ‘h’. Используем цикл for.
 */
package com.company;

public class HSymbol {
    public static void main(String[] args) {
        char sym = 'h';
        for (int i = 0; i < 5; i++) {
            System.out.print(sym + " ");
            sym++;
        }
    }
}
