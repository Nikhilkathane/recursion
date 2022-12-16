public class uniquepair {
    public static void main(String[] args) {
        int[] a={1,1,1,2,3};
        a=removedupli(a);
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                System.out.println(a[i]+" "+a[j]);
            }
        }
    }

    private static int[] removedupli(int[] a) {
        int unicount=getunicnt(a);
        int[] b=new int[unicount];
        int index=0;
        for(int i=0;i<a.length;i++)
        {
            boolean result=presentintB(b,a[i]);
            if(result==false)
                b[index++]=a[i];
        }
        return b;
    }

    private static int getunicnt(int[] a) {
        int unicount = 0;
        for (int i = 0; i < a.length; i++) {
            int cnt = 0;
            for (int j = 0; i < i; j++) {
                if (a[i] == a[j])
                    cnt++;
            }
            if (cnt == 0) {
                unicount++;
            }
        }
        return unicount;
    }


    private static boolean presentintB(int[] b, int num) {
        for(int b1:b)
            if(b1==num)
                return true;
        return false;

    }
}
