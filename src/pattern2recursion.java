public class pattern2recursion {
    public static void main(String[] args)
    {
        int i=0;
        loopi(i);
    }
    private static void loopi(int i)
    {
        if(i<5)
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
        if(j<5)
        {
            if(j+i>=4)
                System.out.print("*");
            else
                System.out.print(" ");
            j++;
            loopj(i,j);
        }
    }
}
