public class IpChart
{
	
	
	public static void main(String[] args) 
	{
	int baseNumber = 2;
	int bitNumber = 1;
	int f = 1;
	int l = 1;
	System.out.print(" ");
	while(l <= 32)
	{
		System.out.print("_");
		l++;
	}
	System.out.println("");
	System.out.print("|");
	while(f <= 12)
	{
		System.out.print(" ");
		f++;
	}
	System.out.print("|");
	while(f <= 31)
	{
		System.out.print(" ");
		f++;
	}
	System.out.println("|");
	while(bitNumber <= 32)
	{
		long result = (long) Math.pow(baseNumber, bitNumber);
		int i = 1;
		int x = 1;
		int z = 1;
		System.out.print("|");
		while(x <= 4)
		    {
				System.out.print(" ");
				x++;
		    }
		System.out.print(bitNumber);
		if(bitNumber >= 10)
		{
			while(i <= 6)
			{
				System.out.print(" ");
				i++;
			}
			System.out.print("|");
			while(i <= 14)
			{
				System.out.print(" ");
				i++;
			}
		}
		if(bitNumber <=9)
		{
			while(i <= 7)
			{
				System.out.print(" ");
				i++;
			}
			System.out.print("|");
			while(i <= 15)
			{
				System.out.print(" ");
				i++;
			}
		}
		System.out.println(result);
		bitNumber++;
		System.out.print("|");
		while(z <= 12)
			{
			System.out.print("_");
			z++;
			}
		System.out.print("|");
		while(z <= 31)
			{
			System.out.print("_");
			z++;
			}
		System.out.println("|");
		if(bitNumber <= 32)
		{
			System.out.print("|");
			int y = 1;
			while(y <= 12)
			{
				System.out.print(" ");
				y++;
			}
			System.out.print("|");
			while(y <= 31)
			{
				System.out.print(" ");
				y++;
			}
			System.out.println("|");
		}
	}
	}


		

}

	
		
		

	



