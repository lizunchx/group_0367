package warehouseObject;

public class TruckLevel {
private SpecialPallet[][] levelFill = new SpecialPallet[2][2];
	
	public TruckLevel (SpecialPallet s, boolean front)
	{
		if (front)
		{
			if (levelFill[0][0].equals(null))
			{
				levelFill[0][0] = s;
				
			}
			else 
			{
				levelFill[0][1] = s;
				
			}
		}
		else
		{
			if (levelFill[1][0].equals(null))
			{
				levelFill[1][0] = s;
				
			}
			else 
			{
				levelFill[1][1] = s;
				
			}
		}
	}
	
}
