package sort;

import java.util.ArrayList;

public class QuickSort {
    private ArrayList<Integer> items;

    public QuickSort(ArrayList<Integer> items) {
        this.items = items;
    }

    public void quickSort(){
        this.items = sort(items);
    }

    public ArrayList<Integer> sort(ArrayList<Integer> items) {
        if (items.size() <= 1) return items;

        int pivot = items.get(0);

        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();

        for (int index = 1; index < items.size(); index++) {
            if (items.get(index) <= pivot)
                left.add(items.get(index));
            else
                right.add(items.get(index));
        }

        ArrayList<Integer> mergedArr = new ArrayList<>();
        mergedArr.addAll(sort(left));
        mergedArr.add(pivot);
        mergedArr.addAll(sort(right));

        return mergedArr;
    }

    public ArrayList<Integer> getItems() {
        return this.items;
    }
}
