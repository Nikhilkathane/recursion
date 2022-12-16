// using new Class creation solving recursion

public class evenodd2 {
    public static void main(String[] args) {
        int[]a={1,2,3,4,4,2,1};
Data data=new Data();
count(a,data,0);
        System.out.println(data.evencnt+" "+data.oddcnt);
    }

    private static void count(int[] a, Data data, int i) {
        if(i<a.length)
        {
            if(a[i]%2==0)
                data.evencnt++;
            else
                data.oddcnt++;
            i++;
            count(a,data,i);
        }
    }
}
class Data
{
    int evencnt=0;
    int oddcnt=0;
}
