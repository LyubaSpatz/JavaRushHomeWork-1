package com.javarush.test.level03.lesson06.task03;

/* Семь цветов радуги
Выведи на экран текст: семь цветов радуги.
В каждой строке должно быть по три цвета, в последней - один.
Цвета разделяй пробелом.
*/


public class Solution
{
    public static void main(String[] args)
    {
        //Напишите тут ваш код
        String[] data = {"красный","оранжевый","желтый","зеленый","голубой","синий","фиолетовый"};
        for (int i = 0; i < 7; i++)
        {
            System.out.printf("%s ", data[i]);
            if (i % 3 == 2) {
                System.out.println();
            }
        }
    }
}