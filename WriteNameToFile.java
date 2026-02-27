import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
class WriteNameToFile{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of names:");
		int n=sc.nextInt();
		try
		{	
			FileWriter obj =new FileWriter("student.txt");
			for(int i=1;i<=n;i++)
			{
				if(i==1) System.out.println("Enter the "+ i + "st name");
				else if(i==2) System.out.println("Enter the " +i + "nd name" );
				else if(i==3) System.out.println("Enter the " +i + "rd name" );
				else
				{
					System.out.println("Enter the " +i + "th name" );
				}
				String name=sc.next();
				obj.write(name+" \n");
			}
			obj.close();
			System.out.println("Names written Successfully!");
		}
		catch(IOException e)
		{
			System.out.println("An error occured");
			e.printStackTrace();
		}
	}
}