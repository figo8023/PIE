package com.figo.lc.alg1;

import java.util.HashMap;
import java.util.Map;


public class Solutions {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            int x = numbers[i];
            if (map.containsKey(target - x)) {
                return new int[] { map.get(target - x) + 1, i + 1 };
            }
            map.put(x, i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    
    public static void main(String[] args){
        int[] numbers = {3,5,7,9,10,23};
        int target = 32;
        Solutions solutions = new Solutions();
        int[] results = solutions.twoSum(numbers, target);
        System.out.println(results);
    }
}
