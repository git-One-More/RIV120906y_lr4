package Lr4;

import java.util.Random;

public class Example6 {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(3, 10);
        int b = random.nextInt(3, 10);
        int[][] originalArr = new int[a][b];

        System.out.println("Исходный массив: ");
        for(int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                originalArr[i][j] = random.nextInt(0, 99);
                System.out.print(originalArr[i][j] + "\t");
            }
            System.out.println();
        }

        int dela = random.nextInt(0, a-1), aa = 0;
        int delb = random.nextInt(0, b-1), bb;

        System.out.println();
        System.out.println("Удаляем строку " + dela + " столбец " + delb + ":");

        int[][] finalArr = new int[a-1][b-1];

        for(int i = 0; i < a; i++) {
            if(i == dela) continue;
            bb = 0;
            for (int j = 0; j < b; j++) {
                if(j == delb) continue;
                finalArr[aa][bb] = originalArr[i][j];
                System.out.print(finalArr[aa][bb] + "\t");
                bb++;
            }
            aa++;
            System.out.println();
        }
    }
}

//Напишите программу, в которой создается и инициализируется
//двумерный числовой массив. Затем из этого массива удаляется строка и
//столбец (создается новый массив, в котором по сравнению с исходным
//удалена одна строка и один столбец). Индекс удаляемой строки и индекс
//удаляемого столбца определяется с помощью генератора случайных чисел
