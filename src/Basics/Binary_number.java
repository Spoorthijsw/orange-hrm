package Basics;

public class Binary_number {

	public static void main(String[] args) {
		
		String str= "1001";
		boolean isBinary=true;
		
		int num=Integer.valueOf(str);
		
		while(num!=0)
		{
			int temp=num%10;
		    if(temp>1) {
		    	isBinary=false;
		    	break;
		    }
		    else {
		    	num=num/10;
		    }
		    	
		}
		if(isBinary) {
			System.out.println("Given number is binary");
		}else {
			System.out.println("Given number is not binary");
		}
		
		
		
		

	}

}
