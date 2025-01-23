import java.util.Scanner;
public class Demo7{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String user=" ";
        String pwd=" ";
        String Confirm;
        String un=" ";
        String pd=" ";
        boolean isAuthenticated = false;
        do { 
            System.out.println("Welcome to Mallareddy University");
            System.out.println("Are you a member of the University");
            String response=scanner.next();
        if( response.equals("no")){
            System.out.println("Signup with your details");
            System.out.println("Enter Your Username:");
            user=scanner.next();
            System.out.println("Enter a password: ");
            pwd=scanner.next();
            System.out.println("Confirm your password: ");
            Confirm=scanner.next();
            if(Confirm.equals(pwd)){
                System.out.println("Your password is confirmed!");
            }else{
                System.out.println("Re enter the password");
            }
        }else{
            System.out.println("You are a part of the university");
            System.out.println("Enter your username:");
            un=scanner.next();
            System.out.println("Enter the password:");
            pd=scanner.next();
            if(un.equals("Varshith") && pd.equals("varshith")){
                System.out.println("You are Welcome");
                break;
            }else{
                System.out.println("Wrong Password");
            }
        }}
         while (!isAuthenticated);
         scanner.close();
             }
}