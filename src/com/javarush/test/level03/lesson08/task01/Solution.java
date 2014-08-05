package com.javarush.test.level03.lesson08.task01;

/* Как захватить мир
Ввести с клавиатуры число и имя, вывести на экран строку:
«имя» захватит мир через «число» лет. Му-ха-ха!
Пример: Вася захватит мир через 8 лет. Му-ха-ха!
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        System.out.print("Число: ");
        int num = Integer.parseInt(reader.readLine());
//        System.out.print("Имя: ");
        String name = reader.readLine();
        System.out.printf("%s захватит мир через %d лет. Му-ха-ха!", name, num);
    }
}