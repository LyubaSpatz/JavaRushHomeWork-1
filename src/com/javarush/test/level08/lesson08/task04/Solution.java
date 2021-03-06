package com.javarush.test.level08.lesson08.task04;

import java.util.*;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));

        //напишите тут ваш код
        for (int i = 0; i < 9; i++) {
            map.put(String.valueOf(i), new Date(i * 10,i,i));
        }
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        //напишите тут ваш код
        HashSet<String> set = new HashSet<>();
        for (Map.Entry<String, Date> entry : map.entrySet()) {
              int month = entry.getValue().getMonth();
            if (month >= Calendar.JUNE && month <= Calendar.AUGUST) {
                set.add(entry.getKey());
            }
        }

        for (String s : set) {
            map.remove(s);
        }
    }

    public static void main(String[] args) {
        removeAllSummerPeople(createMap());
    }
}
