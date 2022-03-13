package com.mania.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
import java.util.function.BiConsumer;

public class SortingExample {
     public static void main(String[] args) throws IOException {
        //printSorting();
       // printPrime();
       // DeQueue();
      //  bitSetProblem();

    }


    private static void bitSetProblem() {
        Scanner sc = new Scanner(System.in);
        int setSize = sc.nextInt();
        int noOps = sc.nextInt();
        BitSet[] bitSets = new BitSet[]{new BitSet(setSize), new BitSet(setSize)};
        Map<String, BiConsumer<Integer,Integer>> ops = new HashMap<>();
        ops.put("AND", (index1, index2) -> bitSets[index1-1].and(bitSets[index2-1]));
        ops.put("OR", (index1, index2) -> bitSets[index1-1].or(bitSets[index2-1]));
        ops.put("XOR", (index1, index2) -> bitSets[index1-1].xor(bitSets[index2-1]));
        ops.put("SET", (index1, index2) -> bitSets[index1-1].set(index2));
        ops.put("FLIP", (index1, index2) -> bitSets[index1-1].flip(index2));
        for (int i = 0; i < noOps; i++){
            ops.get(sc.next()).accept(sc.nextInt(), sc.nextInt());
            System.out.println(bitSets[0].cardinality() + " " + bitSets[1].cardinality());
        }
    }

    private static void DeQueue() {
        Scanner in = new Scanner(System.in);
        Deque<Integer>  deque = new ArrayDeque<>();
        Set<Integer> set = new HashSet<>();

        int n = in.nextInt();
        int m = in.nextInt();
        int max = Integer.MIN_VALUE;
        System.out.println(max);
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
            set.add(num);
            if(deque.size() == m){
               if(set.size()>max) max = set.size();
               int first = deque.remove();
               if(!deque.contains(first))
                   set.remove(first);
            }
        }

        System.out.println(max);
    }

    private static void printPrime() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        BigInteger bigInteger = new BigInteger(n);
        System.out.println(bigInteger.isProbablePrime(1) ? "prime" :"not prime");
        bufferedReader.close();
    }

    public static void printSorting(){
         /*Arrays.sort(s, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                if(o1 == null || o2 ==null ) {
                    return 0;
                }
                BigDecimal o1bd = new BigDecimal(o1);
                BigDecimal o2bd = new BigDecimal(o2);
                return o1bd.compareTo(o2bd);
            }
        });*/
        String[] s = {"9", "-100", "50", "0","56.6","90","0.12",".12","02.34","000.000"};

        Arrays.sort(s, new Comparator<String>(){
            @Override
            public int compare(String o1 , String o2){
                System.out.println(o1 +" "+ o2);
                System.out.println(Arrays.toString(s));
                BigDecimal o1bd = new BigDecimal(o1);
                BigDecimal o2bd = new BigDecimal(o2);
                System.out.println(o2bd.compareTo(o1bd));
                return o2bd.compareTo(o1bd);

            }
        });
        for (String s1 : s) {
            System.out.println(s1);
        }
    }
}
