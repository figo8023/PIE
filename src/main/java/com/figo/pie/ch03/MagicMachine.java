package com.figo.pie.ch03;


import java.util.Collections;

public class MagicMachine {
    /* Returns the largest integer in the array */
    private int CompareToMax(int array[], int n) {
        int curMax, i;
    /* Make sure that there is at least one element in the array. */
        if (n <= 0)
            return -1;
    /* Set the largest number so far to the first array value. */
        curMax = array[0];
    /* Compare every number with the largest number so far. */
        for (i = 1; i < n; i++) {
            if (array[i] > curMax) {
                curMax = array[i];
            }
        }
        return curMax;
    }

    /* Returns the largest integer in the array */
    private int CompareToAll(int array[], int n) {
        int i, j;
        Boolean isMax;
    /* Make sure that there is at least one element in the array. */
        if (n <= 0)
            return -1;
        for (i = n - 1; i > 0; i--) {
            isMax = true;
            for (j = 0; j < n; j++) {
    /* See if any value is greater. */
                if (array[j] > array[i])
                    isMax = false; /* array[i] is not the largest value. */
            }
    /* If isMax is true, no larger value exists; array[i] is max. */
            if (isMax) break;
        }
        return array[i];
    }

    public static void main(String[] args) {
        int[] array = {3, 6, 8, 3, 7, 4, 2, 6, 5, 2, 7, 4, 7, 9, 7, 8, 3, 6};
        int n = array.length;
        MagicMachine magicMachine = new MagicMachine();
        int max1 = magicMachine.CompareToMax(array, n);
        System.out.println(max1);
        int max2 = magicMachine.CompareToAll(array, n);
        System.out.println(max2);
    }

}
