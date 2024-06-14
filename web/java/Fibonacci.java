class Fibonacci
{
    public static void main (String []args)
    {
        int a=0;
        int b=1;
        int sum;
        int i;
        System.out.print(a);
        System.out.print(b);
        for (i=0;i<=10;i++)
        {
            sum=a+b;
            System.out.print(","+sum);
            a=b;
            b=sum;
        }

    }
}