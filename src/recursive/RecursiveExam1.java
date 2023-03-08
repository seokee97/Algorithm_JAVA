package recursive;

public class RecursiveExam1 {
        public int factorialFunc(int num) {
            if (num <= 1) {
                return num;  // 일반적인 로직상, 리턴값은 1로 작성해도 됨
            }
            return num * this.factorialFunc(num - 1);
        }
}
