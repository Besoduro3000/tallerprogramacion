package co.edu.unbosque.model;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * The type Csv.
 */
public class CSV {

	private List<Registro> csvList;

	/**
	 * Instantiates a new Csv.
	 *
	 * @param localpath the localpath
	 */
//test
	public CSV(String localpath) {
		csvList = new ArrayList<>();
		readFromPath(localpath);
	}

	/**
	 * Read from path.
	 *
	 * @param localpath the localpath
	 */
	public void readFromPath(String localpath) {
		System.out.println("Reading a CSV using OpenCSV library");
		try {
			CSVReader reader = new CSVReader(new FileReader(localpath));
			String[] linea;
			reader.readNext();
			do {
				linea = reader.readNext();
				if (linea != null) {
					try {
						String invoiceNo = linea[0];
						String stockCode = linea[1];
						String description = linea[2];
						String quantity = linea[3];
						String invoiceDate = linea[4];
						String unitPrice = linea[5];
						String customerId = linea[6];
						String country = linea[7];
						Registro registro = new Registro(invoiceNo, stockCode, description, quantity, invoiceDate,
								unitPrice, customerId, country);
						csvList.add(registro);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			} while ((linea != null));
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Gets csv list.
	 *
	 * @return the csv list
	 */
	public List<Registro> getCsvList() {
		return csvList;
	}


	/**
	 * Sets csv list.
	 *
	 * @param csvList the csv list
	 */
	public void setCsvList(List<Registro> csvList) {
		this.csvList = csvList;
	}


}
