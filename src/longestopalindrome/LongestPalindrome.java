package longestopalindrome;

import java.util.Scanner;

public class LongestPalindrome {

	 public static String longestPalindrome(String input) {
	        int start = 0;
	        int end = 0;
	        for (int i = 0; i < input.length(); i++) {
	            int leftlen = finder(input, i, i);
	            int rightlen = finder(input, i, i + 1);
	            int len = Math.max(leftlen, rightlen);

	            if (len > end - start) {
	                start = i - (len - 1) / 2;
	                end = i + len / 2;
	            }
	        }
	        return input.substring(start, end + 1);
	    }
	    static int finder(String input, int left, int right) {
	        int Left = left;
	        int Right = right;
	        while (Left >= 0 && Right < input.length() && input.charAt(Left) == input.charAt(Right)) {
	            Left--;
	            Right++;
	        }
	        return Right - Left - 1;
	    }
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        String str = scanner.next();
	        System.out.println(longestPalindrome(str));
	    }
}
