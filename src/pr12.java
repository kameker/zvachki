public class pr12 {
    public static double solve(double a, double b,int n){
        double result = a * n - b;
        for (int i = n - 1; i > 0; i--){
            result = result * i - b;
        }
        return result;
    }
}
