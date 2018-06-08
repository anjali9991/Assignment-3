import java.util.Scanner;
public class Palindrome {
public static void isPalindrome()
{
	int num,rev=0,a;
	Scanner sc=new Scanner(System.in);
	num=sc.nextInt();
	sc.close();
	a=num;
	while(num!=0)
	{
		int rem=num%10;
		rev=rem+rev*10;
		num=num/10;
	}
	if(a==rev)
		System.out.print(a+" is palindrome");
	else
		System.out.print(a+" is not palindrome");
}
public static void main(String[] args)
{
	isPalindrome();
}
	
}
