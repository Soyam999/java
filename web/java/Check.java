import java.util.Scanner;
class Check
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int n=input.nextInt();
        if(n/2==0)
        {
            System.out.println("it even");
        }
        else
        {
            System.out.println("it odd");
        }
    }
}