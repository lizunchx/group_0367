package warehouseObject;

public class Pallet {

	protected Facia facia1;
	protected Facia facia2;
	protected Facia facia3;
	protected Facia facia4;
	protected int pickingID;
	
	public Pallet (Facia facia1, Facia facia2, Facia facia3, Facia facia4, int pickingID)
	{
		this.facia1 = facia1;
		this.facia2 = facia2; 
		this.facia3 = facia3; 
		this.facia4 = facia4;
		this.pickingID = pickingID;
	}
	
	
}
