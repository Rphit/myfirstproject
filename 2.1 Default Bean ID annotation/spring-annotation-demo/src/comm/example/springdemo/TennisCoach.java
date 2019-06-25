package comm.example.springdemo;

import org.springframework.stereotype.Component;

@Component("theCoach")
public class TennisCoach implements Coach {
	
	public String getDailyWorkOut()
	{
		return" annotation example in the spring";
	}

}
