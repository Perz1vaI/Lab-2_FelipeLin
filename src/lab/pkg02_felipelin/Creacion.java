package lab.pkg02_felipelin;

import java.util.Random;

public class Creacion {

    public Random rand = new Random();

    // Atributos Modificables
    private String clase;
    private String raza;
    private String nombre;
    private double estatura;
    private double peso;
    private int edad;
    private String descripcion;
    private String Nacionalidad;

    // Atributos de aspecto jugable
    // HP
    private int hpMediano = rand.nextInt(10) + 51;
    private int hpEnano = rand.nextInt(20) + 81;
    private int hpElfo = rand.nextInt(20) + 51;
    private int hpHumano = rand.nextInt(35) + 41;

    // CS
    private int csClerigo = 97;
    private int csBarbaro = 93;
    private int csMago = 101;
    private int csPicaro = 80;

    // AC
    private int acClerigo = 40;
    private int acBarbaro = 65;
    private int acMago = 20;
    private int acPicaro = 50;

    // DG
    private int dgClerigo = rand.nextInt(10) + 6;
    private int dgBarbaro = rand.nextInt(15) + 16;
    private int dgMago = rand.nextInt(5) + 6;
    private int dgPicaro = rand.nextInt(10) + 16;

    public Creacion(String clase, String raza, String nombre, double estatura, double peso, int edad, String descripcion, String Nacionalidad) {
        this.clase = clase;
        this.raza = raza;
        this.nombre = nombre;
        this.estatura = estatura;
        this.peso = peso;
        this.edad = edad;
        this.descripcion = descripcion;
        this.Nacionalidad = Nacionalidad;
    }

    public String getRaza() {
        return raza;
    }

    public String getNombre() {
        return nombre;
    }

    public double getEstatura() {
        return estatura;
    }

    public double getPeso() {
        return peso;
    }

    public int getEdad() {
        return edad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public String getClase() {
        return clase;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    @Override
    public String toString() {
        return "" + "clase=" + clase + ", raza=" + raza + ", nombre=" + nombre + ", estatura=" + estatura + ", peso=" + peso + ", edad=" + edad + ", descripcion=" + descripcion + ", Nacionalidad=" + Nacionalidad;
    }

}
