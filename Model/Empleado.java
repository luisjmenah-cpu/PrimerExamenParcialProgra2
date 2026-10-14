
package Model;

public class Empleado extends Persona {
    
    private int numeroEmpleado;
    private double salario;

    //constructor que reicbe ombre, edad, numeroEmpleado y salario
    public Empleado(String nombre, int edad, int numeroEmpleado, double salario) {
        super(nombre, edad);
        this.numeroEmpleado = numeroEmpleado;
        this.salario = salario;
    }

    //getters y setters
    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    //metodo calcular bono anual del 15%

    public double calcularBonoAnual() {
        return salario * 0.15;
    }

    //metodo mostrar informacion

    public void mostrarInformacion() {
        super.presentarse();
        System.out.println("Número de empleado: " + numeroEmpleado);
        System.out.println("Salario: " + salario);
        System.out.println("Bono anual: " + calcularBonoAnual());
    }



}
