public class binarysearch {
    public static void main(String[] args) {
        int[] a={11,22,33,44,55,66};
        int num=56;
        int start=0;
        int end=a.length-1;
        iloop(a,start,end,num);

    }
    private static void iloop(int[] a, int start, int end, int num) {
        if(true)
        {
            int mid=(start+end)/2;
            if(a[mid]==num)
            {
                System.out.println("found at index : "+mid);
                return;
            } else if (a[mid]<num) {
                start=mid+1;
            }
            else
                end=mid-1;
            if(start>end)
            {
                System.out.println("not found");
                return;
            }
            iloop(a, start, end, num);
        }
    }

}
