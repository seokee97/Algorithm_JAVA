package sort;

import java.util.ArrayList;

public class RandomArray {

    private static RandomArray _randomArray = null;
    private ArrayList<Integer> randomValue;

    public static RandomArray newInstance(){
        if(_randomArray == null){
            synchronized(RandomArray.class)
            {
                _randomArray = new RandomArray();
            }
        }
        return _randomArray;
    }

    private RandomArray(){  }

    public ArrayList<Integer> getRandomValue() {
        randomValue = new ArrayList<>();
        int count = 10000;
        for (int i = 0; i < count; i++) {
            randomValue.add(((int)(Math.random()*100000))+1);
        }
        return randomValue;
    }

    public ArrayList<Integer> getRandomDisplayValue() {
        randomValue = new ArrayList<>();
        int count = 9;
        for (int i = 0; i < count; i++) {
            randomValue.add(((int)(Math.random()*100000))+1);
        }
        return randomValue;
    }

    public void setRandomValue(ArrayList<Integer> randomValue) {
        this.randomValue = randomValue;
    }
}
