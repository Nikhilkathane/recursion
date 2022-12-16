public class numberpatcounter {
    public static void main(String[] args) {
        loopi(0);
    }
    private static void loopi(int i)
    {
        if(i<9)
        {
            int cnt=1;

            loopj(i,0,cnt);
            System.out.println();
            i++;
            loopi(i);
        }
    }
    private static void loopj(int i, int j,int cnt)
    {
        if(j<9)
        {
            if(j-i<=0)
                System.out.print(cnt++);
            else
                System.out.print(" ");
            j++;
            loopj(i,j,cnt);
        }
    }
}
