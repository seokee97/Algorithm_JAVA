package sort;

import java.util.ArrayList;
import java.util.Collections;

public class InsertSort {
    private ArrayList<Integer> items;
    int size = 0;
    public InsertSort(ArrayList<Integer> items){
        this.items = items;
        size = items.size();
    }

    public void insertSort(){
        for(int index = 0; index<size-1; index++){
            for(int select = index+1; select>0; select--){
                if(items.get(select)<items.get(select-1)){
                    Collections.swap(items,select,select-1);
                }else break;
            }
        }
    }


    public ArrayList<Integer> getItems() {
        return items;
    }

    public void setItems(ArrayList<Integer> items) {
        this.items = items;
    }
}
