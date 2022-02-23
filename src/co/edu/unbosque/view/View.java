package co.edu.unbosque.view;

import java.util.Scanner;

/**
 * The type View.
 */
public class View {
    private final Scanner consola;

    /**
     * Instantiates a new View.
     */
    public View() {
        consola = new Scanner(System.in);

    }

    /**
     * Lectura string.
     *
     * @return the string
     */
    public String lectura() {
        String lectura = consola.nextLine();
        consola.nextLine();
        return lectura;
    }

}
