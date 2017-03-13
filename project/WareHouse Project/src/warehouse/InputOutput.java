package warehouse;
import java.io.*;
import java.util.ArrayList;

public class InputOutput{

	public ArrayList<String> inputFile(String fileName) throws IOException, FileNotFoundException
	{
		FileReader fileInput = new FileReader(fileName);
		BufferedReader lineInput = new BufferedReader(fileInput);
		
		String inputLine;
		ArrayList<String> sp = new ArrayList<String>();
		
		while ((inputLine = lineInput.readLine())!= null)
		{
	
			if (inputLine != null) {
				sp.add(inputLine.split("\n")[0]);
			}
		}
		
		//close fileReader and BufferedReader
		lineInput.close();
		fileInput.close();
		return sp;
	}
 
	
	public void outputFile (String outputLine) throws IOException, FileNotFoundException
	{
		FileWriter fileOutput = new FileWriter("output.txt");
		BufferedWriter lineOutput = new BufferedWriter(fileOutput);
		
		lineOutput.write(outputLine);
		lineOutput.newLine();
		lineOutput.close();
		fileOutput.close();
	}
	
	public void outputFile (String outputLine, String fileName) throws IOException, FileNotFoundException
	{
		FileWriter fileOutput = new FileWriter(fileName);
		BufferedWriter lineOutput = new BufferedWriter(fileOutput);
		
		lineOutput.write(outputLine);
		lineOutput.newLine();
		lineOutput.close();
		fileOutput.close();
	}
}
