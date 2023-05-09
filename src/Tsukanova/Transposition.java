package Tsukanova;

import java.util.Scanner;

//        Транспонуйте матрицю M x N. Розміри M та N задаються з консолі.
//        Після введення повинні автоматично створюватися два масиви
//        розміром M x N перший та N x M другий.
public class Transposition {
    public static void main(String[]args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("Ввести розмір матриці");
        System.out.println("Кількість рядків");
        int numRows;
        int numColums;
        while (true) {
            if (sca.hasNextInt()){
                numRows = sca.nextInt();
                if (numRows > 0) {
                    break;
                }
               else  {
                    System.out.println("Введи число від 0");
                    continue;
                }

            } else {
                System.out.println("Помилка.Введи число");
            }
            sca.nextLine();
        }
        System.out.println("Тепер кількість стовпців в матриці");
        while (true) {
            if (sca.hasNextInt()){
                numColums = sca.nextInt();
                if (numColums > 0) {
                    break;
                }
                else  {
                    System.out.println("Введи число від 0");
                    continue;
                }

            } else {
                System.out.println("Помилка.Введи число");
            }
            sca.nextLine();
        }

        int[][] matrix = new int[numRows][numColums];
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColums; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }
        int[][] Matrix2 = new int[numColums][numRows];
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColums; j++) {
                Matrix2[j][i] = matrix[i][j];
            }
        }

        // Print the original matrix
        System.out.println("Original Matrix:");
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColums; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Print the transposed matrix
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < numColums; i++) {
            for (int j = 0; j < numRows; j++) {
                System.out.print(Matrix2[i][j] + " ");
            }
            System.out.println();
        }
    }
}