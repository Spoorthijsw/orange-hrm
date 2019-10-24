package isprime;

public class isprime {

	public static void main(String[] args) {
		for(int num=2;num<=100;num++)
		{
			boolean isprime=true;
			for(int i=2;i<=num/2;i++)
			{
				if(num%i==0)
				{
					isprime=false;
					break;
					
				}
			}
		if(isprime==true)
		{
			System.out.println(num);
		}

	}
	}
}
		


