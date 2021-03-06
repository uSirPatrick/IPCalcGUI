import java.util.Scanner;
import java.io.IOException;
import java.util.InputMismatchException;




public class IPCalcMenu {
	
	
	
	void menuStart(){
		System.out.println("Make a selection:");
		System.out.println("1. IP Address and Netmask");
		System.out.println("2. Bit Chart");
		System.out.println("3. Calculate Networks");
		System.out.println("4. Save Data");
		System.out.println("5. Read Saved Data");
		System.out.println("6. Exit");
		
	}
	
	public void userInput() throws IOException{
		
		
		
		do{
	
		try{
		Scanner userInput = new Scanner(System.in);
		int firstNumber = userInput.nextInt();
		
		if(firstNumber == 1){
			//call "mother of all subroutines"
			InputAndValidation Start;
			Start = new InputAndValidation();
			
			Start.IpInput();
		}
		
		if(firstNumber == 2){
			//call IpChart class
			IpChart Start;
			Start = new IpChart();
			
			Start.chartStart();
		}
		
		if(firstNumber == 3){
			//call "ip_calc"
			System.out.println("You chose 3 for Calculate Networks");
		}
		
		if(firstNumber == 4){
			//Call "Save Data" class
			SaveData Start;
			Start = new SaveData();
			
			Start.StartWrite();
		}
		
		if(firstNumber == 5){
			//Call "Read Saved Data" class
			ReadSavedData Start;
			Start = new ReadSavedData();
			
			Start.StartRead();
		}
		
		if(firstNumber == 6){
			//Exit program
			System.out.println("Goodbye");
		}
		
		if(firstNumber > 6){
			//Not an option
			System.out.println("That is not a valid option: Pick a number between 1 and 6");
		}
		
		if(firstNumber < 1){
			//Not an option
			System.out.println("That is not a valid option: Pick a number between 1 and 6");
		}
		
		if(firstNumber == 6){
			System.exit(0);
		}
			
		
		}catch(InputMismatchException e){
			System.out.println("Invalid input: Make another selection ");
		}
		
		
	
	}while(true);
	
	
	}	

}


