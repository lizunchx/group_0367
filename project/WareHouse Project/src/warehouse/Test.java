package warehouse;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

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
	}

}