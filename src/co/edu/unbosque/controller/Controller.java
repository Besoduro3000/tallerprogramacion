package co.edu.unbosque.controller;

import co.edu.unbosque.model.CSV;
import co.edu.unbosque.model.Metodos;
import co.edu.unbosque.view.View;


/**
 * The type Controller.
 */
public class Controller {
    /**
     * The View.
     */
    View view;

    /**
     *  clase metodo paquete model
     */

    private Metodos metodos;

    /**
     * Instantiates a new Controller.
     */
    public Controller() {
        view = new View();
        
        metodos = new Metodos ();
         //test
         
         String factura;
        System.out.println("Ingrese el numero de la factura:");
        factura = view.lectura();
         System.out.println(metodos.findByInvoiceNo(factura));
        System.out.println("Total de ventas:\n"+"$"+metodos.Summary());
        System.out.println(metodos.countByStockCode("84029G"));
        System.out.println(metodos.avgMonthlySales());

        String descripcion;
        System.out.println("Ingrese el nombre de la descripcion: (TODO EN MAYUSCULA DOBLE ENTER)");
        descripcion = view.lectura();
        System.out.println(metodos.findPartiallyByDescription(descripcion));
















    }
}
