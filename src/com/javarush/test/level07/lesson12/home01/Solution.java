package com.javarush.test.level07.lesson12.home01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Вывести числа в обратном порядке
Ввести с клавиатуры 10 чисел и заполнить ими список.
Вывести их в обратном порядке.
Использовать только цикл for.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = new String[10];
        //Напишите тут ваш код
        for (int i = 0; i < 10; i++)
        {
            arr[i] = reader.readLine();

        }

        for (int i = arr.length - 1; i >= 0; i--)
        {
            System.out.println(arr[i]);
        }
    }
}
