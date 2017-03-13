package warehouse;

import java.util.ArrayList;

import warehouseObject.Facia;
import warehouseObject.SpecialPallet;

public class Sequencing {
	public static int pickingId = 1;
	public static ArrayList[] barCodeReader;
	ArrayList<Facia> front = new ArrayList<Facia>(4);
	ArrayList<Facia> rear = new ArrayList<Facia>(4);
	private boolean isfound = false;
	
	public Sequencing (ArrayList<Facia> faciaList){
		ArrayList<Integer> skuList = Picking.getSKUList();
		for (int i = 0; i < 8 ; i++){

			for (Facia f : faciaList) {
				if (Integer.parseInt(f.getSKU()) == (int) skuList.get(i)) {
					isfound = true;
					if (i%2==0) {
						// front
						front.add(f);
						break;
					} else {
						rear.add(f);
						break;
					}
				}
			}
			if (!isfound){
					throw new RuntimeException();
			}
			isfound = false;
			
		}
		
		SpecialPallet firstSpecial = new SpecialPallet(front.get(0), front.get(1),front.get(2), front.get(3), pickingId);
		SpecialPallet secondSpecial = new SpecialPallet(rear.get(0), rear.get(1), rear.get(2), rear.get(3), pickingId);
		SpecialPallet third = new SpecialPallet(front.get(0), front.get(1),front.get(2), front.get(3), pickingId);
		SpecialPallet fourth = new SpecialPallet(rear.get(0), rear.get(1), rear.get(2), rear.get(3), pickingId);
		SpecialPallet fifth = new SpecialPallet(front.get(0), front.get(1),front.get(2), front.get(3), pickingId);
		SpecialPallet siexth = new SpecialPallet(rear.get(0), rear.get(1), rear.get(2), rear.get(3), pickingId);
		
		Loading.Load(secondSpecial, firstSpecial);
		Loading.Load(fourth, third);
		Loading.Load(siexth, fifth);
	
	}


	}
