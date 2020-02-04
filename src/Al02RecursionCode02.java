public class Al02RecursionCode02 {
    public static void main(String[] args){
        func(4);
    }

    private static void func(int k) {
        if (k <= 0){
            return;
        }else{
            System.out.println("aaaaaaaaaa :: " + k);
            func(k-1);
        }
    }
}
