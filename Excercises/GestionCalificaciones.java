
package Excercises;
import Model.Estudiante;

public class GestionCalificaciones {
    
    //metodo para ejecutar 
    public static void ejecutar() {
    // Crear un arreglo de estudiantes con sus calificaciones
    Estudiante[] estudiantes = new Estudiante[3];
    estudiantes[0] = new Estudiante("Sócrates", 1, new double[]{55.5, 60.0, 55.0});
    estudiantes[1] = new Estudiante("Platón", 2, new double[]{92.0, 88.5, 95.0});
    estudiantes[2] = new Estudiante("Aristóteles", 3, new double[]{75.0, 80.5, 70.0});
    
    int aprobados = 0;
    int reprobados = 0;

    //for each

    for (Estudiante e : estudiantes) {
        
        e.mostrarInformacion();

        if (e.aprueba()) {
            aprobados++;
        } else {
            reprobados++;
        }

    }

    System.out.println("Estudiantes aprobados: " + aprobados);
    System.out.println("Estudiantes reprobados: " + reprobados);

    }  
}
