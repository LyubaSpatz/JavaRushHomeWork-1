package com.javarush.test.level06.lesson08.task05;

/* Класс StringHelper
Cделать класс StringHelper, у которого будут 2 статических метода:
String multiply(String s, int count) – возвращает строку повторенную count раз.
String multiply(String s) – возвращает строку повторенную 5 раз.
Пример:
Амиго -> АмигоАмигоАмигоАмигоАмиго
*/

public class StringHelper {
    public static String multiply(String s) {
        //Напишите тут ваш код
        return multiply(s, 5);
    }

    public static String multiply(String s, int count) {
        //Напишите тут ваш код
        StringBuilder builder = new StringBuilder(s.length() * count);
        for (int i = count ; i > 0; i--) {
            builder.append(s);
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        System.out.println(multiply("Амиго"));
    }
}
