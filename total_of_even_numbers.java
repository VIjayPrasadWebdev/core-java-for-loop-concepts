
import java.util.Scanner;
public class total_of_even_numbers {
    public static void main(String []x){
        Scanner s=new Scanner(System.in);
        System.out.println("How many numbers you want to enter");

        int n=s.nextInt();
        int total;
        int sum=0;
        for(int i=1;i<=n;i++)
        {
         if(i%2== 0)
         {
            System.out.println(i);
            break;
        }
        total = sum +n;
            System.out.println(total);
        }
    }
}
