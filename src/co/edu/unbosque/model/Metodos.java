package co.edu.unbosque.model;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Metodos.
 */
public class Metodos {

	private Registro registro;
	private CSV csv;
	private List<Registro> arrayRegistros;

	/**
	 * Instantiates a new Metodos.
	 */
	public Metodos() {
		csv = new CSV("CSV/data.csv");
		arrayRegistros = csv.getCsvList();
		registro = new Registro(null, null, null, null, null, null, null, null);


	}

	/**
	 * Sum total sales int.
	 *
	 * @return the int
	 */
	public int sumTotalSales() {

		int solucion = 0;

		return solucion;
	}

	/**
	 * Find by invoice no string.
	 *
	 * @param invoiceNo the invoice no
	 * @return the string
	 */
	public String findByInvoiceNo(String invoiceNo) {
 // test
		String solucion = "";


		for (int i = 0; i < arrayRegistros.size(); i++) {
			String invoice = arrayRegistros.get(i).getInvoiceNo();

			//System.out.println("pepa");

			if (invoiceNo.equalsIgnoreCase(invoice)) {

				//System.out.println("dog");
				// System.out.println("pepa pig ");
				 System.out.println(csv.getCsvList().get(i));

			}
		}

		return solucion;
	}

	/**
	 * Summary int.
	 *
	 *
	 * @return the int
	 */
	public int Summary(){
		int total = 0;
		for(int i=0;i< csv.getCsvList().size();i++){

			Registro aux= csv.getCsvList().get(i);

			float quantity=Float.parseFloat(aux.getQuantity());

			float unitPrice=Float.parseFloat(aux.getUnitPrice());

			total= (int) (total+(quantity*unitPrice));
		}
		return total;
	}

	/**
	 * Count by stock code string.
	 *
	 * @param stockCode the stock code
	 * @return the string
	 */
	public String countByStockCode(String stockCode) {

		String solucion = "";

		int unidadesVendidas = 0;
		for (int i = 0; i < arrayRegistros.size(); i++) {
			String stockCo = arrayRegistros.get(i).getStockCode();


			if (stockCode.equalsIgnoreCase(stockCo)) {

				int j = Integer.parseInt(csv.getCsvList().get(i).getQuantity());
				unidadesVendidas = unidadesVendidas + j;

			}
		}

		System.out.println("la cantidad total de productos vendidos con el stockeCode  "+stockCode+" es :  "+unidadesVendidas);

		return solucion;
	}

	/**
	 * Find partially by description string.
	 *
	 * @param search the search
	 * @return the string
	 */
	public String findPartiallyByDescription (String search ) {

		String solucion = "";


		ArrayList<String> cosas = new ArrayList<String>();


		for (int i = 0; i < arrayRegistros.size(); i++) {

			String description = arrayRegistros.get(i).getDescription();

			if (description.contains(search)) {
				cosas.add(description);
			}
		}

		String enunciado  = "";
		int unidadesVendidas = 0;

		for (int i = 0; i < cosas.size(); i++) {

			enunciado = cosas.get(i);

			unidadesVendidas = 0;

			for (int j = 0; j < arrayRegistros.size(); j++) {

				String comp = arrayRegistros.get(j).getDescription();

				if (enunciado.equalsIgnoreCase(comp)) {

					int z = Integer.parseInt(csv.getCsvList().get(j).getQuantity());
					unidadesVendidas = unidadesVendidas + z;

				}
			}
			System.out.println(enunciado);
			System.out.println(unidadesVendidas);
		}

		return solucion;

	}
	   public  String avgMonthlySales (){
		String solucion = "";
		int totalUnidades = 0;
		   for(int i=0;i< csv.getCsvList().size();i++){
		   int c = Integer.parseInt(arrayRegistros.get(i).getQuantity());
			   totalUnidades = 9604686/(totalUnidades+c);


		   }
		   System.out.println("el promedio es: "+totalUnidades);
		   return solucion ;
	   }



}
