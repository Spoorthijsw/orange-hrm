package Basis;
import java.util.Scanner;

public class cricket {

	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
				System.out.println("Enter Total overs to play:");
		int total_overs_to_play=in.nextInt();
		int totalWickets=0;
		int totalScore=0;
		for(int overNum=1;overNum<=total_overs_to_play;overNum++)
		{
			System.out.println(overNum);
			for(int ballNum=1;ballNum<=6;ballNum++)
			{
				System.out.println("Enter outcome here:");
				String outcome=in.next();
				switch(outcome.toLowerCase())
				{
				case "r":
					System.out.println("Enter runs scored for this ball:");
					int runsForBall=in.nextInt();
					totalScore+=runsForBall;
					break;
				case "w":
					totalWickets++;
					break;
				default:
					
					System.out.println("Its an invalid outcome tyope");
					ballNum--;
					break;
				}
					if(totalWickets==10)
					{
						break;
						
					}
				
				
				}
				System.out.println("Total runs scored:"+totalScore);	
				System.out.println("Total wickets:"+totalWickets);
		

	}

}
}
