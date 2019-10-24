package Basics;

public class length_intvalue {

	public static void main(String[] args) {
		int num=254;
		int length=0;
		do {
			num=num/10;
			length++;
		}while(num!=0);
		System.out.println("Given number length is" +length);

	}

}
