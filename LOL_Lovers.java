import java.util.Scanner;

public class LOL_Lovers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        String alimentos = scanner.next();
        
        int conteoPanes = 0;
        int conteoCebollas = 0;
        
        for (int i = 0; i < n; i++) {
            if (alimentos.charAt(i) == 'L') {
                conteoPanes++;
            } else {
                conteoCebollas++;
            }
        }
        
        for (int k = 1; k < n; k++) {
            int misPanes = 0;
            int misCebollas = 0;
            
            for (int i = 0; i < k; i++) {
                if (alimentos.charAt(i) == 'L') {
                    misPanes++;
                } else {
                    misCebollas++;
                }
            }
            
            int panesAmigo = conteoPanes - misPanes;
            int cebollasAmigo = conteoCebollas - misCebollas;
            
            if (misPanes != panesAmigo && misCebollas != cebollasAmigo) {
                System.out.println(k);
                return;
            }
        }
        
        System.out.println("-1");
    }
}
