package com.javarush.test.level03.lesson06.task01;

/* Мама мыла раму
Вывести на экран все возможные комбинации слов «Мама», «Мыла», «Раму».
Подсказка: их 6 штук. Каждую комбинацию вывести с новой строки. Слова не разделять. Пример:
МылаРамуМама
РамуМамаМыла
...
*/

public class Solution
{
    public static void main(String[] args)
    {
        //Напишите тут ваш код
        String[] data = {"Мама", "Мыла", "Раму"};
        rec(data, 0);
    }

    private static void rec(String[] data, int index)
    {
        if (index == data.length - 1)
        {
            for (String elem : data)
            {
                System.out.print(elem);
            }
            System.out.println();
        } else
        {
            for (int i = index; i < data.length; i++)
            {
                swap(data, index, i);
                rec(data, index + 1);
                swap(data, index, i);
            }
        }
    }

    private static void swap(String[] data, int index1, int index2)
    {
        if (index1 == index2)
        {
            return;
        }
        String tmp = data[index2];
        data[index2] = data[index1];
        data[index1] = tmp;
    }
}