//Ejercicio 4.22
//Programa que imprime una tabla con ciclos

public class SalidaTabular {
    public static void main(String[] args) {

        int numero = 0;

        // Tabla hecha mediante el ciclo while
        while (numero == 0) {

            System.out.printf("%n N  10*N  100*N  1000*N %n ");

            System.out.printf("%n %s   %s    %s    %s %n ", numero += 1, numero * 10, numero * 100, numero * 1000);

            System.out.printf("%n %s   %s    %s    %s %n ", numero += 1, numero * 10, numero * 100, numero * 1000);

            System.out.printf("%n %s   %s    %s    %s %n ", numero += 1, numero * 10, numero * 100, numero * 1000);

            System.out.printf("%n %s   %s    %s    %s %n ", numero += 1, numero * 10, numero * 100, numero * 1000);

            System.out.printf("%n %s   %s    %s    %s %n%n ", numero += 1, numero * 10, numero * 100, numero * 1000);

        }

    }
}