import java.util.Scanner;
public class biggest {
public static void isBiggest()
{
	int num1,num2,num3;
	Scanner sc=new Scanner(System.in);
	num1=sc.nextInt();
	num2=sc.nextInt();
	num3=sc.nextInt();
	sc.close();
	if((num1>num2)&&(num1>num3))
		System.out.print(num1+" is biggest number");
	else if((num2>num3)&&(num2>num1))
		System.out.print(num2+" is biggest number");
	else
		System.out.print(num3+" is biggest number");
}
public static void main(String[] args)
{
	isBiggest();
}
}
