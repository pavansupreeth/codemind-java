import java.util.Scanner;


public class dm{
    public static void main(String[] args){
        Scanner scanner=new Scanner (System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        if(a>b&&a>c)
        {
            System.out.println(a);
        }
         if(a>a&&b>a){
            System.out.println(b);
        }
        if(c>a&&c>b)
        {
            System.out.println(c);
        }
        
    }
}