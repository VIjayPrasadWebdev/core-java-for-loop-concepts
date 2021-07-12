import java.util.Scanner;
public class sum_of_numbers_total {
    public static void main(String[] c) {
        Scanner  in= new Scanner(System.in);
        System.out.println("How many numbers you want to enter");

        int n = in.nextInt();
        int total = 0;
        int sum=0;
        for(int i=1; i<=n; i++)
        {
            System.out.println(i);
            total = i+n;
        }
        System.out.println("The total is " +  total);
    }
}

