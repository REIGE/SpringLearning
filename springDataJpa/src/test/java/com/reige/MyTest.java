package com.reige;

import org.junit.Test;

/**
 * Created by REIGE on 2017/10/23.
 */
public class MyTest {

    @Test
    public void FindTest() {
        int[][] ints = new int[5][5];

        ints[0][0] = 1;
        ints[0][1] = 2;
        ints[0][2] = 3;
        ints[0][3] = 4;
        ints[0][4] = 5;

        ints[1][0] = 6;
        ints[1][1] = 7;
        ints[1][2] = 8;
        ints[1][3] = 9;
        ints[1][4] = 10;

        ints[2][0] = 11;
        ints[2][1] = 12;
        ints[2][2] = 13;
        ints[2][3] = 14;
        ints[2][4] = 15;

        ints[3][0] = 16;
        ints[3][1] = 17;
        ints[3][2] = 18;
        ints[3][3] = 19;
        ints[3][4] = 20;
        ints[4][0] = 21;
        ints[4][1] = 22;
        ints[4][2] = 23;
        ints[4][3] = 24;
        ints[4][4] = 25;
        boolean result = Find(ints, 1);
    }

    public boolean Find(int[][] array, int target) {

        for (int i = 0; i < array.length; i++) {
            int low = 0;
            int high = array[i].length - 1;
            while (low <= high) {
                int mid = (low + high) / 2;
                if (target > array[i][mid])
                    low = mid + 1;
                else if (target < array[i][mid])
                    high = mid - 1;
                else
                    return true;
            }
        }
        return false;
    }

    @Test
    public void findAll(){
        System.out.println(getFactorial(4));
    }

    public int getFactorial(int v) {
        return v == 0 ? 1 : v * getFactorial(v - 1);
    }

}
