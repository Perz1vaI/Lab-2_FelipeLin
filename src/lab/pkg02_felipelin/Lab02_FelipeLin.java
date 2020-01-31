package lab.pkg02_felipelin;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lab02_FelipeLin {

    public static void main(String[] args) {
        int menu;
        Random rand = new Random();
        Scanner leer = new Scanner(System.in);
        ArrayList<Creacion> lista = new ArrayList();
        Creacion atri = new Creacion();
        lista.add(new Creacion("clerigo", "humano", "David", 1.75, 42.3, 19, "Queria ser mago cuando era un nene chiquito, pero se dio cuenta que no sirve", "norfair"));
        lista.add(new Creacion("barbaro", "mediano", "Roberto", 1.55, 69, 18, "Un joven barbaro con sueños grandes de ser un heroe, pero la realidad es de que es un simple hombre promedio", "brinstar"));
        lista.add(new Creacion("mago", "enano", "Ian", 1.25, 30.3, 80, "Un mago con mucha experiencia y un aventurero veterano", "maridia"));
        lista.add(new Creacion("picaro", "elfo", "Yoshikage Kira", 1.89, 72, 33, "My name is Yoshikage Kira. I'm 33 years old. My house is in the northeast section of Morioh, where all the villas are, and I am not married. I work as an employee for the Kame Yu department stores, and I get home every day by 8 PM at the latest. I don't smoke, but I occasionally drink. I'm in bed by 11 PM, and make sure I get eight hours of sleep, no matter what.", "zebes"));

        System.out.println("1. Creacion de personaje \n2. Modificar personaje \n3. Ver atributos de un personaje"
                + "\n4. Eliminar Personaje \n5. Combate \n6. Salida");
        menu = leer.nextInt();
        while (menu != 6) {
            switch (menu) {
                case 1: {
                    System.out.println("1. Clerigo \n2. Barbaro \n3. Mago \n4. Picaro \nDebera de escribir unos de las clases dependiendo que clase quiere");
                    leer.nextLine();
                    String clase = leer.nextLine();
                    while (!clase.contains("clerigo") && !clase.contains("barbaro") && !clase.contains("mago") && !clase.contains("picaro")) {
                        System.out.println("Solo puede escribir las clases en minuscula o solo puede escribir esas opciones que se le dan");
                        System.out.println("1. Clerigo \n2. Barbaro \n3. Mago \n4. Picaro \nDebera de escribir unos de las clases dependiendo que clase quiere");
                        clase = leer.nextLine();
                    }

                    System.out.println("Asigne el nombre de su personaje");
                    String nombre = leer.nextLine();

                    System.out.println("1. Mediano \n2. Enano \n3. Elfo \n4. Humano \nDebera de escribir unos de las razas dependiendo que raza quiere");
                    String raza = leer.nextLine();
                    while (!raza.contains("mediano") && !raza.contains("enano") && !raza.contains("enano") && !raza.contains("elfo")) {
                        System.out.println("Solo puede escribir las razas en minuscula o solo puede escribir esas opciones que se le dan");
                        System.out.println("1. Mediano \n2. Enano \n3. Elfo \n4. Humano \nDebera de escribir unos de las razas dependiendo que raza quiere");
                        raza = leer.nextLine();
                    }

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
                    while (!nacionalidad.contains("norfair") && !nacionalidad.contains("brinstar") && !nacionalidad.contains("maridia") && !nacionalidad.contains("zebes")) {
                        System.out.println("Solo puede escribir las nacionalidades en minuscula o solo puede escribir esas opciones que se le dan");
                        System.out.println("1. Norfair \n2. Brinstar \n3. Maridia \n4. Zebes \n5. Crateria \nDebera de escribir unos de las nacionalidades dependiendo que nacionalidad quiere");
                        nacionalidad = leer.nextLine();
                    }

                    lista.add(new Creacion(clase, raza, nombre, estatura, peso, edad, descripcion, nacionalidad));

                    break;
                }
                case 2: {
                    System.out.println("Ingrese la posicion que desea modificar");
                    int pos = leer.nextInt();

                    System.out.println("1. Clerigo \n2. Barbaro \n3. Mago \n4. Picaro \nDebera de escribir unos de las clases dependiendo que clase quiere");
                    leer.nextLine();
                    String clase = leer.nextLine();
                    while (!clase.contains("clerigo") && !clase.contains("barbaro") && !clase.contains("mago") && !clase.contains("picaro")) {
                        System.out.println("Solo puede escribir las clases en minuscula o solo puede escribir esas opciones que se le dan");
                        System.out.println("1. Clerigo \n2. Barbaro \n3. Mago \n4. Picaro \nDebera de escribir unos de las clases dependiendo que clase quiere");
                        clase = leer.nextLine();
                    }
                    ((Creacion) lista.get(pos)).setClase(clase);

                    System.out.println("Asigne el nombre de su personaje");
                    String nombre = leer.nextLine();
                    ((Creacion) lista.get(pos)).setNombre(nombre);

                    System.out.println("1. Mediano \n2. Enano \n3. Elfo \n4. Humano \nDebera de escribir unos de las razas dependiendo que raza quiere");
                    String raza = leer.nextLine();
                    while (!raza.contains("mediano") && !raza.contains("enano") && !raza.contains("enano") && !raza.contains("elfo")) {
                        System.out.println("Solo puede escribir las razas en minuscula o solo puede escribir esas opciones que se le dan");
                        System.out.println("1. Mediano \n2. Enano \n3. Elfo \n4. Humano \nDebera de escribir unos de las razas dependiendo que raza quiere");
                        raza = leer.nextLine();
                    }
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
                    while (!nacionalidad.contains("norfair") && !nacionalidad.contains("brinstar") && !nacionalidad.contains("maridia") && !nacionalidad.contains("zebes")) {
                        System.out.println("Solo puede escribir las nacionalidades en minuscula o solo puede escribir esas opciones que se le dan");
                        System.out.println("1. Norfair \n2. Brinstar \n3. Maridia \n4. Zebes \n5. Crateria \nDebera de escribir unos de las nacionalidades dependiendo que nacionalidad quiere");
                        nacionalidad = leer.nextLine();
                    }
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
                    // La preparacion para poner su jugador
                    int losecheck = 0;
                    int pos, cs = 0, ac = 0, dg = 0, hp = 1;
                    System.out.println("Ingrese la posicion de su personaje para jugar");
                    pos = leer.nextInt();
                    if (((Creacion) lista.get(pos)).getClase().contains("clerigo")) {
                        cs = atri.getCsClerigo();
                        ac = atri.getAcClerigo();
                        dg = atri.getDgClerigo();

                    } else if (((Creacion) lista.get(pos)).getClase().contains("barbaro")) {
                        cs = atri.getCsBarbaro();
                        ac = atri.getAcBarbaro();
                        dg = atri.getDgBarbaro();
                    } else if (((Creacion) lista.get(pos)).getClase().contains("picaro")) {
                        cs = atri.getCsPicaro();
                        ac = atri.getAcPicaro();
                        dg = atri.getDgPicaro();
                    } else if (((Creacion) lista.get(pos)).getClase().contains("mago")) {
                        cs = atri.getCsMago();
                        ac = atri.getAcMago();
                        dg = atri.getDgMago();
                    }
                    System.out.println(((Creacion) lista.get(pos)).getRaza());
                    if (((Creacion) lista.get(pos)).getRaza().contains("mediano")) {
                        hp = atri.getHpMediano();
                    } else if (((Creacion) lista.get(pos)).getRaza().contains("enano")) {
                        hp = atri.getHpEnano();

                    } else if (((Creacion) lista.get(pos)).getRaza().contains("elfo")) {
                        hp = atri.getHpElfo();

                    } else if (((Creacion) lista.get(pos)).getRaza().contains("humano")) {
                        hp = atri.getHpHumano();
                        System.out.println(hp);

                    }

                    // La preparacion de la computadora
                    int pos2, cs2 = 0, ac2 = 0, dg2 = 0, hp2 = 1;
                    System.out.println("Ingrese la posicion de su personaje para jugar");
                    pos2 = leer.nextInt();
                    if (((Creacion) lista.get(pos2)).getClase().contains("clerigo")) {
                        cs2 = atri.getCsClerigo();
                        ac2 = atri.getAcClerigo();
                        dg2 = atri.getDgClerigo();

                    } else if (((Creacion) lista.get(pos2)).getClase().contains("barbaro")) {
                        cs2 = atri.getCsBarbaro();
                        ac2 = atri.getAcBarbaro();
                        dg2 = atri.getDgBarbaro();
                    } else if (((Creacion) lista.get(pos2)).getClase().contains("picaro")) {
                        cs2 = atri.getCsPicaro();
                        ac2 = atri.getAcPicaro();
                        dg2 = atri.getDgPicaro();
                    } else if (((Creacion) lista.get(pos2)).getClase().contains("mago")) {
                        cs2 = atri.getCsMago();
                        ac2 = atri.getAcMago();
                        dg2 = atri.getDgMago();
                    }

                    if (((Creacion) lista.get(pos2)).getRaza().contains("mediano")) {
                        hp2 = atri.getHpMediano();
                        System.out.println(hp2);
                    } else if (((Creacion) lista.get(pos2)).getRaza().contains("enano")) {
                        hp2 = atri.getHpEnano();

                    } else if (((Creacion) lista.get(pos2)).getRaza().contains("elfo")) {
                        hp2 = atri.getHpElfo();

                    } else if (((Creacion) lista.get(pos2)).getRaza().contains("humano")) {
                        hp2 = atri.getHpHumano();

                    }

                    int opcion, roll, opcion2, roll2;
                    boolean check = false;
                    boolean check2 = false;
                    boolean hpcheck = false;
                    while (hp > 0 || hp2 > 0) {
                        System.out.println("------------" + ((Creacion) lista.get(pos)).getNombre() + "------------");
                        System.out.println("1. Atacar \n2. Defender");
                        System.out.println("Vida: " + hp);
                        opcion = leer.nextInt();

                        if (check) {
                            ac -= 15;
                            check = false;
                        }

                        if (opcion == 1) {

                            roll = rand.nextInt(100);
                            if (roll > ac2) {
                                if (roll > cs) {
                                    hp2 -= dg * 2;

                                }
                                hp2 -= dg;
                                System.out.println("A atacado a " + ((Creacion) lista.get(pos2)).getNombre() + " por " + dg + " de daño");
                            }
                            if (hp2 < 0) {
                                hpcheck = true;
                                losecheck = 1;
                            }
                            System.out.println("A fallado su ataque");
                        } else {
                            ac += 15;
                            check = true;
                            System.out.println("A escodigo defender");
                        }
                        System.out.println("------------" + ((Creacion) lista.get(pos2)).getNombre() + "------------");
                        System.out.println("1. Atacar \n2. Defender");
                        System.out.println("Vida: " + hp2);
                        opcion2 = leer.nextInt();

                        if (check2) {
                            ac2 -= 15;
                            check2 = false;
                        }

                        if (opcion2 == 1) {
                            roll2 = rand.nextInt(100);
                            if (roll2 > ac) {
                                if (roll2 > cs2) {
                                    hp -= dg2 * 2;

                                }
                                hp -= dg2;
                                System.out.println("A atacado a " + ((Creacion) lista.get(pos)).getNombre() + " por " + dg + " de daño");

                            }
                            if (hp < 0) {
                                hpcheck = true;
                                losecheck = 2;
                            }
                            System.out.println("A fallado su ataque");

                        } else {
                            ac2 += 15;
                            check2 = true;
                            System.out.println("A escodigo defender");
                        }
                        if (hpcheck) {
                            break;
                        }
                    }
                    System.out.println("\n");
                    if (losecheck == 1) {
                        System.out.println("" + ((Creacion) lista.get(pos)).getNombre() + " a ganado a " + ((Creacion) lista.get(pos2)).getNombre());
                    } else {
                        System.out.println("" + ((Creacion) lista.get(pos2)).getNombre() + " a ganado a " + ((Creacion) lista.get(pos)).getNombre());

                    }

                    break;
                }
                case 6: {
                    System.exit(0);
                    break;
                }

                default:
                    System.out.println("Error!");
            }
            System.out.println("\n\n");
            System.out.println("1. Creacion de personaje \n2. Modificar personaje \n3. Ver atributos de un personaje"
                    + "\n4. Eliminar Personaje \n5. Combate \n6. Salida");
            menu = leer.nextInt();
        }

    }

}
