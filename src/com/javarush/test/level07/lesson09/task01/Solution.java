package com.javarush.test.level07.lesson09.task01;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Три массива
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2. Метод printList должен выводить на экран все элементы списка  с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //Автор тестов - мудак!
        ArrayList<Integer> init = new ArrayList<Integer>();
        ArrayList<Integer> list0 = new ArrayList<Integer>();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
//        ArrayList<Integer>[] lists = new ArrayList[]{new ArrayList<Integer>(), new ArrayList<Integer>(), new ArrayList<Integer>()};
        for (int i = 0; i < 20; i++) {
            init.add(Integer.valueOf(reader.readLine()));
        }
        for (int i = 0; i < init.size(); i++) {
            int x = init.get(i);
            boolean added;
            added = false;
            if (x % 3 == 0) {
//                lists[0].add(x);
                list0.add(x);
                added = true;
            }
            if (x % 2 == 0) {
//                lists[1].add(x);
                list1.add(x);
                added = true;
            }
            if (!added)
//                lists[2].add(x);
                list2.add(x);
        }

//        for (ArrayList<Integer> list : lists) {
            printList(list0);
            printList(list1);
            printList(list2);
//        }
    }

    public static void printList(List<Integer> list) {
        //add your code here
        for (Integer item : list) System.out.println(item);
    }
}
