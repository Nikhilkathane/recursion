public class indexofstring {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "ab";
        iloop(s1, s2, 0);
    }
        private static void iloop (String s1, String s2,int i)
        {
            if (i < s1.length()) {
                if (s1.charAt(i) == s2.charAt(0)) {
                    int s1index = i;
                    int s2index = 0;
                    int cnt = 0;
                    cnt = loopj(s1, s2, s1index, s2index, cnt);

                    if (cnt == 0) {
                        System.out.println(i);
                        return;
                    }
                }
                i++;
                iloop(s1, s2, i);
            }
        }
        private static int loopj (String s1, String s2,int s1index, int s2index, int cnt)
        {
            if (s2index < s2.length()) {
                if(s1.charAt(s1index)!=s2.charAt(s2index)) {
                    //System.out.println(i);
                    cnt++;
                    return cnt;
                }
                s1index++;
                s2index++;
                loopj(s1, s2, s1index, s2index, cnt);
            }
            return cnt;
        }

    }
