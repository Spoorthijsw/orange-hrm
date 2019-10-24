package primevnodd;
import java.util.Scanner;

public class primevnodd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		int total=0;
		if(num==0|| num==1||num==2)
		{
			System.out.println("Given number is prime no");
		}
		else if(num%2==0)
		{
			System.out.println("Given number is even,non prime");
		}
		else
		{
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
				{
					total++;
				}
			}
				if(total==2)
				{
					System.out.println("prime number");
					
				}
				else
				{
					System.out.println("non prime number");
				}
			}
		}
			

	}


