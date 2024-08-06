import java.util.HashMap;
import java.util.Scanner;

public class KString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();  
        String s = scanner.next();  

        HashMap<Character, Integer> mapaFrecuencias = new HashMap<>();
        for (char c : s.toCharArray()) {
            mapaFrecuencias.put(c, mapaFrecuencias.getOrDefault(c, 0) + 1);
        }

        boolean posible = true;
        for (int frecuencia : mapaFrecuencias.values()) {
            if (frecuencia % k != 0) {
                posible = false;
                break;
            }
        }

        if (posible) {
            StringBuilder resultado = new StringBuilder();
            for (char c : mapaFrecuencias.keySet()) {
                int cantidad = mapaFrecuencias.get(c);
                for (int i = 0; i < cantidad / k; i++) {
                    resultado.append(c);
                }
            }
            
            StringBuilder resultadoFinal = new StringBuilder();
            for (int i = 0; i < k; i++) {
                resultadoFinal.append(resultado);
            }
            
            System.out.println(resultadoFinal.toString());
        } else {
            System.out.println("-1");
        }
    }
}
