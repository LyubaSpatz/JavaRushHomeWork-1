package com.javarush.test.level08.lesson08.task02;

import java.util.HashSet;
import java.util.Set;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution
{
    public static HashSet<Integer> createSet()
    {
        //напишите тут ваш код
        HashSet<Integer> result = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            result.add(i);
        }
        return result;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {
        //напишите тут ваш код
        HashSet<Integer> temp = new HashSet<>();
        for (Integer integer : set) {
            if (integer > 10) {
                temp.add(integer);
            }
        }
        set.removeAll(temp);
        return set;
    }

    public static void main(String[] args) {
        HashSet<Integer> set = createSet();
        removeAllNumbersMoreThan10(set);
    }

}

