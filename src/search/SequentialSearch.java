package search;

import java.util.ArrayList;

public class SequentialSearch {

    public int sequentialSearch(ArrayList<Integer> items, int searchData){
        for(int item: items){
            if(item == searchData) return item;
        }
        return -1;
    }
}
