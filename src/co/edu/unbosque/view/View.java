package co.edu.unbosque.view;

import java.util.Scanner;

public class View {
    private final Scanner consola;

    public View() {
        consola = new Scanner(System.in);

    }

    public String lectura(String invoiceNo) {
        String lectura = consola.nextLine();
        consola.nextLine();
        return lectura;
    }

}
