package datastructure.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_Java {
    public static void main(String[] args) {
        // Queue를 사용하기 위해서는
        // import java.util.LinkedList;
        // import java.util.Queue;
        //  -> 2개를 임포트 해줘야 한다.

        // add, offer : 값 추가
        // remove, poll : 값 반환 후 제거
        // peek : 값이 있으면     -> 최상위 값 반환
        //        아무값도 없으면  -> null 반환
        // clear :  초기화

        Queue<Integer> iQueue = new LinkedList<>();
        System.out.println("EnQueue : "+iQueue.add(1));
        System.out.println("Peek : "+iQueue.peek());

        System.out.println("EnQueue : "+iQueue.offer(2));
        System.out.println("Peek : "+iQueue.peek());

        System.out.println("DeQueue : "+iQueue.poll());
        System.out.println("Peek : "+iQueue.peek());

        System.out.println("DeQueue : "+iQueue.remove());
        System.out.println("Peek : "+iQueue.peek());

    }
}
