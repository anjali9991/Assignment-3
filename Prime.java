import java.util.Scanner;
public class Prime {
public static void isPrime()
{
	int num,count=0;
	Scanner sc=new Scanner(System.in);
	num=sc.nextInt();
	sc.close();
	for(int i=2;i<num;i++)
	{
		if(num%i==0)
			count++;
	}
	if(count==0)
		System.out.print(num+" is prime number");
	else
		System.out.print(num+" is not a prime number");
}
public static void main(String[] args)
{
	isPrime();
}
}
