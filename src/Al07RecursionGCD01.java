public class Al07RecursionGCD01 {
    public static void main(String[] args){ //Euclid

        double result = gcd(5, 7);

        //좀더 간소화 한거
        int result2 = gcd2(5, 10);
        System.out.println("ddddd ::" + result2);
    }

    private static int gcd2(int p, int q) {
        if (q == 0) {
            return p;
        }else {
            return gcd2(q, p % q);
        }
    }

    private static double gcd(int m, int n) {
        if (m < n) {
            int tmp = m; m = n; n = tmp;        //swap m and n
        }

        if (m % n == 0) {
            return n;
        }else {
            return gcd(n, m % n);
        }
    }
}

// m >= n 인 두 양의 정 수 m과 n에 대해서 m이 n의 배수이면 gcd(m, n) = n 이고, 그렇지 않으면 gcd(m, n) = gcd(n, m % n)이다