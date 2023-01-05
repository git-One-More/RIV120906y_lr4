package Lr4;

import java.util.Random;

public class Example5 {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(2, 10);
        int b = random.nextInt(2, 10);
        int[][] array = new int[a][b];

        System.out.println("Исходный массив: ");
        for(int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                array[i][j] = random.nextInt(0, 99);
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        // Переворачиваем массив с помощью метода
        array = Example5.reverseArray(array);

        System.out.println();
        System.out.println("'Перевёрнутый' массив: ");
        for(int i=0;i<b;i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] reverseArray(int[][] arr){
        int[][] revArr = new int[arr[0].length][arr.length];

        for(int i=0;i<arr[0].length;i++)
            for (int j = 0; j < arr.length; j++)
                revArr[i][j] = arr[j][i];

        return revArr;
    }
}

//Напишите программу, в которой создается двумерный целочисленный
//массив. Он заполняется случайными числами. Затем в этом массиве строи и
//столбцы меняются местами: первая строка становится первым столбцом,
//вторая строка становиться вторым столбцом и так далее. Например, если
//исходный массив состоял из 3 строк и 5 столбцов, то в итоге получаем массив
//из 5 строк и 3 столбцов.