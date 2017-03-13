package warehouse;

import java.util.ArrayList;

import warehouseObject.Facia;
import warehouseObject.SpecialPallet;

public class Sequencing {
	public static int pickingId = 1;
	public static ArrayList[] barCodeReader;
	ArrayList<Facia> front = new ArrayList<Facia>(4);
	ArrayList<Facia> rear = new ArrayList<Facia>(4);
	
	public Sequencing (ArrayList<Facia> faciaList){
		ArrayList<Integer> skuList = Picking.getSKUList();
		
		for (int i = 0; i < 8 ; i++){
			for (Facia f : faciaList) {
				if (Integer.parseInt(f.getSKU()) == (int) skuList.get(i)) {
					if (i%2==0) {
						// front
						front.add(f);
					} else {
						rear.add(f);
					}
				} else {
					//discard
					throw new RuntimeException();
				}
			}
		}
			
		
		SpecialPallet firstSpecial = new SpecialPallet(front.get(0), front.get(1),front.get(2), front.get(3), pickingId);
		SpecialPallet secondSpecial = new SpecialPallet(rear.get(0), rear.get(1), rear.get(2), rear.get(3), pickingId);
		
	}


	}
