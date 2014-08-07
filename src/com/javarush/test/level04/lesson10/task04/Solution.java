package com.javarush.test.level04.lesson10.task04;

/* S-квадрат
Вывести на экран квадрат из 10х10 букв S используя цикл while. Буквы в одной строке не разделять.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        int count = 10;
        int row = count;
        while( row --> 0)
        {
            int col = count;
            while( col --> 0)
                System.out.print("S");
            System.out.println();
        }
    }
}
