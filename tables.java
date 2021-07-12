
import java.util.Scanner;
public class tables {
    public static void main(String x[]) {
        Scanner s=new Scanner(System.in);

        System.out.println("Enter the table number");
        int n=s.nextInt();
        for(int i=1 ; i<=10;  i++ ){
            int table=i*n;
            System.out.println(i + " *" +n + " "+" = "+ table);

        }
    }

}


