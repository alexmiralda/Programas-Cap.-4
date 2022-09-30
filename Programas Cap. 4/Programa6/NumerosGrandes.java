//Ejercicio 2.21
//Programa que encuentra el numero mayor entre 10 numeros ingresados

import java.util.Scanner;

public class NumerosGrandes {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero, contador = 1, mayor;

        // Título del programa
        System.out.print("\n\t\t Programa que encuentra el número mayor entre 10 numeros \n\n");
        System.out.print("Ingrese un número: ");
        mayor = entrada.nextInt();
        contador += 1;

        // Proceso
        while (contador <= 10) {

            System.out.print("Ingrese un número: ");
            numero = entrada.nextInt();
            contador += 1;

            if (numero > mayor) {

                mayor = numero;

            }

        }

        // Muestra de resultados
        System.out.printf("\nEl número mayor es: %s %n%n", mayor);

        entrada.close();

    }

}