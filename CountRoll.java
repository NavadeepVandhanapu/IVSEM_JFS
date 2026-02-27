import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
class CountRoll
{
	public static void main(String args[])
	{
		try
		{
			File file=new File("rolls.txt");
			Scanner sc=new Scanner(file);
			int others=0;
			int cse=0;
			int ece=0;
			int aiml=0;
			int it=0;
			int ds=0;
			while(sc.hasNextLine())
			{
				String rollnumber = sc.nextLine();
				String br=rollnumber.substring(6,8);
				if(br.equals("05") )cse++;
				else if(br.equals("66")) aiml++;
				else if(br.equals("04"))ece++;
				else if(br.equals("12")) it++;
				else if(br.equals("67")) ds++;
				else others++;
			}
			int total=cse+ece+aiml+it+ds+others;
			System.out.println("Total Students: " + total);
			System.out.println("CSE Students: " + cse);
			System.out.println("ECE Students: " + ece);
			System.out.println("IT Students: " + it);
			System.out.println("DS Students: " + ds);
			System.out.println("AIML Students: " + aiml);
			System.out.println("Other Students" + others);
		}
		catch(IOException e)
		{
			System.out.println("File Not Found");
			e.printStackTrace();
		}
	}
}