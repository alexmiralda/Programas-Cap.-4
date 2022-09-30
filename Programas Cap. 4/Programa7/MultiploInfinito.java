//Ejercicio 4.33
//Programa que procesa los múltiplos de 2 con un ciclo infinito, para observar que sucede.

public class MultiploInfinito {
    public static void main(String[] args) {

        int numero = 0, contador = 1;

        while (contador == 1) {

            numero = numero + 1;
            System.out.printf(" %s ", (2 * numero));

        }

    }

}
