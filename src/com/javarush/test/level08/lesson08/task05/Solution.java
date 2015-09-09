package com.javarush.test.level08.lesson08.task05;

import java.util.*;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        HashMap<String,String> result = new HashMap<>(10);
        for (int i = 0; i < 10; i++) {
            String si = Integer.toString(i % 2);
            result.put(String.valueOf((i)),si);
        }
        return result;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        //напишите тут ваш код
        HashMap<String,List<String>> names = new HashMap<>();
        for (Map.Entry<String, String> pair : map.entrySet()) {
            List<String> list;
            String name = pair.getValue();
            if (names.containsKey(name)) {
                list = names.get(name);
            } else {
                list = new LinkedList<>();
                names.put(name, list);
            }
            list.add(pair.getKey());
        }

        for (Map.Entry<String, List<String>> pair : names.entrySet()) {
            List<String> list = pair.getValue();
            if (list.size() > 1) {
                for (String name : list) {
                    map.remove(name);
                }
            }
        }   
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
