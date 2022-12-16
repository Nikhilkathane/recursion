public class sumofarray {
    public static void main(String[] args)
    {
        int a[]={1,2,3,4,5};
        int sum=0;
        sum=iloop(0,a,sum);
        System.out.println(sum);
    }
    private static int iloop(int i, int[] a, int sum)
    {
        if (i < a.length)
        {
            sum=sum+a[i];
            i++;
            sum=iloop(i,a,sum);
        }
        return sum;
    }
}
