package datastructure.hashtable;

public class MyHashTable {
    public static void main(String[] args){
        MyHash mainObject = new MyHash(20);
        mainObject.saveData("DaveLee", "01022223333");
        mainObject.saveData("fun-coding", "01033334444");
        System.out.println(mainObject.getData("fun-coding"));


    }

    public static class MyHash{
        public Slot[] hashTable;

        public MyHash(Integer size){
            this.hashTable = new Slot[size];
        }


        public class Slot{
            String value;
            Slot(String value){
                this.value = value;
            }
        }

        public int hashFunc(String key) {
            return (int)(key.charAt(0)) % this.hashTable.length;
        }

        public boolean saveData(String key, String value) {
            Integer address = this.hashFunc(key);
            if (this.hashTable[address] != null) {
                this.hashTable[address].value = value;
            } else {
                this.hashTable[address] = new Slot(value);
            }
            return true;
        }

        public String getData(String key) {
            Integer address = this.hashFunc(key);
            if (this.hashTable[address] != null) {
                return this.hashTable[address].value;
            } else {
                return null;
            }
        }
    }



}
