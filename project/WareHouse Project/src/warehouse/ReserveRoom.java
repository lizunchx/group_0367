package warehouse;
import warehouseObject.Facia;

import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;

import java.io.IOException;


public class ReserveRoom implements Remove {

	private Integer numberofFacia;
	private HashMap<Facia, Integer> roomCount = new HashMap<Facia, Integer>();
	InputOutput reader = new InputOutput ();
	Facia f;
	public ReserveRoom (String fileName)
	{
		try{
			while (reader.inputFile(fileName)!=null)
			{
				ArrayList details = reader.inputFile(fileName);
				for (int a = 0; a<details.size(); a++)
				{
					String info = (String) details.get(a);
					String i[] = info.split(",");
					if (i[2].equalsIgnoreCase("True"))
					{
						f = new Facia (i[0], i[1], true);
					}
					else {
						f = new Facia(i[0], i[1], false);
					}
					numberofFacia = Integer.parseInt(i[3]);
					roomCount.put(f,numberofFacia);
				}
				
				
			} 
			
		}
		catch (IOException e)
		{
			JOptionPane.showMessageDialog(null, "File was not found", "Input Error", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}
	}
	public void moveToFloor (Facia f)
	{
		roomCount.replace(f, roomCount.get(f)-25);
	}
	public void addToWarehouse (Facia f, int amount)
	{
		roomCount.replace(f, roomCount.get(f)+amount);
	}
	@Override
	public void notifyRemoval(Facia f) {
		// TODO Auto-generated method stub
		
	}
}
