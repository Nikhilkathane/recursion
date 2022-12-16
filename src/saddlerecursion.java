public class saddlerecursion {
    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        iloop(0, a);
    }
    private static void iloop(int i, int[][] a) {
        if (i < a.length) {
            jloop(i, 0, a);
            iloop(++i, a);
        }
    }
    private static void jloop(int i, int j, int[][] a) {
        if (j < a.length) {
            if (lowrow(a, i, j, 0) && largecol(a, i, j))
                System.out.println(a[i][j]);

            jloop(i, ++j, a);
        }
    }
    private static boolean largecol(int[][] a, int i, int j) {
        return kloop(a,i,j,0);
    }
    private static boolean lowrow(int[][] a, int i, int j, int k) {
        if (k < a.length) {
            if (a[i][j] > a[i][k])
                return false;
            return kloop(a, i, j, ++k);
        }
        return true;
    }
    private static boolean kloop(int[][] a, int i, int j, int k) {
        if (k < a.length) {
            if (a[i][j] < a[k][j])
                return false;
            return kloop(a, i, j, ++k);
        }
        return true;
    }
}

