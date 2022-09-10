import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int a = input.nextInt();
        for(int i=0; i<a; i++)
        {
            for(int j=a; j>(a-i); j-- )
            {
                System.out.print(" ");
            }
            for(int k=0; k<(2*(a-i)-1);k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}