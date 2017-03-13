package warehouseObject;

public class Truck {

	private Object[] levels = new Object[10];
	private static int levelCounter = 0;
	
	public Truck (TruckLevel o)
	{
		levels[levelCounter] = o;
		levelCounter++;
	}
	
	
}
