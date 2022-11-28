package _2_controlStatement;

import java.util.Scanner;
/*
 * WAP that takes an integer between 1 and 7 and displays the name of the weekday.
 */
public class _9_WeekDayProgram 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the date (1-7) & find weekday : )");
		int date=sc.nextInt();
		String dayName;
		switch (date)
		{
		case 1 : dayName = "Monday";
		break;
		case 2 : dayName = "Tuesday";
		break;
		case 3 : dayName = "Wednesday";
		break;
		case 4 : dayName = "Thrusday";
		break;
		case 5 : dayName = "Friday";
		break;
		case 6 : dayName = "Saturday";
		break;
		case 7 : dayName = "Sunday";
		break;
		default : dayName ="Invalid Day";
		break;
		}
		System.out.println("You enter "+date+" and the day is : "+dayName);
	}

}
