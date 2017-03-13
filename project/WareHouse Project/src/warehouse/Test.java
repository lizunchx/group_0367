package warehouse;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;

import warehouseObject.Facia;

public class Test {

	public static void main(String[] args) throws ParseException {
	
		Orders o2 = new Orders("White", "SEL");
		System.out.println(o2.getFrontSKU());
		System.out.println(o2.getBackSKU());
		
		Orders o3 = new Orders("Beige", "S");
		System.out.println(o3.getFrontSKU());
		System.out.println(o3.getBackSKU());
		
		Orders o1 = new Orders("Blue", "SES");
		System.out.println(o1.getFrontSKU());
		System.out.println(o1.getBackSKU());
		
		Orders o4 = new Orders("Birch", "SEL");
		System.out.println(Picking.getSKUList());
		
		
		Facia fa1 = new Facia("White", "8", false);
		Facia fa2 = new Facia("Beige", "9", true);
		Facia fa3 = new Facia("White", "7", true);
		Facia fa4 = new Facia("Beige", "10", false);
		
		Facia fa5 = new Facia("Blue", "37", true);
		Facia fa6 = new Facia("Birch", "56", false);
		Facia fa7 = new Facia("Blue", "38", false);
		Facia fa8 = new Facia("Birch", "55", true);
		
		ArrayList<Facia> asdf= new ArrayList<Facia>();
		
		asdf.add(fa1);
		asdf.add(fa2);
		asdf.add(fa3);
		asdf.add(fa4);
		asdf.add(fa5);
		asdf.add(fa6);
		asdf.add(fa7);
		asdf.add(fa8);
		
		Sequencing c = new Sequencing(asdf);
	}

}