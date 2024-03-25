package HashSet.PalindromeNumber;

public class main {
    public static void main(String[] args) {

    }
    static boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        StringBuilder reversed = new StringBuilder(s).reverse();
        String result = reversed.toString();
        if (String.valueOf(x).equals(result)){
            return true;
        }
        return false;
    }
}
