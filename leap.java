import java.util.Scanner;
public class leap {
	public static void isLeap(int y)
	{
		if(y%4==0)
			System.out.print(y+" is a leap yaer");
		else
			System.out.print(y+" is not a leap year");
	}
public static void main(String[] args)
{
	int year;
	Scanner sc=new Scanner(System.in);
	year=sc.nextInt();
	sc.close();
	isLeap(year);
}
}
