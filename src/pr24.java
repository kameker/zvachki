public class pr24 {
    public static int solve(int n) {
        int k = 1;
        int p =0;
        int m = 3;
        int result = 0;
        for (int i = 0; i <= n; i++ ){
            if (i == k){
                result = 10 + p;
                k+=m;
                m+=1;
                p++;
                //System.out.println(111111);
            }
            else {
                result = i * i;
                //System.out.println(222222);
            }
            //System.out.println(p);
        }
        return result;
    }
}
