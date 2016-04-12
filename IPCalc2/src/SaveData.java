import java.util.Scanner;

public class SaveData {
	
	public void startSave(){
		
		int testNum = 0;
		
		System.out.println("Input number to write to file");
		Scanner input = new Scanner(System.in);
		int testNumber = input.nextInt();
		
		testNum = testNumber;
		
		System.out.println("you chose the number " + testNum);
		System.out.println("Variable testNum = " + testNum);
		System.out.println("Variable testNumber = " + testNumber);
	}
}
