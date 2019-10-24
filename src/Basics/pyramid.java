package Basics;

public class pyramid {

	public static  void main(String[] args) {
		int max=11;
		int totallines=(max/2)+1;
		for(int j=1;j<=totallines;j++)
		{
			for(int k=1;k<j;k++)
			{
				System.out.print(" ");
				
			}
			for(int i=1;i<=max;i++)
			{
				System.out.print("*");
			}
			System.out.println();
			max-=2;                                 
		}
		

	}
}


