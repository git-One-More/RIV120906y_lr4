package Lr4;

public class Example2 {
    public static void main(String[] args) {
        int figure = 10;

        for(int i=0;i<figure;i++){
            for(int j=0;j<figure;j++){
                if(j>i) continue;
                System.out.print("+");
            }
            System.out.println();
        }
    }
}

//Напишите программу, которая выводит в консольное окно
//прямоугольный треугольник