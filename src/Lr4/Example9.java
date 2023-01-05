package Lr4;

import java.util.Scanner;

    public class Example9 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String text4encrypt; // Текст для кодирования
            String alphabet = "АаБбВвГгДдЕеЁёЖжЗзИиЙйКкЛлМмНнОоПпРрСсТтУуФфХхЦцЧчШшЩщЪъЫыЬьЭэЮюЯя"; // Кодировочный алфавит
            int encryptKey; // Отклонение

            System.out.println("Введите текст для шифрования:");
            text4encrypt = in.nextLine();

            System.out.println("Введите ключ для шифрования:");
            encryptKey = in.nextInt();

            text4encrypt = Example9.encryptDecrypt(text4encrypt, encryptKey, alphabet, true);

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
                    text4encrypt = Example9.encryptDecrypt(text4encrypt, encryptKey, alphabet, false);
                    System.out.println("Текст после преобразования: " + text4encrypt);
                }
            }
        }

        public static String encryptDecrypt(String text, int key, String alphabet, boolean encrypt) {
            char[] chars = text.toCharArray();
            int factor = encrypt ? 1 : -1; // Если true, то кодируем, если false - декодируем

            key = key%66; // Чтобы ключ был не больше, чем у нас символов

            for (int i = 0; i < chars.length; i++) {
                int index = alphabet.indexOf(chars[i]); // Определяем позицию символа в нашем алфавите

                if (index >= 0) {
                    // Если символ найден, то меняем на новый, определяя новый индекс
                    index = index + (key * factor);
                    if (index > alphabet.length()) index -= alphabet.length();
                    else if(index < 0) index += alphabet.length();

                    chars[i] = alphabet.charAt(index);
                }
            }

            return new String(chars);
        }
    }

//9* (дополнительная задача). Напишите программу «Шифр Цезаря», в которой
//необходимо реализовать собственный алфавит, остальные условия идентичны
//задаче 8

