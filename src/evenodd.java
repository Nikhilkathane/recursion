// using array creation solving recursion
public class evenodd {

    public static void main(String[] args) {
        int[]a={1,2,3,4,4,2,1};
        int[] b= new int[2];
        count(a,b,0);
        System.out.println(b[0]+" "+b[1]);
    }

    private static void count(int[] a, int[] b, int i) {
        if(i< a.length)
        {
            if(a[i]%2==0)
            {
                b[0]++;
            }
            else
            {
                b[1]++;
            }
            i++;
            count(a,b,i);
        }
    }
}
