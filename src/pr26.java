public class pr26 {
    public static double myPow(double num, int degree){
        if (degree == 0){
            return 1.0;
        }
        else{
            return num * myPow(num,degree -1);
        }
    }
    public static double solve(double x, double n){
        double result = 0;
        for (int i = 0; i <= n;i++){
            result += 1/(myPow(x,i) + i) * myPow(-1,i);
        }
        return result;
    }
}
