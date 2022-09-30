
//Programa 4.20
/* Programa que cálcula el salario de tres empleados, con una cuota fija 
en las primeras 40 horas trabajadas y pagando cuota y media por cada horas extra.
El salario cuando se incluyen horas extras aumenta mucho debido a que se paga cuota y media por hora extra;
es decir, su salario normal en 40 horas más la mitad del mismo.
 */

import java.util.Scanner;

public class CalculadoraSalario {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Variables
        int h1, h2, h3, t1, t2, t3, c1, c2, c3, cuota_media1, cuota_media2, cuota_media3, te1, te2, te3;
        int exh1, exh2, exh3, st1, st2, st3;

        // Título del programa
        System.out.print("\n\t\t\tPrograma que cálcula el salario por horas trabajadas\n");

        // Entrada de datos
        System.out.print("\n\tIngrese las horas del primer empleado: ");
        h1 = entrada.nextInt();
        System.out.print("\n\tIngrese la tarifa del primer empleado: ");
        t1 = entrada.nextInt();

        // Cálculos para cada uno de los tres empleados
        if (h1 <= 40) {

            c1 = h1 * t1;
            System.out.printf("\n\t El salario de este empleado es de: %s%n%n", c1);

        } else {

            exh1 = h1 - 40;
            c1 = 40 * t1;
            cuota_media1 = c1 / 2;
            te1 = c1 + cuota_media1;
            st1 = (exh1 * te1) + c1;

            System.out.printf("\n\t Las horas extras de este empleados son: %s", exh1);
            System.out.printf("\n\t Su salario normal es de: %s ", c1);
            System.out.printf("\n\t Su salario con las horas extras es de: %s ", st1);
            System.out.printf("\n\t Teniendo en cuenta que se paga cuota y media por cada hora extra trabajada. %n%n");

        }

        System.out.print("\n\tIngrese las horas del segundo empleado: ");
        h2 = entrada.nextInt();
        System.out.print("\n\tIngrese la tarifa del segundo empleado: ");
        t2 = entrada.nextInt();

        if (h2 <= 40) {

            c2 = h2 * t2;
            System.out.printf("\n\t El salario de este empleado es de: %s %n%n ", c2);

        } else {

            exh2 = h2 - 40;
            c2 = 40 * t2;
            cuota_media2 = c2 / 2;
            te2 = c2 + cuota_media2;
            st2 = (exh2 * te2) + c2;

            System.out.printf("\n\t Las horas extras de este empleados son: %s", exh2);
            System.out.printf("\n\t Su salario normal es de: %s ", c2);
            System.out.printf("\n\t Su salario con las horas extras es de: %s ", st2);
            System.out.printf("\n\t Teniendo en cuenta que se paga cuota y media por cada hora extra trabajada. %n%n");

        }

        System.out.print("\n\tIngrese las horas del tercer empleado: ");
        h3 = entrada.nextInt();
        System.out.print("\n\tIngrese la tarifa del tercer empleado: ");
        t3 = entrada.nextInt();

        if (h3 <= 40) {

            c3 = h3 * t3;
            System.out.printf("\n\t El salario de este empleado es de: %s %n%n ", c3);

        } else {

            exh3 = h3 - 40;
            c3 = 40 * t3;
            cuota_media3 = c3 / 2;
            te3 = c3 + cuota_media3;
            st3 = (exh3 * te3) + c3;

            System.out.printf("\n\t Las horas extras de este empleados son: %s", exh3);
            System.out.printf("\n\t Su salario normal es de: %s ", c3);
            System.out.printf("\n\t Su salario con las horas extras es de: %s ", st3);
            System.out.printf("\n\t Teniendo en cuenta que se paga cuota y media por cada hora extra trabajada. %n%n");

        }

        entrada.close();
    }

}