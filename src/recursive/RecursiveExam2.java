package recursive;

import java.util.ArrayList;

public class RecursiveExam2 {
    public int factorialFunc(ArrayList<Integer> dataList) {
        if (dataList.size() <= 0) {
            return 0;
        }
        return dataList.get(0)+factorialFunc(new ArrayList<Integer>(dataList.subList(1,dataList.size())));
    }
}
