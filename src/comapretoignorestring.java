public class comapretoignorestring {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "abCd";
        myCode(s1, s2);
    }

    //EndOfMainMethod
    private static void myCode(String s1, String s2)
    {
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        int result = myMethod(s1, s2);
        System.out.println(result);
    }

    private static int myMethod(String s1, String s2)
    {
        return iloop(s1, s2, 0);
    }

    private static int iloop(String s1, String s2, int i)
    {
        if (i < s1.length() && i < s2.length()) {
            if (s1.charAt(i) != s2.charAt(i))
                return s1.charAt(i) - s2.charAt(i);
            i++;
            return iloop(s1, s2, i);
        }
        return s1.length() - s2.length();

    }
}