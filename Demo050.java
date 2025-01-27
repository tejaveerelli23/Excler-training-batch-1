import java.util.Scanner;

public class Demo050 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,z;
        System.out.print("Enter a number: ");
        n = sc.nextInt();
         System.out.print("Enter a last number: ");
        z = sc    .nextInt();
       for(int i =1;i<=z;i++){
        int t = n*i;
           System.out.println(+n+" x "+i+" = "+t );
       }
    }
}