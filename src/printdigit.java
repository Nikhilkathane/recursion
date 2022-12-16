public class printdigit {
    public static void main(String[] args)
    {
        int i = 11;
        niks(i);
    }
    private static void niks(int i)
    {
        if (i <= 20)
        {
            System.out.println(i);
            i++;
            niks(i);

        }
    }
}