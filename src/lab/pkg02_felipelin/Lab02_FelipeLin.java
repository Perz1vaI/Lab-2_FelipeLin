package lab.pkg02_felipelin;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab02_FelipeLin {

    public static void main(String[] args) {
        int menu;
        Scanner leer = new Scanner(System.in);
        ArrayList<Creacion> lista = new ArrayList();

        System.out.println("1. Creacion de personaje \n2. Modificar personaje \n3. Ver atributos de un personaje"
                + "\n4. Eliminar Personaje \n5. Combate \n6. Salida");
        menu = leer.nextInt();
        while (menu != 6) {
            switch (menu) {
                case 1: {
                    System.out.println("1. Clerigo \n2. Barbaro \n3. Mago \n4. Picaro \nDebera de escribir unos de las clases dependiendo que clase quiere");
                    leer.nextLine();
                    String clase = leer.nextLine();

                    System.out.println("Asigne el nombre de su personaje");
                    String nombre = leer.nextLine();

                    System.out.println("1. Mediano \n2. Enano \n3. Elfo \n4. Humano \nDebera de escribir unos de las razas dependiendo que raza quiere");
                    String raza = leer.nextLine();

                    System.out.println("Ingrese estatura del personaje: ");
                    double estatura = leer.nextDouble();

                    System.out.println("Ingrese peso del personaje: ");
                    double peso = leer.nextDouble();

                    System.out.println("Ingrese edad del personaje: ");
                    int edad = leer.nextInt();

                    System.out.println("Ingrese una descripcion de su personaje: ");
                    leer.nextLine();
                    String descripcion = leer.nextLine();

                    System.out.println("1. Norfair \n2. Brinstar \n3. Maridia \n4. Zebes \n5. Crateria \nDebera de escribir unos de las nacionalidades dependiendo que nacionalidad quiere");
                    String nacionalidad = leer.nextLine();

                    lista.add(new Creacion(clase, raza, nombre, estatura, peso, edad, descripcion, nacionalidad));

                    break;
                }
                case 2: {
                    System.out.println("Ingrese la posicion que desea modificar");
                    int pos = leer.nextInt();

                    System.out.println("1. Clerigo \n2. Barbaro \n3. Mago \n4. Picaro \nDebera de escribir unos de las clases dependiendo que clase quiere");
                    leer.nextLine();
                    String clase = leer.nextLine();
                    ((Creacion) lista.get(pos)).setClase(clase);

                    System.out.println("Asigne el nombre de su personaje");
                    String nombre = leer.nextLine();
                    ((Creacion) lista.get(pos)).setNombre(nombre);

                    System.out.println("1. Mediano \n2. Enano \n3. Elfo \n4. Humano \nDebera de escribir unos de las razas dependiendo que raza quiere");
                    String raza = leer.nextLine();
                    ((Creacion) lista.get(pos)).setRaza(raza);

                    System.out.println("Ingrese estatura del personaje: ");
                    double estatura = leer.nextDouble();
                    ((Creacion) lista.get(pos)).setEstatura(estatura);

                    System.out.println("Ingrese peso del personaje: ");
                    double peso = leer.nextDouble();
                    ((Creacion) lista.get(pos)).setPeso(peso);

                    System.out.println("Ingrese edad del personaje: ");
                    int edad = leer.nextInt();
                    ((Creacion) lista.get(pos)).setEdad(edad);

                    System.out.println("Ingrese una descripcion de su personaje: ");
                    leer.nextLine();
                    String descripcion = leer.nextLine();
                    ((Creacion) lista.get(pos)).setDescripcion(descripcion);

                    System.out.println("1. Norfair \n2. Brinstar \n3. Maridia \n4. Zebes \n5. Crateria \nDebera de escribir unos de las nacionalidades dependiendo que nacionalidad quiere");
                    String nacionalidad = leer.nextLine();
                    ((Creacion) lista.get(pos)).setNacionalidad(nacionalidad);

                    break;
                }
                case 3: {
                    int num = 1;
                    for (Creacion creacion : lista) {

                        System.out.println(num + ". " + creacion);
                        num++;
                    }
                    break;
                }
                case 4: {
                    System.out.println("Ingrese la posicion que desea eliminar");
                    int pos = leer.nextInt();

                    lista.remove(pos);
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
                    System.out.println("Error!");
            }
            System.out.println("1. Creacion de personaje \n2. Modificar personaje \n3. Ver atributos de un personaje"
                    + "\n4. Eliminar Personaje \n5. Combate \n6. Salida");
            menu = leer.nextInt();
        }

    }

}
