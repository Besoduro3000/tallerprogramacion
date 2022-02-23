package co.edu.unbosque.controller;

import co.edu.unbosque.model.CSV;
import co.edu.unbosque.model.Metodos;
import co.edu.unbosque.view.View;


public class Controller {
    View view;

	private Metodos metodos; 
	
    public Controller() {
        view = new View();
        
        metodos = new Metodos ();
         //test
         
         String factura;
        System.out.println("Ingrese el numero de la factura:");
        factura = view.lectura();
         System.out.println(metodos.findByInvoiceNo(factura));
        System.out.println("Total de ventas:\n"+"$"+metodos.Summary());
                
                
       
        
        
        
        
        
        
        
        
        
    
	
	
    }
}
