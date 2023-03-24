package datastructure.queue;

import java.util.ArrayList;

public class MyQueue<T> {
    private ArrayList<T> queue;
    private int count;


    public MyQueue(){
        queue = new ArrayList<>();
        count = 0;
    }
    public MyQueue(Integer count){
        this.count = count.intValue();
        queue = new ArrayList<>(count);
    }

    public void enQueue(T item) {
        if(count>0){
            if(isFull())
                System.out.println("isFull");
            else
                queue.add(item);
        }else
            queue.add(item);
    }

    public T deQueue() {
        if (queue.isEmpty()){
            System.out.println("isEmpty");
            return null;
        }else
            return queue.remove(0);
    }

    public T peek(){
        if(queue.isEmpty())
            return null;
        else
            return queue.get(0);
    }


    public boolean isFull(){
        if(queue.size()<count)
            return false;
        else
            return true;
    }

    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>();
        queue.enQueue(1);
        System.out.println("Peek : "+queue.peek());
        queue.enQueue(2);
        System.out.println("DeQueue : "+queue.deQueue());
        System.out.println("Peek : "+queue.peek());
        System.out.println("DeQueue : "+queue.deQueue());
        System.out.println("Peek : "+queue.peek());

        System.out.println("=========================");

        int count= 5;
        MyQueue<Integer> queue2 = new MyQueue<>(count);
        queue2.enQueue(1);
        queue2.enQueue(2);
        queue2.enQueue(3);
        queue2.enQueue(4);
        queue2.enQueue(5);
        queue2.enQueue(6);
        for(int i= 0; i<count;++i){
            System.out.println("DeQueue : "+queue2.deQueue());
        }
        System.out.println("Peek : "+queue2.peek());
    }

}
