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
		while(a < 23){System.out.print('_'); a++; }
		System.out.println();
		
		int bits = 0;
	    int number = (int)Math.pow(2, bits);
		while(bits < 32){System.out.print("| " + " "  + bits); bits++; }
		System.out.println();
				
				
	}

	}
				

	
		
		

	




