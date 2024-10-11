import java.util.Scanner;

public class Task2
{
	public static void main(String[] args)
    {
		int hindi,english,math,science,socialScience,total;
		float per;

		Scanner scanner=new Scanner(System.in);

		System.out.print("Enter your subject marks Hindi = ");
		hindi= scanner.nextInt();
		System.out.print("Enter your subject marks English = ");
		english= scanner.nextInt();
		System.out.print("Enter your subject marks Math = ");
		math= scanner.nextInt();
		System.out.print("Enter your subject marks Science = ");
		science= scanner.nextInt();
		System.out.print("Enter your subject marks Social Science = ");
		socialScience= scanner.nextInt();

		total=hindi+english+math+science+socialScience;
         System.out.println("your total = "+ total);

		per=total/5.0f;
	  System.out.println("Percentage = "+per);
	  
		if(hindi < 33 || english <33 || math < 33 || science <33 || socialScience < 33)
		{
		     System.out.println("Fail due to insufficient marks in one or more subjects.");
		}
		else if(per>=60)
		{
		   	System.out.println(" 1st Division"); 
		}
		else if(per>=50 )
		{
		    	System.out.println("2nd Division");
		}
		else if(per>=33 )
		{
		    	System.out.println("3rd Division");
		}
		else
		{
		    	System.out.println("Fail");
		}
	
		}
	
}