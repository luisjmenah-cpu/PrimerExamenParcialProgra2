package Excercises;
import Model.Empleado;

public class GestionEmpleados {
    
    public static void ejecutar() {
        // Crear un arreglo de empleados
        Empleado[] empleados = new Empleado[3];
        empleados[0] = new Empleado("Mickey Mouse", 50,101, 1500000);
        empleados[1] = new Empleado("Rico McPato", 75, 102, 10000000);
        empleados[2] = new Empleado("Pedro el Malo", 45, 103, 4500000);
        double totalSalarios = 0;
        double totalBonos = 0;

        //bucle tradicional para recorrer el arreglo de empleados
        for (int i = 0; i < empleados.length; i++) {
            empleados[i].mostrarInformacion();
            totalSalarios += empleados[i].getSalario();
            totalBonos += empleados[i].calcularBonoAnual();
        }
        System.out.println("Total de salarios: " + totalSalarios);
        System.out.println("Total de bonos: " + totalBonos);
    }
}
