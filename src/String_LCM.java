import java.util.Scanner;

public class String_LCM {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea después del entero

        while (t-- > 0) {
            String s1 = scanner.next();
            String s2 = scanner.next();

            String lcm = findLCM(s1, s2);
            System.out.println(lcm);
        }

        scanner.close();
    }

    public static String findLCM(String s1, String s2) {
        String commonPrefix = findCommonPrefix(s1, s2);
        if (commonPrefix.isEmpty()) {
            return "-1";
        }

        int lcmLength = lcm(s1.length(), s2.length());
        String repeatedPrefix = buildMultiple(commonPrefix, lcmLength / commonPrefix.length());

        if (isDivisible(repeatedPrefix, s1) && isDivisible(repeatedPrefix, s2)) {
            return repeatedPrefix;
        } else {
            return "-1";
        }
    }

    public static String findCommonPrefix(String s1, String s2) {
        int minLength = Math.min(s1.length(), s2.length());

        for (int i = 1; i <= minLength; i++) {
            String prefix = s1.substring(0, i);
            if (isDivisible(s1, prefix) && isDivisible(s2, prefix)) {
                return prefix;
            }
        }

        return "";
    }

    public static boolean isDivisible(String s, String prefix) {
        int prefixLength = prefix.length();
        if (s.length() % prefixLength != 0) {
            return false;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length() / prefixLength; i++) {
            sb.append(prefix);
        }

        return sb.toString().equals(s);
    }

    public static String buildMultiple(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(s);
        }
        return sb.toString();
    }

    public static int lcm(int a, int b) {
        return a * (b / gcd(a, b));
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
