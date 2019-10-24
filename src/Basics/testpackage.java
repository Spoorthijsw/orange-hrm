package Basics;

public class testpackage {

	public static void main(String[] args) {
		int[] allNumbers= {39,40,25,60,55,500,15,22,45};
		int temp=0;
		for(int i=0;i<=allNumbers.length-1;i++)
			
		{
			int curNum= allNumbers[i];
			if(temp<curNum)
			{
				temp=curNum;
			}
		}
		System.out.println(temp);
			

	}

}
