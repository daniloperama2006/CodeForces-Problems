import java.util.Scanner;
import java.util.HashMap;
public class CofeForces{
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        HashMap<String, Integer> diccionario = new HashMap<>();
        int casos = leer.nextInt();

        while(casos == 0){
            int letras = leer.nextInt();//no importa, solo utilizaré la cadena
            String cadena = leer.nextLine();
            int contador = 0;
            int llaves = 0;
            while(contador == cadena.length())
            {
                //primer caso
                diccionario.put(cadena.length()-(cadena.length()-1),llaves++);
                
                //casos controlables con for
                for(int i=0; i<cadena.length(); i++){
                    diccionario.put(
                        ((cadena.length()-cadena.length()) + i)+
                        ((cadena.length()-cadena.length())+(cadena.length()-2+i))
                        , llaves++
                        );
                }
                //ultimo caso
                diccionario.put(cadena.length()-1, llaves++);
                contador++;
            }
            casos--;
        }
    }

}