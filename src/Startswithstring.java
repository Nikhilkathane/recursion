public class Startswithstring {
    public static void main(String[] args)
    {
        String s1 ="abcd";
        String s2 ="abcd";
        myCode(s1,s2);
    }
    //EndOfMainMethod
    private static void myCode(String s1,String s2)
    {
        if(s1.length()>=s2.length())
        {
            int cnt=0;
            cnt=iloop(s1,s2,0,cnt);
            if(cnt==s2.length())
            {
                System.out.println(true);
            }
            else
            {
                System.out.println(false);
            }
        }
        else
        {
            System.out.println(false);
        }
    }
    private static int iloop(String s1,String s2,int i,int cnt)
    {
        if(i<s2.length())
        {
            if(s1.charAt(i)==s2.charAt(i))
            {
                cnt++;
            }
            i++;
            return iloop(s1,s2,i,cnt);
        }
        return cnt;
}
}
