package warehouse;
import warehouseObject.Facia;
import java.util.ArrayList;

public class FloorStorage {
	private ArrayList<Integer> floorStructure;
	private InputOutput reading = new InputOutput();
	
	
	public FloorStorage(String initialStateFile){
		floorStructure = new ArrayList<>();
		initialState(initialStateFile);
		
	}
	
	
	public void initialState(String initialStateFile){
		for (int a=0; a<floorStructure.size(); a++)
		{
			floorStructure.add(30);
		}
		String split[] = reading.inputFile(initialStateFile);
		for (int b=0; b<split.length; b++){
			String z[] = split[b].split(",");
			int location = zoneToSKU(z);
			floorStructure.set(location, Integer.parseInt(z[4]));}
	}
	
	public void skuToZone(String  a){
		int sku = Integer.parseInt(a);
		String zone;
		int aisle = 0;
		int rack = 0;
		int level = 0;
		if (sku>24){
			zone = "B";
			if (sku>36){aisle = 1;
			if (sku>44){rack = 2;level = sku-44;}
			else if (sku>40){rack = 1; level = sku-40;}
			else {rack = 0; level = sku-36;}}
			if (sku>24){aisle = 0;
			if (sku>32){rack = 2; level = sku-32;}
			else if (sku>28){rack = 1; level = sku-28;}
			else {rack = 0; level = sku-24;}
			}}
		else {zone = "A";
		if (sku>12){aisle = 1;
		if (sku>20){rack = 2;level = sku-20;}
		else if (sku>16){rack = 1; level = sku-16;}
		else {rack = 0; level = sku-12;}}
		if (sku>=0){aisle = 0;
		if (sku>8){rack = 2; level = sku-8;}
		else if (sku>4){rack = 1; level = sku-4;}
		else {rack = 0; level = sku-24;}}}
		PickerDisplay n = new PickerDisplay(zone, aisle, rack, level);
		
	}
	
	public int zoneToSKU(String a1[]){
		int level = Integer.parseInt(a1[3]);
		int rack = Integer.parseInt(a1[2]);
		int aisle = Integer.parseInt(a1[1]);
		int location = 0;
		String zone = a1[0];
		if (zone.equals("B"))
		{
			location = location +23;}
		switch (aisle){
		case 0:
			location = location+7;
			break;
		case 1:
			location = location +8;
			break;
		}
		switch (rack){
		case 0:
			location = location +4;
			break;
		case 1:
			location = location+5;
			break;
		case 2: 
			location = location +6;
			break;
		}
		switch (level){
		case 0:
			location = location;
			break;
		case 1:
			location = location +1;
			break;
		case 2: 
			location = location +2;
			break;
		case 3: 
			location = location +3;
			break;
		}
		return location;
		
		}
	}
	
	
	