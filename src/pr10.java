public class pr10 {
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

    public static void printFigure(int h) {
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
