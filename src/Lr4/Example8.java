package Lr4;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text4encrypt; // Текст для кодирования
        int encryptKey; // Отклонение

        System.out.println("Введите текст для шифрования:");
        text4encrypt = in.nextLine();

        System.out.println("Введите ключ для шифрования:");
        encryptKey = in.nextInt();

        text4encrypt = Example8.encryptDecrypt(text4encrypt, encryptKey, true);

        System.out.println("Текст после преобразования: " + text4encrypt);

        String answer = "";
        System.out.print("Выполнить обратное преобразование? (y/n) :");

        do {
            if(!answer.equals("")) System.out.println("Введите корректный ответ!");
            answer = in.nextLine();
        }
        while(!(answer.equals("y") || answer.equals("n")));

        switch (answer) {
            case "n" -> System.out.println("До свидания!");
            case "y" -> {
                text4encrypt = Example8.encryptDecrypt(text4encrypt, encryptKey, false);
                System.out.println("Текст после преобразования: " + text4encrypt);
            }
        }
    }

    public static String encryptDecrypt(String text, int key, boolean encrypt)
    {
        char[] chars = text.toCharArray();
        int[] ints = new int[text.length()];
        int factor = encrypt ? 1 : -1; // Если true, то кодируем, если false - декодируем

        for (int i = 0; i < chars.length; i++) {
            ints[i] = chars[i] + (factor * key);
            chars[i] = (char)ints[i];
        }

        return new String(chars);
    }
}

//Напишите программу «Шифр Цезаря», которая зашифровывает
//введенный текст. Используете кодовую таблицу символов. При запуске
//программы в консоль необходимо вывести сообщение: «Введите текст для
//шифрования», после ввода текста, появляется сообщение: «Введите ключ».
//После того как введены все данные, необходимо вывести преобразованную
//строку с сообщением «Текст после преобразования : ». Далее необходимо
//задать вопрос пользователю: «Выполнить обратное преобразование? (y/n)»,
//если пользователь вводит «y», тогда выполнить обратное преобразование.
//Если пользователь вводит «n», того программа выводит сообщение «До
//свидания!». Если пользователь вводит что-то другое, отличное от «y» или «n»,
//то программа ему выводит сообщение: «Введите корректный ответ».
