package warehouseObject;

public class Facia {

	private String colour;
	private String sku;
	private boolean front;

	public Facia(String colour, String sku, boolean front) {
		this.colour = colour;
		this.sku = sku;
		this.front = front;
	}

	public String getSKU() {
		return sku;
	}
}
