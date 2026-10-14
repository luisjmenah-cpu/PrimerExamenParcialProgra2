package Excercises;

public class AnalisisDatos {
   
   
//metodo para ejecutar el analisis de datos
    public static void ejecutar() {

         //arreglo de numeros
        int [] numeros ={45, 23, 67, 12, 89, 34, 56, 78, 91, 23, 45, 67, 34, 56, 78};
        //variables para almacenar los resultados
        int suma = 0;
        int mayor = numeros[0];
        int menor = numeros[0];
        int mayorPromedio = 0;
       
        for (int numero : numeros) {
            suma += numero;
            if (numero > mayor) {
                mayor = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }
        // Calcular el promedio y la cantidad de números mayores al promedio
        double promedio = (double) suma / numeros.length;

        for (int numero : numeros) {
            if (numero > promedio) {
                mayorPromedio++;
            }
        }
        // Mostrar resultados
        System.out.println("Suma: " + suma);
        System.out.println("Cantidad de números mayores al promedio: " + mayorPromedio);
        System.out.println("Promedio: " + promedio);
        System.out.println("Número mayor: " + mayor);
        System.out.println("Número menor: " + menor);
        System.out.println("Números pares: ");
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                System.out.print(numero + " ");
            }
        }
        System.out.println(); 
    }
}
