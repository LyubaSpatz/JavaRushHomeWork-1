package com.javarush.test.level08.lesson08.task03;

import java.util.*;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        HashMap<String,String> result = new HashMap<>(10);
        for (int i = 0; i < 10; i++) {
            String si = Integer.toString(i);
            result.put(si,si);
        }
        return result;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        //напишите тут ваш код
        int result = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (Objects.equals(pair.getValue(), name)) result++;
        }
        return result;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {
        //напишите тут ваш код
        int result = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (Objects.equals(pair.getKey(), familiya)) result++;
        }
        return result;

    }
}
