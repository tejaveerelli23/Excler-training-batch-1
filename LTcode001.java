public class LTcode001 {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int reversedHalf = 0;
        while (x > reversedHalf) {
            reversedHalf = reversedHalf * 10 + x % 10;
            x /= 10;
        }
        return x == reversedHalf || x == reversedHalf / 10;
    }

    public static void main(String[] args) {
        LTcode001 solution = new LTcode001();
        System.out.println(solution.isPalindrome(121)); 
        System.out.println(solution.isPalindrome(-121)); 
        System.out.println(solution.isPalindrome(10)); 
        System.out.println(solution.isPalindrome(12321)); 
    }
}