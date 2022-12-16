public class findspecificeleinarray {
    public static void main(String[] args) {
        int a[]={1,2,3,4};
        int ele=5;
        int cnt=0;
        cnt=iloop(0,a,ele,cnt);
        if(cnt==1)
            System.out.println("found");
        else
            System.out.println("not found");
    }
    private static int iloop(int i,int[] a,int ele,int cnt)
    {
        if(i<a.length)
        {
            if(a[i]==ele)
            {
                cnt++;
            }
            i++;
           return iloop(i,a,ele,cnt);

        }
        return cnt;
    }
}
