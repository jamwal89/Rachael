import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class History extends RachaelFunction{
	
	private Map <Integer, String> histMap1 = new HashMap <Integer, String>();
	private Map <Integer, String> histMap2 = new HashMap <Integer, String>();
	private Map <Integer, String> histMap3 = new HashMap <Integer, String>();
	
	public boolean isvague(String s)
	{
		String delim = " ";
		String[] parts = s.split(delim);
		boolean vague;
		int score = 0;
		
		for (int j =0; j<parts.length; j++)
		{
			if(ifexists(parts[j])!=-1)
			{
				score = score + 4;
			}
			else 
				score = score + 1;
				
		}
		if (score>=8)
			vague = false;
		else 
			vague = true;
	}
	ArrayList <String> loglist = new ArrayList<String>();
	public String setHistMap1()
	{
		histMap1.put(0, "You said that, " );
		histMap1.put(1, "Do you remeber saying " );
		histMap1.put(2, "You did say that " );
		histMap1.put(3, "Interesting, and you did say" );
		histMap1.put(4, "I understand, especially becuase you said, " );
		histMap1.put(5, "Exactly and you even said" );
		
	}
	public String getHistMap1()
	{
		Random rnd = new Random();
		int i = rnd.nextInt(6);
		return histMap1.get(i);
	}
	public String setHistMap2()
	{
		histMap2.put(0, "However you said that, " );
		histMap2.put(1, "Do you remeber saying " );
		histMap2.put(2, "But you did say that " );
		histMap2.put(3, "Interesting, but you said " );
		histMap2.put(4, "I understand, but were you confused when you said " );
		histMap2.put(5, "Maybe you felt different when you said " );

	}
	public String getHistMap2()
	{
		Random rnd = new Random();
		int i = rnd.nextInt(6);
		return histMap2.get(i);
	}
	public String setHistMap3()
	{
		histMap3.put(0, ". So what were you thinking then ?" );
		histMap3.put(1, ". Why did you say it ?" );
		histMap3.put(2, ". What were you thinking when you said that ?" );
		histMap3.put(3, ". Did you what to elaborate more ?" );
		histMap3.put(4, ". Let us talk more about it." );
		histMap3.put(5, ". What was the reason for that statement ?" );

	}
	public String getHistMap3()
	{
		Random rnd = new Random();
		int i = rnd.nextInt(6);
		return histMap3.get(i);
	}
	public String getPos()
	{
		Random rnd = new Random();
		int r = rnd.nextInt(loglist.size());
		
	}
	
	public int value(String s)
	{
		String delim = " ";
		String[] parts = s.split(delim);
		boolean vague;
		int score = 0;
		
		for (int j =0; j<parts.length; j++)
		{
			if(ifexists(parts[j])==1)
			{
				score = score + 4;
			}
			else if(ifexists(parts[j])==1)
				score = score - 4;
				
		}
		if (score<0)
		{
			score = score - parts.length;
		}
		else if (score>=0)
		{
			score = score + parts.length;
		}
		return score;
	}
	
	
	
	public String HistQuestion(String s)
	{
		String res;
		int score = value(s);
		Random rnd = new Random();

		int o = rndm.nextInt(2);
		if (o == 0)
		{
			if (score>0)
			res += getHistMap1();
		}
			
		else 
		{
			res += getHistMap2();
		}
			
		
		
		
	}
	public String quit(String resp)
	{
		for(int i=1;i<=4;i++)
		{
			if(resp.equalsIgnoreCase("quit") && ((i==1)||(i==2)||(i==3)))
				System.out.println(qualMap.get(i)+HistQuestions(resp));
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
