package reverse;

public class reverse {

	public static void main(String[] args) {
		String str="spoorthiNitin";
		char[] allchars=str.toCharArray();
	     str="";
		for(int i=allchars.length-1;i>=0;i--)
		{
			char mychar=allchars[i];
			str=str+mychar;
			
		}
		System.out.println(str);
		
		
		

	}

}
