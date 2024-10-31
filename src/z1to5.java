public class z1to5 {
    public static double getHypotenuse(double x, double y) {
        return Math.sqrt(x * x + y * y);
    }

    public static Boolean pointInCircle(double radius, double X, double Y) {
        double hep = getHypotenuse(X, Y);
        if (hep <= radius) {
            return true;
        }
        return false;
    }

    public static Boolean pointUnderAndInLineLikeKXplusB(double k, double b, double X, double Y) {//действительно если точка находиться между ветвей параболы
        if (k * X + b >= Y) {
            return true;
        }
        return false;
    }
    public static Boolean pointInLine90(double X) {
        return X >= 0;
    }
    public static Boolean solve1(double x, double y) {
        Boolean inSmallCircle = pointInCircle(1,x,y);
        Boolean inBigCircle = pointInCircle(2,x,y);
        Boolean inLine0 = pointUnderAndInLineLikeKXplusB(0,0,x,y);
        Boolean inLine45 = pointUnderAndInLineLikeKXplusB(1,0,x,y);
        Boolean inLine90 = pointInLine90(x);
        Boolean inLine135 = pointUnderAndInLineLikeKXplusB(-1,0,x,y);
        if (inSmallCircle && !inLine0 && !inLine135){
            return true;
        }
        else if (!inLine45 && inBigCircle && inLine90 && !inSmallCircle){
            return true;
        }
        else if (inLine135 && inLine90 && inBigCircle && !inSmallCircle){
            return true;
        }
        else if (inLine0 && inLine90 && !inBigCircle && !inLine135){
            return true;
        }
        return false;
    }
    public static double solve2(double x, int n) {
        double result = 0;
        double X = x;
        if (n == 0) return 0;
        result += x / (x - 1);
        X *= x;
        for (int i = 1; i < n; i++) {
            result += X / (x - i - 1);
            X *= x;
        }
        return result;
    }
    public static int solve3(int n) {
        boolean flag = true;
        int rusult = 0;
        return n / 3 + 5 * (n % 3);

    }
    public static void solve4(int n) {
        int m = 97;
        int k = 0;
        int s = 1;
        while (k < n) {
            for (int i = s; i > 0; i--) {
                if (k + 2 <= n) {
                    System.out.print((char) m);
                    System.out.print("-");
                    k+=2;
                } else if (k + 1 <= n) {
                    System.out.print((char) m);
                    k++;
                }
                else{
                    break;
                }

            }
            m++;
            s++;
        }
    }

    public static void zv(int h) {
        for (int i = 0; i < h; i++) {
            System.out.print("*");
        }
    }

    public static void tire(int h) {
        for (int i = 0; i < h; i++) {
            System.out.print("-");
        }
    }

    public static void slash(int h) {
        for (int i = 0; i < h; i++) {
            System.out.print("/");
        }
    }

    public static void reslash(int h) {
        for (int i = 0; i < h; i++) {
            System.out.print("\\");
        }
    }

    public static void ver(int h) {
        for (int i = 0; i < h; i++) {
            System.out.print("|");
        }
    }

    public static void space(int h) {
        for (int i = 0; i < h; i++) {
            System.out.print(" ");
        }
    }

    public static void solve5(int h) {
        int m = 1;
        int g = 0;
        for (int i = 0; i < h; i++) {
            if (i == 0) {
                space(h - 1);
                zv(1);
            } else if (i == h-1) {
                zv(1);
                tire(h - 2);
                zv(1);
                tire(h - 2);
                zv(1);
            } else {
                space(h - m);
                slash(1);
                space(g);
                ver(1);
                space(g);
                reslash(1);
                g++;
            }

            m++;
            System.out.println();
        }
    }
}
