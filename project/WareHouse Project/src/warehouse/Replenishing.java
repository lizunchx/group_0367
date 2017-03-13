package warehouse;

import warehouse.Fascia;
import warehouse.ReserveRoom;

public class Replenishing {
	
	static String[] resupplierRecord;
	
	//public method to check stock every time a picker records a fascia being picked up.
	public boolean checkStock(String fasciaId){
		if (fasciaId.randomMethod() >= 6){
			return true;
		}
		
		else{
			return false;
		}
		
	}
	
	public void replenish(String fasciaId, Fascia f){
		if (checkStock(fasciaId) == true){
			ReserveRoom.moveToFloor(f);
			}
		resupplierRecord.add(f);
		}
	
}