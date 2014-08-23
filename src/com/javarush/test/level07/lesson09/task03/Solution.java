package com.javarush.test.level07.lesson09.task03;

import java.util.ArrayList;
import java.util.Arrays;

/* Слово «именно»
1. Создай список из слов «мама», «мыла», «раму».
2. После каждого слова вставь в список строку, содержащую слово «именно».
3. Используя цикл for вывести результат на экран, каждый элемент списка с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
    String real = "именно";
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(new String[]{"мама", "мыла", "раму"}));
        for (int i = list.size() - 1; i >= 0; i--)
        {
          list.add(i + 1, real);
        }

        for (String str : list) System.out.println(str);
    }
}
