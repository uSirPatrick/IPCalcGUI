import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.File;

public class SaveData 
{
	public static void StartWrite()
	{
		File newFile = new File("C:/Users/Public/Documents/SavedData.txt");
		if (newFile.exists())
			System.out.println("The file already exists");
		else
		{
			try
			{
			newFile.createNewFile();
			}catch (Exception e)
			{
				e.printStackTrace();
			}
			
			try
			{
			FileWriter fileW = new FileWriter(newFile);
			BufferedWriter buffW = new BufferedWriter(fileW);
			buffW.write("This is a test");
			buffW.close();
			
			System.out.println("File written");
			}catch (Exception e)
			{
				e.printStackTrace();
			}
			
			
			
		}
	}
	

}
