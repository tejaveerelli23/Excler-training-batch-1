import java.util.Scanner;

public class Demo8 {
    public static void main(String[] args) {
        String name;
        int age;
        int phone_number;

        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter your name: ");
        name = sc.nextLine();

        
        System.out.print("Enter your age: ");
        age = sc.nextInt();

        
        sc.nextLine();  

        
        System.out.print("Enter your phone number: ");
        phone_number = sc.nextInt();

        
        System.out.println("Name: " + name + ", Age: " + age + ", Phone number: " + phone_number);


        sc.close();
    }
}
