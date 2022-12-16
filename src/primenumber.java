public class primenumber {
    public static void main(String[] args) {
        int num=9;
        int cnt=0;
        cnt=iloop(2,num,cnt);
        if(cnt==0)
            System.out.println("prime");
        else
            System.out.println("not prime");
    }
    private static int iloop(int i,int num,int cnt) {
        if(i<num)
        {
            if(num%i==0)
            {
                cnt++;
            }
            i++;
            return iloop(i,num,cnt);
        }
        return cnt;
    }
}
