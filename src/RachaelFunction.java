import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

public class RachaelFunction extends RachaelData

{
	
	Rachael r = new Rachael();
	History h = new History();
	
	private HashMap<Integer, String> qualMap = new HashMap<Integer, String>();

	protected ArrayList<String> logList = new ArrayList<String>();
	
	public String addQual()
	{
		qualMap.put(1,"Wait..before you \"quit\". We should proably talk more about what you said that  ");
		qualMap.put(2,"Don't \"quit\" now. You are making a lot of progress . Remember awhile ago you said ");
		qualMap.put(3,"Are you sure about this ...If you leave now and \"quit\" we wouldn't be able to talk about ");
	}
	
	public int log(String resp)
	{
		ArrayList<String> logList = new ArrayList<String>();
		while(true)
		{
			logList.add(resp);
		}
		int size = logList.size();
		return size;
	}

	public void logFile(String resp)
	{
		PrintWriter writer=null;
		try 
		{
			writer = new PrintWriter(new File("History.txt"));
		} 
		catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
		
		DateUtil d = new DateUtil();
		while(resp.length()!=0)
		{
			writer.println(" Session Date:  " +d.now() +logList);

		}
		
	}

	public double cost() 
	{

		double itemList = logList.size();
		double cost = itemList * 2;
		return cost;
	}
	
	public String quit(String resp)
	{
		for(int i=1;i<=4;i++)
		{
			if(resp.equalsIgnoreCase("quit") && ((i==1)||(i==2)||(i==3)))
				System.out.println(qualMap.get(i)+h.HistQuestions(resp));
			else
			{
				System.out.println("I am glad you decided to stay");
				r.Interaction(resp);
			}

			if(resp.equalsIgnoreCase("quit") && (i==4))
			{
				System.out.println("Hmm.. if you really want to leave then alright.");
				System.out.println("Wait!! dont leave already. You still have to pay me for this session. The cost for today's session will be  " +cost());
				System.out.println("Bye! See you next time. Until then try to stay positive and be Happy :)");
				
			}
		}
	}

}