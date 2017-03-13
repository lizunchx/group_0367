package warehouseObject;
import java.util.Stack;



public class Truck {
	private Stack <TruckLevel> truckStack = new Stack<TruckLevel>();
	private int level = 1;
	public void pushToTruck (TruckLevel o){
		if (level<11)
		{
			truckStack.push(o);
			level++;
		}
	}
}
