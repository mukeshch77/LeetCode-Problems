public class Power {
    public double myPow(double x, int n) {
        long N = n;
        if(N < 0){
            x = 1/x;
            N = -N;
        }
        
        double res = 1;
        while(N > 0){
            if(N % 2 ==1){
                res *= x;
            }
            x *= x;
            N /= 2;
        }
        return res;
    }

    public static void main(String[] args) {
        Power p = new Power();
        // double ans = p.myPow(3, 3);
        // System.out.println(ans);
        System.out.println(p.myPow(3, -3));
    }
}
