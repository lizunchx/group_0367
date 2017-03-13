package warehouseObject;

public class SpecialPallet extends Pallet{
	
	public boolean special;

	public SpecialPallet (Facia facia1, Facia facia2, Facia facia3, Facia facia4, int pickingID)
	{
		super (facia1, facia2, facia3, facia4,  pickingID);
		special = true;
	}
}
