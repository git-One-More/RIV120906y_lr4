package Lr4;
import java.util.Random;

public class Example3 {
    public static void main(String[] args) {
        Random random = new Random();
        int figureHeight = random.nextInt(2, 20);
        int figureLength = random.nextInt(2, 20);
        int[][] array = new int[figureHeight][figureLength];

        for(int i=0;i<figureHeight;i++){
            for(int j=0;j<figureLength;j++){
                array[i][j] = 2;
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}

//Напишите программу, в которой создается двумерный массив, который
//выводи прямоугольник из цифр 2