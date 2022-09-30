
//Programa 4.19
/*Programa que calcula el ingreso de un vendedor recibiendo 200 USD a la semana
mas el 9% de sus ventas brutas.
Tabla base para trabjar:
 Artículo valor
1 239.99
2 129.75
3 99.95
4 350.89
 */
import java.util.Scanner;

public class IngresoVendedor {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        //Variables
        double n1, n2, n3, n4, t1, t2, t3, t4, tot_articulos, comision, tot_ingresos;

        //Título del programa
        System.out.print("\n\t\t\t Programa que cálcula los ingresos de un vendedor por comisión\n");

        //Entrada de adtos
        System.out.print("\n\t Cúantos artículos de Tipo1(239.99) vendio en la semana: ");
        n1 = entrada.nextDouble();
        System.out.print("\n\t Cúantos artículos de Tipo2(129.75) vendio en la semana: ");
        n2 = entrada.nextDouble();
        System.out.print("\n\t Cúantos artículos de Tipo3(99.95) vendio en la semana: ");
        n3 = entrada.nextDouble();
        System.out.print("\n\t Cúantos artículos de Tipo4(350.89) vendio en la semana: ");
        n4 = entrada.nextDouble();

        //Cálculos
        t1 = 239.99 * n1;
        t2 = 129.75 * n2;
        t3 = 99.95 * n3;
        t4 = 350.89 * n4;

        tot_articulos = t1 + t2 + t3 + t4;
        comision = 0.09 * tot_articulos;
        tot_ingresos = 200 + comision;

        //Muestra de resultados
        System.out.printf("\n\t El total de las ventas que realizó en la semana es de %.2f dolares.%n", tot_articulos);
        System.out.printf("\n\t La comisión ganada del vendedor es de %.2f dolares.%n", comision);
        System.out.printf("\n\t Ahora se suman los 200 dolares que gana a la semana más la comisión %.2f dolares.%n",comision);
        System.out.printf("\n\t Los ingresos del vendedor en la semana son de %.2f dolares.%n", tot_ingresos);
        System.out.printf("\n\t Fin del programa %n%n");

        entrada.close();

    }

}