package co.edu.unbosque.model;

public class Registro {

	    private String invoiceNo;
	    private String stockCode;
	    private String description;
	    private String quantity;
	    private String invoiceDate;
	    private String unitPrice;
	    private String customerId;
	    private String country;

	    
	    
	    public Registro(String invoiceNo, String stockCode, String description, String quantity, String invoiceDate, String unitPrice, String customerId, String country) {
	        
	    	this.invoiceNo = invoiceNo;
	        this.stockCode = stockCode;
	        this.description = description;
	        this.quantity = quantity;
	        this.invoiceDate = invoiceDate;
	        this.unitPrice = unitPrice;
	        this.customerId = customerId;
	        this.country = country;
	    }

	    
	    public String getInvoiceNo() {
	        return invoiceNo;
	    }
	    public void setInvoiceNo(String invoiceNo) {
	        this.invoiceNo = invoiceNo;
	    }

	    
	    public String getStockCode() {
	        return stockCode;
	    }
	    public void setStockCode(String stockCode) {
	        this.stockCode = stockCode;
	    }

	    
	    public String getDescription() {
	        return description;
	    }
	    public void setDescription(String description) {
	        this.description = description;
	    }

	    
	    public String getQuantity() {
	        return quantity;
	    }
	    public void setQuantity(String quantity) {
	        this.quantity = quantity;
	    }

	    
	    public String getInvoiceDate() {
	        return invoiceDate;
	    }
	    public void setInvoiceDate(String invoiceDate) {
	        this.invoiceDate = invoiceDate;
	    }

	    
	    public String getUnitPrice() {
	        return unitPrice;
	    }
	    public void setUnitPrice(String unitPrice) {
	        this.unitPrice = unitPrice;
	    }

	    
	    public String getCustomerId() {
	        return customerId;
	    }
	    public void setCustomerId(String customerId) {
	        this.customerId = customerId;
	    }

	    
	    public String getCountry() {
	        return country;
	    }
	    public void setCountry(String country) {
	        this.country = country;
	    }

	    @Override
	    public String toString() {
	        return "Venta{" +
	                "invoiceNo='" + invoiceNo + '\'' +
	                ", stockCode='" + stockCode + '\'' +
	                ", description='" + description + '\'' +
	                ", quantity='" + quantity + '\'' +
	                ", invoiceDate='" + invoiceDate + '\'' +
	                ", unitPrice='" + unitPrice + '\'' +
	                ", customerId='" + customerId + '\'' +
	                ", country='" + country + '\'' +
	                '}';
	    }
	
	
}