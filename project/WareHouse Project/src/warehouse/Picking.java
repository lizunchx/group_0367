package warehouse;

import java.util.ArrayList;

public class Picking {
	
	// No need to instantiate this class to use its method
	
	private static ArrayList<Integer> skuList;
	private static int PRID = 201700;

	public static void enterOrders() {
		
		
		skuList = new ArrayList<Integer>();
		
		for (int i=0; i<Orders.orderList.size(); i++) {
			
			int Fsku = Orders.orderList.get(i).getFrontSKU();
			int Bsku = Orders.orderList.get(i).getBackSKU();
			skuList.add(Fsku);
			skuList.add(Bsku);
			}
		
			
		System.out.println("Current list of skus: " + skuList);
		
		// These print statements can be modified later to log processed orders into files or something
		System.out.println("In this set of 4 orders: ");
		for (int i=0; i<4; i++) {
			System.out.printf("Order #%d: [Color: %s, Model: %s, FrontSKU: %d, BackSKU: %d]\n", i+1, Orders.orderList.get(i).getColour(), Orders.orderList.get(i).getModel(),
					Orders.orderList.get(i).getFrontSKU(), Orders.orderList.get(i).getBackSKU());
		}
		System.out.print("Picking request ID for this set of 4 orders is: " + PRID);
		System.out.println("\n");
		
		// Clears Orders' list
		Orders.clearList();
		PRID++;
		
	}
	
	// This method is to be called from within the generic software's methods 
	// to receive the skuList.
	public static ArrayList<Integer> getSKUList() {
		return skuList;
	}
}
