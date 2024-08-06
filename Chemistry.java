import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Chemistry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Número de casos de prueba

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(); // Longitud de la cadena
            int k = sc.nextInt(); // Número de caracteres a eliminar
            String s = sc.next(); // La cadena de entrada

            if (canFormPalindromeAfterKRemovals(n, k, s)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }

    private static boolean canFormPalindromeAfterKRemovals(int n, int k, String s) {
        int remainingLength = n - k;

        if (remainingLength < 0 || remainingLength > n) {
            return false;
        }

        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        int oddCount = 0;
        for (int count : charCount.values()) {
            if (count % 2 != 0) {
                oddCount++;
            }
        }

        if (remainingLength % 2 == 0) {
            return oddCount <= k && (k - oddCount) % 2 == 0;
        } else {
            return oddCount <= k + 1 && (k - oddCount + 1) % 2 == 0;
        }
    }
}
