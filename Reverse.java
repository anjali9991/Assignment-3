import java.util.Scanner;
public class Reverse {
public static void isReverse()
{
	int num,rem,rev=0,a;
	Scanner sc=new Scanner(System.in);
	num=sc.nextInt();
	sc.close();
	a=num;
	while(num!=0)
	{
		rem=num%10;
		rev=rem+rev*10;
		num=num/10;
	}
	System.out.print("Reverse of "+a+" is "+rev);
}
public static void main(String[] args)
{
	isReverse();
}
}
