package warehouseObject;
import java.util.ArrayList;
public class TruckLevel {

	private ArrayList<SpecialPallet> levelLeft = new ArrayList<>(2);
	private ArrayList<SpecialPallet> levelRight = new ArrayList<>(2);
	public TruckLevel (SpecialPallet one, SpecialPallet two, SpecialPallet three, SpecialPallet four)
	{
		levelRight.add(one);
		levelRight.add(two);
		levelLeft.add(three);
		levelLeft.add(four);
	}
	public ArrayList getLeft()
	{
		return levelLeft;
	}
	public ArrayList getRight()
	{
		return levelRight;
	}

	
}