import java.util.Arrays;

public class splitrecursion {
    public static void main(String[] args) {
        String s1 = "hi nikhil how r u";
        int cnt = 0;
        cnt = loopi(s1, 0, cnt);

        String[] sa = new String[cnt + 1];
        int index = 0;
        String s2 = "";
        String[] newarr = new String[2];

        newarr = loopj(s1, s2, sa, 0, index, newarr);
        s2 = newarr[0];
        index = Integer.parseInt(newarr[1]);
        sa[index] = s2;
        System.out.println(Arrays.toString(sa));
    }

    private static String[] loopj(String s1, String s2, String[] sa, int i, int index, String[] newarr) {
        if (i < s1.length()) {
            if (s1.charAt(i) != ' ') {
                s2 += s1.charAt(i);
            } else {
                sa[index++] = s2;
                s2 = "";
            }
            i++;
            return loopj(s1, s2, sa, i, index, newarr);
        }
        newarr[0] = s2;
        newarr[1] = index + "";
        return newarr;
    }

        private static int loopi (String s1,int i, int cnt){
            if (i < s1.length()) {
                if (s1.charAt(i) == ' ')
                    cnt++;
                i++;
                return loopi(s1, i, cnt);
            }
            return cnt;
        }

    }

