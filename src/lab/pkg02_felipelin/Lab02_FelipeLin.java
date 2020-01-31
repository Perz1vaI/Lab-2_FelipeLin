package lab.pkg02_felipelin;

import java.util.Scanner;

public class Lab02_FelipeLin {
    
    public static void main(String[] args) {
        int menu;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("1. Creacion de personaje \n2. Modificar personaje \n3. Ver atributos de un personaje"
                + "\n4. Eliminar Personaje \n5. Combate \n6. Salida");
        menu = leer.nextInt();
        while (menu != 6) {
            switch (menu) {
                case 1: {
                    
                    break;
                }
                case 2: {
                    break;
                }
                case 3: {
                    break;
                }
                case 4: {
                    break;
                }
                case 5: {
                    break;
                }
                case 6: {
                    System.exit(0);
                    break;
                }
                
                default:
                    throw new AssertionError();
            }
            
        }
        
    }
    
}
