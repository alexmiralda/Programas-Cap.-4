public class Tablero {
    public static void main(String[] args) {

        System.out.println("\nImprime un tablero de damas: ");

        // Variables
        int contadorH = 1;
        int contadorV = 1;
        int tm = 8;

        // Tabla hecha por medio del ciclo while
        while (contadorV <= tm) {
            contadorH = 1;
            while (contadorH <= tm) {
                if (0 == contadorV % 2)
                    System.out.print("* ");
                else
                    System.out.print(" *");

                contadorH++;
            }
            System.out.print("\n");
            contadorV++;
        }

    }

}
