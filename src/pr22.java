public class pr22 {
    public static int solve(int x){
        x = Math.abs(x);
        return Math.max(x % 10,Math.max(x / 10 % 10,x / 100));
    }
}
