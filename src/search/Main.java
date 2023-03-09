package search;

import ArrayUtil.RandomArray;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        long start, end = 0;

        RandomArray.newInstance().randomValue();
        int searchData = RandomArray.newInstance().getRandomValue().get(1400);


        System.out.println("[SequentialSearch]");
        SequentialSearch sequentialSearch = new SequentialSearch();

        start = System.currentTimeMillis();
        System.out.println("Result : "+sequentialSearch.sequentialSearch(RandomArray.newInstance().getRandomValue(),searchData));
        end = System.currentTimeMillis();
        System.out.println("[시간] : "+(end - start)/1000.0);


        System.out.println("[binarySearch]");
        BinarySearch binarySearch = new BinarySearch();

        ArrayList<Integer> binarySearchTestData = RandomArray.newInstance().getRandomValue();
        Collections.sort(binarySearchTestData);


        start = System.currentTimeMillis();
        System.out.println("Result : "+binarySearch.binarySearch(binarySearchTestData,searchData));
        end = System.currentTimeMillis();
        System.out.println("[시간] : "+(end - start)/1000.0);
    }
}
