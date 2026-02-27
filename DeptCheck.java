import java.util.*;
import java.io.FileWriter;
import java.io.IOException;
public class DeptCheck
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			FileWriter obj1=new FileWriter("cse.txt");
			FileWriter obj2=new FileWriter("it.txt");
			FileWriter obj3=new FileWriter("aiml.txt");
			FileWriter obj4=new FileWriter("ds.txt");
			FileWriter obj5=new FileWriter("ece.txt");
			System.out.println("Enter no of rollnumbers :");
			int n=sc.nextInt();
			sc.nextLine();
			int j=0;
			System.out.print("Enter the rollnumbers:");
			while(j<n)
			{       
				String rollnumber=sc.nextLine();
				String br_code=rollnumber.substring(6,8);
				if(br_code.equals("05"))
					obj1.write(rollnumber+"\n");
				
				if(br_code.equals("12"))
					obj2.write(rollnumber+"\n");
				
				if(br_code.equals("66"))
					obj3.write(rollnumber+"\n");
				
				if(br_code.equals("67"))
					obj4.write(rollnumber+"\n");
				
				if(br_code.equals("04"))
					obj5.write(rollnumber+"\n");
				

				j++;
			}

  
			obj1.close();
			obj2.close();
			obj3.close();
			obj4.close();
			obj5.close();
			System.out.print("Rollnumber written Successfully");
		}
		catch (IOException e)
		{
			System.out.print("An error occurred");
			e.printStackTrace();
		}
	}
}