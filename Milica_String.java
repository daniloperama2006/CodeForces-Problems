import java.util.Scanner;

public class Milica_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        
        while (t-- > 0) {
            int n = sc.nextInt(); 
            int k = sc.nextInt(); 
            String s = sc.next(); 
            
            int countB = 0;
            for (char c : s.toCharArray()) {
                if (c == 'B') countB++;
            }
            
            if (countB == k) {
                System.out.println("0");
            } else if (countB < k) {
                int neededB = k - countB;
                int currentA = 0;
                for (int i = 0; i < n; i++) {
                    if (s.charAt(i) == 'A') {
                        currentA++;
                    }
                    if (currentA >= neededB) {
                        System.out.println("1");
                        System.out.println((i + 1) + " B");
                        break;
                    }
                }
            } else {
                int neededA = countB - k;
                int currentB = 0;
                for (int i = 0; i < n; i++) {
                    if (s.charAt(i) == 'B') {
                        currentB++;
                    }
                    if (currentB >= neededA) {
                        System.out.println("1");
                        System.out.println((i + 1) + " A");
                        break;
                    }
                }
            }
        }
        sc.close();
    }
}
