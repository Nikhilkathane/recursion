public class numberpattern {
    public static void main(String[] args) {
        int i=0;
        loopi(i);
    }
    private static void loopi(int i)
    {
        if(i<9)
        {
            int j=0;
            loopj(i,j);
            System.out.println();
            i++;
            loopi(i);
        }
    }
    private static void loopj(int i, int j)
    {
        if(j<9)
        {
            if(j-i<=0)
                System.out.print(j+1);
            else
                System.out.print(" ");
            j++;
            loopj(i,j);
        }
    }
}
