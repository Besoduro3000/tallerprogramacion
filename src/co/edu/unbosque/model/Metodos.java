package co.edu.unbosque.model;

import co.edu.unbosque.model.Registro;

import java.util.Iterator;
import java.util.List;

import co.edu.unbosque.model.CSV;

public class Metodos {

	private Registro registro;
	private CSV csv;
	private List<Registro> arrayRegistros;

	public Metodos() {
		csv = new CSV("CSV/data.csv");
		arrayRegistros = csv.getCsvList();
		registro = new Registro(null, null, null, null, null, null, null, null);


	}

	public int sumTotalSales() {

		int solucion = 0;

		return solucion;
	}

	public String findByInvoiceNo(String invoiceNo) {
 // test
		String solucion = "";

		System.out.println("hola aaaaaaaaaaaa");

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

}
