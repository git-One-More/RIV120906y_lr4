package Lr4;
import java.util.Random;

public class Example7 {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(3, 10);
        int b = random.nextInt(3, 10);
        int[][] snakeArr = new int[a][b];

        // Сперва заполним массив
        for(int i = 0; i < a; i++) {
            if(i%2 == 0) {
                for (int j = 0; j < b; j++) {
                    snakeArr[i][j] = random.nextInt(1, 99); // Заполняется слева-направо
                }
            }
            else {
                for (int j = b-1; j >= 0; j--) {
                    snakeArr[i][j] = random.nextInt(-99, -1); // Заполняется справа-налево
                }
            }
        }

        // Теперь выведем
        for(int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++){
                System.out.print(snakeArr[i][j] + "\t");
            }
            System.out.println();
        }


    }
}

//Напишите программу, в которой создается двумерный числовой массив
//и этот массив заполняется «змейкой»: сначала первая строка (слева направо),
//затем последний столбец (снизу вверх), вторая строка (слева направо) и так
//далее
