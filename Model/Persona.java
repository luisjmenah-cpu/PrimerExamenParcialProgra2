package Model;

public class Persona {
    //atributos
    private String nombre;
    private int edad;

    //constructor que inicialice los atributos
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        }
    
    //getters y setters
    public String getNombre() {
        return nombre;
        }
    public void setNombre(String nombre) {
        this.nombre = nombre;
        }
    public int getEdad() {
        return edad;
        }
    public void setEdad(int edad) {
        this.edad = edad;
        }
    
    //metodo presentarse

    public void presentarse() {
        System.out.println("Hola, mi nombre es " + nombre + " y tengo " + edad + " años.");
    }

}
