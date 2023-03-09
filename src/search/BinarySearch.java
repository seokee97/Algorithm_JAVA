package search;

import java.util.ArrayList;
import java.util.Arrays;

public class BinarySearch {
    public boolean binarySearch(ArrayList<Integer> items , int searchData) {
        if(items.size() == 1){
            return items.get(0) == searchData;
        }
        if(items.size() == 0) return false;

        int medium = items.size()/2;

        if(items.get(medium) == searchData){
            return true;
        }else if(items.get(medium)>searchData){ // 중간값보다 작을 때
            return binarySearch(new ArrayList<Integer>(items.subList(0,medium)),searchData);
        }else{ //중간 값보다 클 때
            return binarySearch(new ArrayList<Integer>(items.subList(medium,items.size())),searchData);
        }
    }
}
