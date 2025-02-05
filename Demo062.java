
import java.util.Arrays;
public class Demo062 {
    public static void main(String[] args) {
        int[] num = {10, 20, 30, 40, 50, 60};

        if (num.length >= 2) {
            System.out.println("Array: " + Arrays.toString(num));
            System.out.println("1st Element: " + num[0]);
            System.out.println("2nd Element: " + num[1]);
            System.out.println("Last Element: " + num[num.length - 1]);
        } else {
            System.out.println("Array must have at least two elements.");
        }
    }
}