
import java.util.Scanner;
public class Numbers {
public static int addNumber()
{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter two number:");
	int a=sc.nextInt();
	int b=sc.nextInt();
	sc.close();
	int c=a+b;
	return c;
}
public static void main(String[] args)
{
	int a=addNumber();
	System.out.print("Sum is "+a);
}
}
