package prime;

public class primeno {

	public static void main(String[] args) {
		int num=10;
		int total=0;
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
				System.out.println("Non prime number");
			}
		
	    	  

	}
}


