
package Model;
import Excercises.GestionCalificaciones;


public class Estudiante {
//atributos
private String nombre;
private int matricula;
private double calificaciones[];
//constructor que reciba
public Estudiante(String nombre, int matricula, double[] calificaciones) {
    this.nombre = nombre;
    this.matricula = matricula;
    this.calificaciones = calificaciones;
}
//getters y setters

public String getNombre() {
    return nombre;
    }
public void setNombre(String nombre) {
    this.nombre = nombre;
    }
public int getMatricula() {
    return matricula;
    }

public void setMatricula(int matricula) {
    this.matricula = matricula;
}
public double[] getCalificaciones() {
    return calificaciones;
}

public void setCalificaciones(double[] calificaciones) {
    this.calificaciones = calificaciones;
}
//metodos
public double calcularPromedio() {
    double suma = 0;
    for (double promedio : calificaciones) {
        suma += promedio;
    }
    return suma / calificaciones.length;
}
public boolean aprueba() {
    return calcularPromedio() >= 60;
    }
public void mostrarInformacion() {
    System.out.println("Nombre: " + nombre);
    System.out.println("Matricula: " + matricula);
    System.out.print("Calificaciones: ");
    for (double calificacion : calificaciones) {
        System.out.print(calificacion + " ");
    }
    System.out.println();
    System.out.println("Promedio: " + calcularPromedio());
    if (aprueba()) {
        System.out.println("El estudiante aprueba.");
    } else {
        System.out.println("El estudiante no aprueba.");
    }


    }

}
