import java.util.HashMap;
import java.util.Scanner;

public class Shuffle_Hashing {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int casos = leer.nextInt();

        while (casos-- > 0) {
            HashMap<Character, Integer> map1 = new HashMap<>();
            HashMap<Character, Integer> map2 = new HashMap<>();

            String p = leer.next();
            String h = leer.next();

            for (char c : p.toCharArray()) {
                map1.put(c, map1.getOrDefault(c, 0) + 1);
            }

            
            if (p.length() > h.length()) {
                System.out.println("NO");
                continue;
            }

    
            for (int i = 0; i < p.length(); i++) {
                char c = h.charAt(i);
                map2.put(c, map2.getOrDefault(c, 0) + 1);
            }

            if (map1.equals(map2)) {
                System.out.println("YES");
                continue;
            }

           
            boolean encontrado = false;
            for (int i = p.length(); i < h.length(); i++) {
                char nuevo = h.charAt(i);
                char viejo = h.charAt(i - p.length());

                
                map2.put(nuevo, map2.getOrDefault(nuevo, 0) + 1);

                
                if (map2.get(viejo) == 1) {
                    map2.remove(viejo);
                } else {
                    map2.put(viejo, map2.get(viejo) - 1);
                }

                
                if (map1.equals(map2)) {
                    System.out.println("YES");
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                System.out.println("NO");
            }
        }
        leer.close();
    }
}
