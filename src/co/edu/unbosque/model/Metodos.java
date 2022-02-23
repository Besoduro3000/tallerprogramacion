package co.edu.unbosque.model;

import co.edu.unbosque.model.Registro;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import co.edu.unbosque.model.CSV;

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
	public String findPartiallyByDescription (String search ) {

		String solucion = "";

		ArrayList<Registro> registros = new ArrayList<>();

		for (int i = 0; i < arrayRegistros.size(); i++) {
			Registro actual = arrayRegistros.get(i);
			String description = arrayRegistros.get(i).getDescription();

			if (description.contains(search)) {

				System.out.println(csv.getCsvList().get(i).getDescription()+" : "+csv.getCsvList().get(i).getQuantity());
			}

		}






		return solucion;



	}

}
