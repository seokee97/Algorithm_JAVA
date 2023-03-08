package sort;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        long start;
        long end;


        System.out.println("[BubbleSort]");
        BubbleSort bubbleSort = new BubbleSort(RandomArray.newInstance().getRandomValue());
//        System.out.println("[정렬되기 전] : " + bubbleArray);
        start = System.currentTimeMillis();
        bubbleSort.bubbleSort();
        end = System.currentTimeMillis();
//        System.out.println("[정렬 후] : " + bubbleSort.getItems());
        System.out.println("[시간] : "+(end - start)/1000.0);


        System.out.println("\n===============================================\n");

        System.out.println("[SelectSort]");
        SelectSort selectSort = new SelectSort(RandomArray.newInstance().getRandomValue());
//        System.out.println("[정렬되기 전]:" + selectArray);
        start = System.currentTimeMillis();
        selectSort.selectSort();
        end = System.currentTimeMillis();
//        System.out.println("[정렬 후]:" + selectSort.getItems());
        System.out.println("[시간] : "+(end - start)/1000.0);


        System.out.println("\n===============================================\n");

        System.out.println("[insertSort]");
        InsertSort insertSort = new InsertSort(RandomArray.newInstance().getRandomValue());
//        System.out.println("[정렬되기 전]:" + insertArray);
        start = System.currentTimeMillis();
        insertSort.insertSort();
        end = System.currentTimeMillis();
//        System.out.println("[정렬 후]:" + insertSort.getItems());
        System.out.println("[시간] : "+(end - start)/1000.0);


        System.out.println("\n===============================================\n");

        System.out.println("[MergeSort]");
        MergeSort mergeSort = new MergeSort(RandomArray.newInstance().getRandomValue());
//        MergeSort mergeSort = new MergeSort(RandomArray.newInstance().getRandomDisplayValue());
        System.out.println("[정렬되기 전]:" + mergeSort.getItems());
        start = System.currentTimeMillis();
        mergeSort.mergeSort();
        end = System.currentTimeMillis();
        System.out.println("[정렬 후]:" + mergeSort.getItems());
        System.out.println("[시간] : "+(end - start)/1000.0);
    }

}
