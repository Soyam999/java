import java.util.Scanner;
class Area
{
    public static void main(String[] args)
    {
        int area;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length");
        int l=input.nextInt();
        System.out.println("Enter width"); 
        int w=input.nextInt();
        area=l*w;
        System.out.println("area of rectangle"+area); 
    }
}