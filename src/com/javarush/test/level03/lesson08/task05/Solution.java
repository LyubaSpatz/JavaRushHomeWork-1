package com.javarush.test.level03.lesson08.task05;

/* Чистая любовь
Ввести с клавиатуры три имени, вывести на экран надпись:
name1 + name2 + name3 = Чистая любовь, да-да!
Пример: Вася + Ева + Анжелика = Чистая любовь, да-да!
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] names = new String[3];
        for (int i = 0; i < 3; i++)
        {
            names[i] = reader.readLine();
        }
        String plus = "";
        for (String name : names)
        {
            System.out.print(plus + name);
            plus = " + ";
        }
        System.out.print(" = Чистая любовь, да-да!");
    }
}