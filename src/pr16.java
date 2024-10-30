public class pr16 {
    public static void zv(int h){
        for (int i = 0 ; i < h;i++){
            System.out.print("*");
        }
    }
    public static void tire(int h){
        for (int i = 0 ; i < h;i++){
            System.out.print("-");
        }
    }
    public static void slash(int h){
        for (int i = 0 ; i < h;i++){
            System.out.print("\\");
        }
    }
    public static void ver(int h){
        for (int i = 0 ; i < h;i++){
            System.out.print("|");
        }
    }
    public static void space(int h){
        for (int i = 0 ; i < h;i++){
            System.out.print(" ");
        }
    }
    public static void solve(int h){ // вообще логично что для триугольника h >= 3, но тут не так и при h = 1 в этом решении бужет **, исправить это легко
        int m = 0;
        int g = 3;
        for (int i = h; i > 0; i--){
            if (i == h){
                zv(1);
                tire(h-2);
                zv(1);
            }
            else if(i == 1){
                space(m);
                zv(1);
            }
            else{
                space(m);
                slash(1);
                zv(h-g);
                ver(1);
                g++;
            }
            m++;
            System.out.println();
        }
    }
}
