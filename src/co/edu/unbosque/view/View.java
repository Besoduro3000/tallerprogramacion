package co.edu.unbosque.view;

import java.util.Scanner;

public class View {
    private final Scanner consola;

    public View() {
        consola = new Scanner(System.in);

    }

    public int lectura() {
        int numero = consola.nextInt();
        consola.nextLine();
        return numero;
    }

}
