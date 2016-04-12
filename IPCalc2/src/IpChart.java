public class IpChart 
{
	public static void main(String[] args) 
	{
		int baseNumber = 2;
		int bitNumber = 1;
		int f = 1;
		int l = 1;
		System.out.print(" ");
		while(l <= 35)
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
		while(f <= 34)
		{
			System.out.print(" ");
			f++;
		}
		System.out.println("|");
		while(bitNumber <= 30)
		{
			int numberB = 0;
			int numberK = 0;
			int numberM = 0;
			int result = (int) Math.pow(baseNumber, bitNumber);
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
			while(result >= 1000000000){
				result -= 1000000000;
				numberB += 1;
			}
			while(result >= 1000000){
			result -= 1000000;
			numberM += 1;
			}
			while(result >= 1000){
			result -= 1000;
			numberK += 1;
			}
			if(numberB != 0){
				System.out.print(numberB);
				System.out.print(",");
			}
			if(numberM != 0){
				if(numberM < 100){
					if(numberB != 0){
					System.out.print("0");
					}
				}
			System.out.print(numberM);
			System.out.print(",");}
			if(numberK != 0){
				if(numberK < 100){
					if(numberM != 0){
					System.out.print("0");
					}
				}
			System.out.print(numberK);
			System.out.print(",");}
			if(result < 100){
				if(numberK != 0){
					System.out.print("0");
				}
			}
			System.out.print(result);
			int ar = 13;
			if(result >= 10)
				{
				ar -= 1;
				if(result < 100)
					{
					if(numberK != 0)
						{
						ar -= 1;
						}
					}
					if(result >= 100)
					{
						ar -= 1;
					}
				}
			if(numberK != 0)
				{
				ar -= 2;
				if(numberK >= 10)
					{
					ar -= 1;
					if(numberK < 100)
						{
						if(numberM != 0)
							{
							ar -= 1;
							}
						
						}
					if(numberK >= 100)
						{
						ar -= 1;
						}
					}
				}
			if(numberM != 0)
			{
			ar -= 2;
			if(numberM >= 10)
				{
				ar -= 1;
				if(numberM >= 100)
					{
					ar -= 1;
					}
				}
			}
			if(bitNumber == 30)
			{
				ar -= 3;
			}
			while(ar >= 1)
			{
			System.out.print(" ");
			ar --;
			}
			System.out.println("|");						
			bitNumber++;
			System.out.print("|");
			while(z <= 12)
			{
				System.out.print("_");
				z++;
			}
			System.out.print("|");
			while(z <= 34)
			{
				System.out.print("_");
				z++;
			}
			System.out.println("|");
			if(bitNumber <= 30)
			{
				System.out.print("|");
				int y = 1;
				while(y <= 12)
			{
				System.out.print(" ");
				y++;
			}
			System.out.print("|");
			while(y <= 34)
			{
				System.out.print(" ");
				y++;
			}
			System.out.println("|");
			}
		}//while bitNumber <= 32 close
	}//main close
}//class close



