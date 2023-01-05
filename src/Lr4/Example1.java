package Lr4;

public class Example1 {
    public static void main(String[] args) {
        int figureHeight = 23;
        int figureLength = 11;

        for (int i=0;i<figureHeight;i++){
            for (int j=0;j<figureLength; j++){
                System.out.print("+");
            }
            System.out.println();
        }
    }
}
//Напишите программу, которая выводит в консольное окно
//прямоугольник, размеры сторон которого, ширина: 23 колонки, высота: 11
//строк;