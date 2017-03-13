package warehouse;

import java.util.ArrayList;
import warehouseObject.Truck;
import warehouseObject.TruckLevel;
import warehouseObject.SpecialPallet;

public class Loading {

	private static int palletCounter = 0;
	private static int currentTruckLevel = 0;
	private static ArrayList<SpecialPallet> interim = new ArrayList<>(4);
	private static ArrayList<Truck> trucks = new ArrayList<>();

	public static void Load (SpecialPallet rear, SpecialPallet front) {
		palletCounter = palletCounter + 2;
		interim.add(rear);
		interim.add(front);
		if ((palletCounter == 4) && (currentTruckLevel < 11)) {
			if (trucks.size() == 0) {
				trucks.add(new Truck());
			}
			getOnTruck(trucks.get(trucks.size() - 1));
			palletCounter = 0;

		} else if (currentTruckLevel == 10) {
			trucks.add(new Truck());
			currentTruckLevel = 0;
			getOnTruck(trucks.get(trucks.size() - 1));
			palletCounter = 0;
		}
		
	}

	public static void getOnTruck(Truck t)
	{
		TruckLevel level = new TruckLevel (interim.get(0), interim.get(1), interim.get(2), interim.get(3));
		interim.clear();
		currentTruckLevel++;
		t.pushToTruck(level);
		// load TruckLevel onto truck
	}
	
}
