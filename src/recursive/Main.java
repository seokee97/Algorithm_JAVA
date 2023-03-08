package recursive;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        RecursiveExam1 recursiveExam1 = new RecursiveExam1();
        System.out.println("Exam1 : "+recursiveExam1.factorialFunc(5));

        RecursiveExam2 recursiveExam2 = new RecursiveExam2();
        ArrayList<Integer> testData = new ArrayList();
        for (int data = 0; data < 10; data++) {
            testData.add(data);
        }
        System.out.println("Exam2 : "+recursiveExam2.factorialFunc(testData));
    }
}
