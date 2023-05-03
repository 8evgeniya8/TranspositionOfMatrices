package Tsukanova;

import java.util.Scanner;

//        Транспонуйте матрицю M x N. Розміри M та N задаються з консолі.
//        Після введення повинні автоматично створюватися два масиви
//        розміром M x N перший та N x M другий.
public class Transposition {
    public static void main(String[]args){
                Scanner sca = new Scanner(System.in);
                System.out.println("Ввести розмір матриці");
                System.out.println("Кількість рядків");
                int userValue1 = 0;
                int userValue2 = 0;
                while (true) {
                    if (sca.hasNextInt()) {
                        userValue1 = sca.nextInt();
                        sca.nextLine();
                        break;
                    } else {
                        System.out.println("Помилка. Введіть лише число");
                        sca.nextLine();
                    }
                }
                System.out.println("Тепер кількість стовпців в матриці");
                while (true) {
                    if (sca.hasNextInt()) {
                        userValue2 = sca.nextInt();
                        sca.nextLine();
                        break;
                    } else {
                        System.out.println("Помилка. Введіть лише число");
                        sca.nextLine();
                    }
                }
                int n=userValue1;
                int m=userValue2;
                int[][] array=new int[m][n];

                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array[i].length; j++) {
                        array[i][j]=(int)(Math.random()*10);
                        System.out.print(array[i][j]+"\t");
                    }
                    System.out.println();
                }
                for (int i = 0; i < array.length; i++) {
                    for (int j = i + 1; j < array.length; j++) {
                        int temp = array[i][j];
                        array[i][j] = array[j][i];
                        array[j][i] = temp;
                    }
                }
                System.out.println("\n");
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array[i].length; j++) {
                        System.out.print(array[i][j] + "\t");
                    }
                    System.out.println();
                }
            }
        }
