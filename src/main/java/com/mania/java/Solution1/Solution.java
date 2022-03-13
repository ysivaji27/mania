package com.mania.java.Solution1;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        Map<Integer, Integer> pairingMap = new HashMap<>();
        int numbefOfPairs = 0;
        for(Integer  value:ar){
            if(pairingMap.get(value)!=null){
                numbefOfPairs++;
                pairingMap.remove(value);
            }else{
                pairingMap.put(value,1);
            }
        }
        return numbefOfPairs;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        Integer[] arr = new Integer[]{1 ,1 ,3 ,1, 2 ,1 ,3, 3, 3 ,3};
        List<Integer> ar = Arrays.stream(arr).collect(toList());
        int result = Result.sockMerchant(9, ar);
        System.out.println(result);
    }
}
