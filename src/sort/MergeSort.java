package sort;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class MergeSort {
    private ArrayList<Integer> items;

    public MergeSort(ArrayList<Integer> items) {
        this.items = items;
    }

    public void mergeSort(){
        items = split(items);
    }

    public ArrayList<Integer> split(ArrayList<Integer> items) {
        if (items.size() <= 1) {
            return items;
        }
        int mid = items.size() / 2;
        ArrayList<Integer> leftArr = split(new ArrayList<Integer>(items.subList(0,mid)));
        ArrayList<Integer> rightArr = split(new ArrayList<Integer>(items.subList(mid,items.size())));

        return merge(leftArr,rightArr);
    }

    public ArrayList<Integer> merge(ArrayList<Integer> left, ArrayList<Integer> right){
        int leftSize = 0;
        int rightSize = 0;
        ArrayList<Integer> returnValue = new ArrayList<>();
        // left, right 둘다 있을 때
        while(leftSize < left.size() && rightSize < right.size()){
            if(left.get(leftSize)<right.get(rightSize))
                returnValue.add(left.get(leftSize++));
            else
                returnValue.add(right.get(rightSize++));
        }

        // left만 있을 때
        while(leftSize<left.size())
            returnValue.add(left.get(leftSize++));

        // right만 있을 때
        while(rightSize<right.size())
            returnValue.add(right.get(rightSize++));

        return returnValue;

    }

    public ArrayList<Integer> getItems(){
        return this.items;
    }

}
