public class Al05RecursionPowerCode01 {
    public static void main(String[] args){

        double result = power(2, 1);
    }

    private static double power(double x, int n) {
        if(n == 0){
            return 1;
        }else{
            return x * power(x, n - 1);
        }
    }
}
