package com.javarush.test.level04.lesson13.task04;

/* Рисуем линии
Используя цикл for вывести на экран:
-	горизонтальную линию из 10 восьмёрок
-	вертикальную линию из 10 восьмёрок.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        int count = 10;
        for (int i = 0; i < count; i++) {
            System.out.print("8");
        }
        System.out.println();
        for (int i = 0; i < count; i++) {
            System.out.println("8");
        }
    }
}
