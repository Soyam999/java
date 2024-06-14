import java.util.Scanner;
class Si
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter princpal");
        int p=input.nextInt();
        System.out.println("Enter rate of interest");
        int i=input.nextInt();
        System.out.println("Enter time");
        int t=input.nextInt();
        int si=(p*i*t)/100;
        System.out.println("simple interest"+si);
    }
}