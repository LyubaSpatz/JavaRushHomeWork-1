package com.javarush.test.level03.lesson06.task04;

/* Путь к файлу java.exe
Выведи на экран текст: полное имя файла java.exe из установленного пакета java
*/

public class Solution
{
    public static void main(String[] args)
    {
        //Напишите тут ваш код
        String path = String.format("%s\\bin\\java.exe", System.getProperty("java.home")) ;
        System.out.print(path);
    }
}