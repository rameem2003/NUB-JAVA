package PalinDrome;

// Class for palindrome checking logic
class PalindromeClass {

    // Method to check palindrome
    boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }
        return true; // Palindrome
    }
}

// Class containing main method
class Palindrome {

    public static void main(String[] args) {

        String text = "madam";

        PalindromeClass p = new PalindromeClass();

        if (p.isPalindrome(text)) {
            System.out.println("The given string is a palindrome.");
        } else {
            System.out.println("The given string is not a palindrome.");
        }
    }
}
