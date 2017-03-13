package warehouse;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.text.ParseException;
import java.util.ArrayList;

public class Orders {

	private String colour;
	private String model;
	private String skuFront;
	private String skuBack;
	private int frontSKU;
	private int backSKU;
	public static ArrayList<Orders> orderList;

	public Orders(String colour, String model) throws ParseException {
		this.colour = colour;
		this.model = model;

		skuLookUp(model, colour);

		frontSKU = Integer.parseInt(skuFront);
		backSKU = Integer.parseInt(skuBack);

		if (orderList == null) {
			orderList = new ArrayList<Orders>();
		}
		orderList.add(this);
		scheduleForPicking();
	}

	private void scheduleForPicking() {
		// When there are 4 orders, enter them into system
		if (orderList.size() == 4) {
			Picking.enterOrders();
		}
	}

	private void skuLookUp(String model, String colour) throws InvalidInputException {

		InputOutput io = new InputOutput();
		ArrayList<String> ttb = new ArrayList<>();

		try {
			ttb = io.inputFile("translation.csv");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String target = colour + "," + model + ",";

		for (String s : ttb) {
			String letters = s.replaceAll("[0-9]", "");
			if (letters.toLowerCase().contains(target.toLowerCase())) {
				String temp = s.replaceAll("[^0-9]", "");
				if (temp.length() == 2) {
					System.out.println("2222222");
					skuFront = temp.substring(0, 1);
					skuBack = temp.substring(1);
					break;
				} else if (temp.length() == 3) {
					System.out.println("33333333");
					skuFront = temp.substring(0, 1);
					skuBack = temp.substring(1);
					break;
				} else if (temp.length() == 4) {
					System.out.println("44444444444");
					skuFront = temp.substring(0, 2);
					skuBack = temp.substring(2);
					break;
				} else {
					System.out.println("Invalid Model/Colour encountered");
					throw new InvalidInputException();
				}
			}
		}
	}

	public static void clearList() {
		orderList.clear();
	}

	public int getFrontSKU() {
		return this.frontSKU;
	}

	public int getBackSKU() {
		return this.backSKU;
	}

	public String getColour() {
		return this.colour;
	}

	public String getModel() {
		return this.model;
	}
}
