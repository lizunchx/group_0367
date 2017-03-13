package warehouseObject;

public class Forklift {

	private String [] sku = new String[8];
	public int numberOfFacia = 0;
	private String [] orderNumber = new String[8];
	
	public Forklift (String sku, String orderNumber)
	{
		this.sku[numberOfFacia] = sku;
		this.orderNumber[numberOfFacia] = orderNumber;
		numberOfFacia++;
	}
	
}
