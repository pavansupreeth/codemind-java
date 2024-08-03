import java.util.Scanner;

public class sdemo{
    public static void main(String[] args){
    
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int arr[]={1,2,3,4,5,6,7};
    int sum=0;
    
    for(int i=0;i<N;i++){
        
        arr[i]=sc.nextInt();
    }
    for(int i=0;i<N;i++){
        sum=sum+=arr[i];
    }
    System.out.println(sum);
    }
}
    
    

