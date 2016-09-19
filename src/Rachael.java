import java.util.Random;
import java.util.Scanner;

public class Rachael {
	Data dt = new Data();
	History hs=new History();
	RachaelFunction rf =new RachaelFunction();
	RachaelEmotion re = new RachaelEmotion();
	

	public void Start(){
	
		System.out.println("Enter your response or Quit to exit");
		Scanner scan = new Scanner(System.in);
		String response= scan.nextLine();
		rf.MaintainLog(response);
		Interaction(response);
	}
	
	
	
	public void Interaction(String response) {
		if(!response.equalsIgnoreCase("Quit")) {

				boolean isVague=hs.isVague(response);
				int Size=rf.size();

				if (isVague && Size>10) {
					System.out.println(hs.HistoryQuestion);
					Start();
				}
				else {
					Random rn = new Random();
					int index = 1+ rn.nextInt(2);
					if(index=1){
						System.out.println(sn.RachaelEmotion(response));
						Start();
					}
					else {
						System.out.println(hs.HistoryFunction(response));
						Start();
					}

				}
				

			}
		else  if (response.equalsIgnoreCase("Quit")){
			rf.Quit();
	}	
				
}
		
}
	