package forloop;

public class forloop {

	public static void main(String[] args) {
	int maxrows=7;
	int maxcols=7;
	for(int i=1;i<=maxrows;i++)
	{
		for(int j=1;j<=maxcols;j++)
		{
			if(i==1 || i==7|| j==1|| j==7)
			{
				System.out.print("*");
			}
			else
			System.out.print(" ");
		}
		System.out.println();
	}
		

	}

}
