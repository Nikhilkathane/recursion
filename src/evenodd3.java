// using globally vriable declaration
public class evenodd3 {
    static int evencnt=0;
    static int oddcnt=0;
    public static void main(String[] args) {
        int[]a={1,2,3,4,4,2,1};

        count(a,0);
        System.out.println(evencnt+" "+oddcnt);
    }

    private static void count(int[] a,int i) {
        if(i< a.length)
        {
            if(a[i]%2==0)
            {evencnt++;
            }
            else
            {
                oddcnt++;
            }
            i++;
            count(a,i);
        }
    }
}
