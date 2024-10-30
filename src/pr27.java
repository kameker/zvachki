public class pr27 {
    public static int solve(int v1, int v2, int v3) {
        return v1 + v2 + v3 - Math.min(v3, Math.min(v1, v2));
    }
}
