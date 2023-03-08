package sort;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SelectSort {
    private ArrayList<Integer> items;
    public SelectSort(ArrayList<Integer> items){
        this.items = items;
    }

    public void selectSort(){
        int low = 0;
        int i = 0;
        int j = 0;

        for(i= 0; i<items.size(); i++){
            low = i;
            for(j = i+1; j< items.size(); j++){
                if(items.get(low)>items.get(j)){
                    low = j;
                }
            }
            Collections.swap(items,low,i);
        }
    }

    public ArrayList<Integer> getItems() {
        return items;
    }

}
