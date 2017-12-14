package lesson8;

/**
 * Урок 8, задание 3
 * Создать класс "Матрица". Класс должен иметь следующие поля:
 * 1) двумерный массив вещественных чисел;
 * 2) количество строк и столбцов в матрице.
 * <p>
 * Класс должен иметь следующие методы:
 * 1) сложение с другой матрицей;
 * 2) умножение на число;
 * 3) вывод на печать.
 */

public class MatrixOperations {
    int[][] Matrix = new int[2][2];


    public static void printMatrix() {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
               // System.out.println(Matrix[i][j]);
            }
        }
    }

    public static void main(String[] args) {
        printMatrix();
    }
}


