package comm.example.spring;

import java.util.ArrayList;
import java.util.Random;

import comm.example.spring.FortuneService;

public class HappyFortuneService implements FortuneService {
	
	
	
	public HappyFortuneService() {
		super();
		
	}
	
	private Random random=new Random();
	private String[] data=
		{
				"comlete the class",
				"come in  the time",
				"practice for golf",
				"randome"
		};

	public String getFortune()
	{   
		int index=random.nextInt(data.length);
		
		return data[index];
	}
	
	}