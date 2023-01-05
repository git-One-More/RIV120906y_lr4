package Lr4;

import java.util.Random;

public class Example4 {
    public static void main(String[] args) {
        Random random = new Random();
        int figure = random.nextInt(2, 20);
        char[][] array = new char[figure][figure];

        for(int i=0;i<figure;i++){
            for(int j=0;j<figure;j++){
                array[i][j] = j<=i?'Ж':' ';
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}

//Напишите программу, в которой создается двумерный массив, который
//выводит прямоугольный треугольник
