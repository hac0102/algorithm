public class Al06RecursionFibonacciCode01 {
    public static void main(String[] args){
        //f0 = 0
        //f1 = 1
        //fn = fn-1 + fn-2     n > 1

        int result = fibonacci(5);
    }

    private static int fibonacci(int i) {
        if (i < 2) {
            return i;
        }else {
            return fibonacci(i - 1) + fibonacci(i - 2);
        }

    }
}
