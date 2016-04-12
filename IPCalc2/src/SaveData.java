import java.util.Formatter;
import java.util.Scanner;

public class SaveData {
	
	public static int testNum = 0;

	public static void startSave(){
		System.out.println("Input number for storing");
		
		Scanner input = new Scanner(System.in);
		int testNumber = input.nextInt();
		testNum = testNumber;
		 
		
		
		final Formatter x;
		
		try{
			x = new Formatter("saveData.txt");
			System.out.println("You created a file");
		}catch(Exception e){
			System.out.println("You got an error");
		}
		
		
	}
	
	private Formatter x;
	
	public void openFile(){
		try{
			x = new Formatter("saveData.txt");
		}
		catch(Exception e){
			System.out.println("You have an error");
		}
	}
	
	public void addRecords(){
		x.format("%s", testNum);
	}
	
	public void closeFile(){
		x.close();
	}
	
}
