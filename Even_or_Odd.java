import java.util.Scanner;
public class demo{
    public static void main(String [] args){
         Scanner scanner=new Scanner(System.in);
         int a=scanner.nextInt();
         if(a%2==0)
         {
             System.out.println("Even");
         }
         else
         {
             System.out.println("Odd");
         }
    }
}