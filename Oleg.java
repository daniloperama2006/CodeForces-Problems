import java.util.Scanner;

public class Oleg{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();  
        String s = scanner.next();  
        
        StringBuilder result = new StringBuilder();
        int i = 0;
        
        while (i < s.length()) {
            if (i <= s.length() - 3 && s.substring(i, i + 3).equals("ogo")) {
                int j = i + 3;
                while (j < s.length() && j + 1 < s.length() && s.charAt(j) == 'g' && s.charAt(j + 1) == 'o') {
                    j += 2;  
                }
 
                result.append("***");
                i = j;  
            } else {
    
                result.append(s.charAt(i));
                i++;
            }
        }
        
      
        System.out.println(result.toString());
        
        scanner.close();
    }
}
