package com.javarush.test.level08.lesson11.home04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* Минимальное из N чисел
1. Ввести с клавиатуры число N.
2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
3. Найти минимальное число среди элементов списка - метод getMinimum.
*/

public class Solution
{
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        // Найти минимум

        Iterator<Integer> iter = array.iterator();
        iter.hasNext();
        int result = iter.next();
        while (iter.hasNext()) {
            int cur = iter.next();
            if (cur < result) result = cur;
        }
        return result;
    }

    public static List<Integer> getIntegerList() throws IOException {
        List<Integer> result = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i <n; i++) {
            Integer num = scanner.nextInt();
            result.add(num);
        }
        return result;
    }
}
