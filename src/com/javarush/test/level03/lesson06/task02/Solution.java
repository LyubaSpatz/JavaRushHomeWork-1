package com.javarush.test.level03.lesson06.task02;

/* Таблица умножения
Выведи на экран надпись: таблицу умножения 10 на 10:
1 2 3 …
2 4 6 …
3 6 9 …
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        //Напишите тут ваш код
        final int count = 10;
        for (int i = 0; i < count; i++)
        {
            for (int j = 0; j < count; j++)
            {
                System.out.printf("%d ",(i+1) * (j+1));
            }
            System.out.println();
        }
    }
}