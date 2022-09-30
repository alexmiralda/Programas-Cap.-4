//Ejercicio 4.18
/*Programa que cálcula el crédito final de un cliente de una tienda 
 * y determina si este se excede del crédito disponible. 
 * En este caso usamos una base para el crédito de 10,000 lempiras.
 */

import java.util.Scanner;

public class CalculadoraCredito {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Variables
        int cuenta, saldo_incial, articulos, creditos, saldo_final, resto_credito;

        // Título del programa
        System.out.print("\n\t\t\t Programa que determina si un cliente se excede del crédito\n");

        System.out.print("\n\t Tenga en cuenta que su saldo de crédito es de 10,000 lempiras.\n");

        // Entrada de datos
        System.out.print("\n\t Ingrese su numero de cuenta (4 dígitos): ");
        cuenta = entrada.nextInt();
        System.out.print("\n\t Ingrese su saldo inicial al inicio del mes: ");
        saldo_incial = entrada.nextInt();
        System.out.print("\n\t Ingrese el total de sus articulos cargados (gastos): ");
        articulos = entrada.nextInt();
        System.out.print("\n\t Ingrese el total de sus créditos aquiridos durante el mes (rebajas): ");
        creditos = entrada.nextInt();

        saldo_final = (saldo_incial + articulos) - creditos;

        // Muestras de los resultados
        if (saldo_final >= 10000) {
            System.out.printf("\n\t El cliente con numero de cuenta %s se excedio del credito. ", cuenta);
            System.out.printf("\n\t Ya que su saldo final es de %s lempiras.", saldo_final);
            System.out.print("\n\t Fin del programa \n\n");
        } else {

            resto_credito = 10000 - saldo_final;
            System.out.printf(
                    "\n\t El cliente con número de cuenta %s todavia tiene un saldo en el credito de %s lempiras.",
                    cuenta, resto_credito);

            System.out.print("\n\t Fin del programa \n\n");
        }

        entrada.close();
    }

}
