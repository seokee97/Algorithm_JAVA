package sort;

import ArrayUtil.RandomArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        long start;
        long end;

        System.out.println("[BubbleSort]");
        BubbleSort bubbleSort = new BubbleSort(getTestItems());
//        System.out.println("[정렬되기 전] : " + bubbleSort.getItems());
        start = System.currentTimeMillis();
        bubbleSort.bubbleSort();
        end = System.currentTimeMillis();
//        System.out.println("[정렬 후] : " + bubbleSort.getItems());
        System.out.println("[시간] : "+(end - start)/1000.0);


        System.out.println("\n===============================================\n");

        System.out.println("[SelectSort]");
        SelectSort selectSort = new SelectSort(getTestItems());
//        System.out.println("[정렬되기 전]:" + selectSort.getItems());
        start = System.currentTimeMillis();
        selectSort.selectSort();
        end = System.currentTimeMillis();
//        System.out.println("[정렬 후]:" + selectSort.getItems());
        System.out.println("[시간] : "+(end - start)/1000.0);


        System.out.println("\n===============================================\n");

        System.out.println("[insertSort]");
        InsertSort insertSort = new InsertSort(getTestItems());
//        System.out.println("[정렬되기 전]:" + insertSort.getItems());
        start = System.currentTimeMillis();
        insertSort.insertSort();
        end = System.currentTimeMillis();
//        System.out.println("[정렬 후]:" + insertSort.getItems());
        System.out.println("[시간] : "+(end - start)/1000.0);


        System.out.println("\n===============================================\n");

        System.out.println("[MergeSort]");
        MergeSort mergeSort = new MergeSort(getTestItems());
//        MergeSort mergeSort = new MergeSort(RandomArray.newInstance().getRandomDisplayValue());
//        System.out.println("[정렬되기 전]:" + mergeSort.getItems());
        start = System.currentTimeMillis();
        mergeSort.mergeSort();
        end = System.currentTimeMillis();
//        System.out.println("[정렬 후]:" + mergeSort.getItems());
        System.out.println("[시간] : "+(end - start)/1000.0);

        System.out.println("\n===============================================\n");

        System.out.println("[QuickSort]");
        QuickSort quickSort = new QuickSort(getTestItems());
//        QuickSort quickSort = new QuickSort(RandomArray.newInstance().getRandomDisplayValue());
//        System.out.println("[정렬되기 전]:" + quickSort.getItems());
        start = System.currentTimeMillis();
        quickSort.quickSort();
        end = System.currentTimeMillis();
//        System.out.println("[정렬 후]:" + quickSort.getItems());
        System.out.println("[시간] : "+(end - start)/1000.0);



        System.out.println("\n===============================================\n");

        System.out.println("[JavaSort]");
        ArrayList<Integer> sortArray = getTestItems();
//        QuickSort quickSort = new QuickSort(RandomArray.newInstance().getRandomDisplayValue());
//        System.out.println("[정렬되기 전]:" + sortArray);
        start = System.currentTimeMillis();
        Collections.sort(sortArray);
        end = System.currentTimeMillis();
//        System.out.println("[정렬 후]:" + sortArray);
        System.out.println("[시간] : "+(end - start)/1000.0);



        System.out.println("\n===============================================\n");

        System.out.println("[JavaSort2]");
        ArrayList<Integer> sortArray2 = getTestItems();
//        QuickSort quickSort = new QuickSort(RandomArray.newInstance().getRandomDisplayValue());
//        System.out.println("[정렬되기 전]:" + sortArray2);
        start = System.currentTimeMillis();
        sortArray2.sort(Comparator.naturalOrder());
        end = System.currentTimeMillis();
//        System.out.println("[정렬 후]:" + sortArray2);
        System.out.println("[시간] : "+(end - start)/1000.0);


        System.out.println("\n===============================================\n");

        System.out.println("[JavaSort3]");
        int[] arrays = new int[getTestItems().size()];
        int CNT = -1;
        for(int item : getTestItems()){
            arrays[++CNT] = item;
        }
//        System.out.println("[정렬되기 전]:" + Arrays.toString(arrays));
        start = System.currentTimeMillis();
        Arrays.sort(arrays);
        end = System.currentTimeMillis();
//        System.out.println("[정렬 후]:" + Arrays.toString(arrays));
        System.out.println("[시간] : "+(end - start)/1000.0);
    }


    public static ArrayList<Integer> getTestItems(){
        ArrayList<Integer> testData = new ArrayList<>();
        if(RandomArray.newInstance().getRandomValue() == null){
//            RandomArray.newInstance().randomDisplayValue();
            RandomArray.newInstance().randomValue();
        }
        for(int data : RandomArray.newInstance().getRandomValue()){
            testData.add(data);
        }
        return testData;
    }
}
