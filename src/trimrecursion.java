public class trimrecursion {
    public static void main(String[] args) {
        String s1 = "        abc   ";
        mycode(s1);
    }
    private static void mycode(String s1) {
        int i = 0;
        i = iloop(i, s1);
        int j = s1.length() - 1;
        j = jloop(j, s1);
        System.out.println("start : " + i + "\n" + "end : " + j);
        String str = "";
        int k = i;
        str=kloop(k, i, j, s1, str);
        System.out.println(str);
    }
    private static String kloop(int k, int i, int j, String s1, String str) {
        if (k <= j)
        {
            str += s1.charAt(k);
            k++;
            return kloop(k, i, j, s1, str);
        }
        return str;
    }
    private static int jloop(int j, String s1) {
        if (true) {
            if (s1.charAt(j) == ' ')
                j--;
            else
                return j;
            return jloop(j, s1);
        }
        return j;
    }
    private static int iloop(int i, String s1) {
        if (true) {
            if (s1.charAt(i) == ' ')
                i++;
            else
                return i;
            return iloop(i, s1);
        }
        return i;
    }
}

