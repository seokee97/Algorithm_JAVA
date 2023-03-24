package datastructure.stack;

import java.util.ArrayList;

public class MyStack<T> {
    ArrayList<T> stack;
    int count;

    public MyStack(){
        this.stack = new ArrayList<>();
        this.count = 0;
    }

    public MyStack(int count){
        this.count = count;
        this.stack = new ArrayList<>(count);
    }

    public boolean isFull(){
        if(stack.size()<count)
            return false;
        else
            return true;
    }

    public boolean push(T item){
        if(count>0){
            if(isFull()){
                System.out.println("isFull");
                return false;
            }else{
                stack.add(item);
                return true;
            }
        }else{
            stack.add(item);
            return true;
        }
    }

    public T pop(){
        if(stack.isEmpty())
            System.out.println("isEmpty");
        else
            return stack.remove(stack.size()-1);
        return null;
    }

    public int top(){
        if(stack.isEmpty())
            System.out.println("isEmpty");
        else
            return stack.size();
        return -1;
    }

    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(1);
        System.out.println("Top : "+stack.top());
        stack.push(2);
        System.out.println("Top : "+stack.top());
        stack.push(3);
        System.out.println("Top : "+stack.top());
        stack.push(4);
        System.out.println("Top : "+stack.top());
        stack.push(5);
        System.out.println("Top : "+stack.top());
        System.out.println("Pop : "+stack.pop());
        System.out.println("Pop : "+stack.pop());
        System.out.println("Pop : "+stack.pop());
        System.out.println("Pop : "+stack.pop());
        System.out.println("Pop : "+stack.pop());
        System.out.println("Top : "+stack.top());

        System.out.println("==========================================");
        MyStack<Integer> stack1 = new MyStack<>(4);
        stack1.push(1);
        System.out.println("Top : "+stack1.top());
        stack1.push(2);
        System.out.println("Top : "+stack1.top());
        stack1.push(3);
        System.out.println("Top : "+stack1.top());
        stack1.push(4);
        System.out.println("Top : "+stack1.top());
        stack1.push(5);
        System.out.println("Top : "+stack1.top());
        System.out.println("Pop : "+stack1.pop());
        System.out.println("Pop : "+stack1.pop());
        System.out.println("Pop : "+stack1.pop());
        System.out.println("Pop : "+stack1.pop());
        System.out.println("Pop : "+stack1.pop());
        System.out.println("Top : "+stack1.top());


    }
}
