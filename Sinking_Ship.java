import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sinking_Ship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); 
        scanner.nextLine(); 
        
        List<String> rats = new ArrayList<>();
        List<String> womenAndChildren = new ArrayList<>();
        List<String> men = new ArrayList<>();
        String captain = "";

  
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            String[] parts = line.split(" ");
            String name = parts[0];
            String role = parts[1];

            switch (role) {
                case "rat":
                    rats.add(name);
                    break;
                case "woman":
                case "child":
                    womenAndChildren.add(name);
                    break;
                case "man":
                    men.add(name);
                    break;
                case "captain":
                    captain = name;
                    break;
                default:
                    throw new IllegalArgumentException("Rol desconocido: " + role);
            }
        }

  
        for (String name : rats) {
            System.out.println(name);
        }
        for (String name : womenAndChildren) {
            System.out.println(name);
        }
        for (String name : men) {
            System.out.println(name);
        }
        if (!captain.isEmpty()) {
            System.out.println(captain);
        }
    }
}
