package com.javarush.kitchen.task9;

import java.util.Arrays;

public class Solution
{
    public static int[] GetNumCountBySign(double[] arr)
    {
        int[] result = new int[3];
        for (double num : arr)
        {
            result[((int) Math.signum(num)) + 1]++;
        }
        return result;
    }

    public static void main(String[] args)
    {
        System.out.println(
                Arrays.toString(
                        GetNumCountBySign(
                                new double[]{1D, 2D, 0, -3D, 4.5})
                )
        );
    }
}
