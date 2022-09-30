//Ejercicio 4.17
/*Programa que cálcula el total de kilometros por litros
obtenidos en los viajes realizados en un carro.
*/

import java.util.Scanner;

public class KilometrosLitros {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Variables
        int km, lit, contadorkms = 0, contadorlitros = 0;
        double totalkm = 0, totalit = 0, promedio, promedio_indivi;

        // Título del programa
        System.out.println("\n\t\t\t Programa que cálcula el total de kilometros por litro en varios viajes");
        System.out.println("\n\t\t Puede ingresar los kilometros, o tambien finalizar el programa ingresando -1 ");
        System.out.print("\n\t\t Ingrese el total de kilometros recorridos en el viaje: ");
        km = entrada.nextInt();

        // Uso del método centínela mediante el ciclo while
        while (km != -1) {
            System.out.print("\n\t\t Ingrese el total de litros gastados en el viaje: ");
            lit = entrada.nextInt();

            contadorkms += km;
            contadorlitros += lit;
            totalkm = (double) contadorkms;
            totalit = (double) contadorlitros;
            promedio = totalkm / totalit;
            promedio_indivi = (double) km / lit;

            System.out.printf("\n\t\tEl promedio en este viaje fue de %.2f kilometros por litro. %n%n ",
                    promedio_indivi);

            System.out.print(
                    "\n\t\t Ingrese el total de kilometros recorridos en el viaje (para finalizar escriba -1):  ");
            km = entrada.nextInt();

            // Muestra de los resultados mediante el if
            if (km == -1) {

                //
                totalkm = (double) contadorkms;
                System.out.printf("\n\t\t El total de kilometros de todos los viajes es: %.2f km ", totalkm);

                //
                totalit = (double) contadorlitros;
                System.out.printf("\n\t\t El total de litros de todos los viajes es: %.2f litros ", totalit);
                System.out.printf("\n\t\t Se gastaron %.2f litros de gasolina en %.2f kilometros recorridos%n ",
                        totalit,
                        totalkm);

                //
                promedio = totalkm / totalit;
                System.out.printf(
                        "\n\t\t Dando como resultado un promedio de %.2f kilometros por litro entre todos los viajes.%n%n ",
                        promedio);

                System.out.printf("\n\t\t\tFin del programa%n%n");
            }
        }

        entrada.close();
    }

}
