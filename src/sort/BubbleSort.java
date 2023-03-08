package sort;

import java.util.ArrayList;
import java.util.Collections;

public class BubbleSort {
    private ArrayList<Integer> items;

    public BubbleSort(ArrayList<Integer> items) {
        this.items = items;
    }

    public void bubbleSort() {
        for (int index = 0; index < items.size(); index++) {
            boolean swap = false;
            for (int j = 0; j < items.size()-1-index; j++) {
                if (items.get(j) > items.get(j+1)) {
                    Collections.swap(items, j, j+1);
                    swap = true;
                }
            }
            if(!swap) break;
        }
    }

    public ArrayList<Integer> getItems() {
        return items;
    }
}