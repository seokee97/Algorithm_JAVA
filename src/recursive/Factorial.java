package recursive;

public class Factorial {

    //일반적인 팩토리얼:n! 구하는 함수
    public static int factorialFunc(int n){
        int fac = 1;
        for(int index = 2; index < n +1; index++){
            fac = fac*index;
        }
        return fac;
    }

    //재귀 함수를 이용한 팩토리얼:n! 구하는 함수
    public static int factorialRecursiveFunc(int n){
        if(n>1){
            return n * factorialRecursiveFunc(n-1);
        }else{
            return 1;
        }
    }


    public static void main(String[] args) {
        System.out.println("일반적인 팩토리얼 : "+Factorial.factorialFunc(5));
        System.out.println("재귀를 이용한 팩토리얼 : "+Factorial.factorialRecursiveFunc(5));
    }
}
