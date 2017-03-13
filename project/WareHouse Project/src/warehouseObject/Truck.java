package warehouseObject;
import java.util.Stack;



public class Truck {
	private Stack <TruckLevel> truckStack = new Stack<TruckLevel>();
	public void pushToTruck (TruckLevel o){
		
			truckStack.push(o);
			
	}
}