import java.util.Scanner;

public class Deja_Vu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        StringBuilder output = new StringBuilder();
        
        while (t-- > 0) {
            String s = scanner.nextLine();
            int n = s.length();
            
            boolean found = false;
            
            // Check inserting 'a' at the beginning
            StringBuilder sb = new StringBuilder("a").append(s);
            if (!isPalindrome(sb.toString())) {
                output.append("YES\n");
                output.append(sb).append('\n');
                found = true;
            } else {
                // Check inserting 'a' at the end
                sb.setLength(0);
                sb.append(s).append("a");
                if (!isPalindrome(sb.toString())) {
                    output.append("YES\n");
                    output.append(sb).append('\n');
                    found = true;
                }
            }
            
            if (!found) {
                output.append("NO\n");
            }
        }
        
        System.out.print(output);
        scanner.close();
    }
    
    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) {
                return false;
            }
        }
        return true;
    }
}
