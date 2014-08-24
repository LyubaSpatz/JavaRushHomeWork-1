package com.javarush.test.level07.lesson12.home02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Переставить M первых строк в конец списка
Ввести с клавиатуры 2 числа N  и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //Напишите тут ваш код
        int n = Integer.valueOf(reader.readLine());
        int m = Integer.valueOf(reader.readLine());
        String[] list = new String[n];
        for (int i = 0; i < n; i++)
        {
            int index = ((n - m % n) + i ) % n;
            list[index] =  reader.readLine();
        }

        for (String str: list) System.out.println(str);

    }
}
