import java.util.HashMap;
import java.util.Scanner;

public class Antipalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();

        int maximaLongitud = 0;
        int n = s.length();

        
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                String sub = s.substring(i, j + 1);

                
                boolean esPalindromo = true;
                int longitud = sub.length();
                for (int k = 0; k < longitud / 2; k++) {
                    if (sub.charAt(k) != sub.charAt(longitud - 1 - k)) {
                        esPalindromo = false;
                        break;
                    }
                }

                if (!esPalindromo) {
                    maximaLongitud = Math.max(maximaLongitud, longitud);
                }
            }
        }

        System.out.println(maximaLongitud);
    }
    
}
