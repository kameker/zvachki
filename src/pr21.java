public class pr21 {
    public static void zv(int k) {
        for (int i = 0; i < k; i++) {
            System.out.print("*");
        }
    }

    public static void space(int k) {
        for (int i = 0; i < k; i++) {
            System.out.print(" ");
        }
    }

    public static void solve(int h) {
        int m = 0;
        for (int i = h; i > 0; i--) {
            if ((h - i) % 2 == 0) {
                space(m);
                zv(i * 2 - 1);
            } else {
                space(m);
                zv(1);
                space(2 * i - 1 - 2);
                if (i != 1) {
                    zv(1);
                }
            }
            m++;
            System.out.println();
        }
    }
}
