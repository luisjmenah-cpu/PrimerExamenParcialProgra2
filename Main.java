import Excercises.AnalisisDatos;
import Excercises.GestionCalificaciones;
import Excercises.GestionEmpleados;
import Excercises.OperacionesBancarias;
import java.util.Scanner;

public class Main { 
    public static void main(String[] args) {
    
// Solicitar al usuario que ingrese la operación a realizar
    System.out.println("Ingrese la operacion a realizar: ");
    System.out.println("1. Gestion de Calificaciones");
    System.out.println("2. Gestion de Empleados");
    System.out.println("3. Operaciones Bancarias");
    System.out.println("4. Analisis de Datos");

// Leer la opción seleccionada por el usuario
        Scanner lectura = new Scanner(System.in);
        int operacion = lectura.nextInt();
        lectura.close(); 
switch (operacion) {
            case 1:
                GestionCalificaciones.ejecutar();
                break;
            case 2:
                GestionEmpleados.ejecutar();
                break;
            case 3:
                OperacionesBancarias.ejecutar();
                break;
            case 4:
                AnalisisDatos.ejecutar();
                break;
               


            default:
                System.out.println("Operacion no valida.");
                break;  
                
            

                     }
    }
}
