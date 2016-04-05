import java.util.Arrays;


public class IpChart{
	
	static char[][] table = new char[32][64];

	public static void IpChart(){
		
		for(char[] row : table)
		{
			Arrays.fill(row,'*');
			
		}
	}
	public static void  drawTable()
	{
		int a = 1;
		while(a < 60){System.out.print('_'); a++; }
		System.out.println();
		
		int bits = 1;
	    int number = (int)Math.pow(2, bits);
		while(bits < 33){System.out.print("| ");
			System.out.println(" "  + bits); bits++; }
		System.out.println();
				
				
	}

	}
				

	
		
		

	




