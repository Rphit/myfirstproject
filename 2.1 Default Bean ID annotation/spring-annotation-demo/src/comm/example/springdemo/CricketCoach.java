package comm.example.springdemo;

import org.springframework.stereotype.Component;

//default bean id
@Component
public class CricketCoach implements Coach {


		
		public String getDailyWorkOut()
		{
			return" annotation example in the cricket spring";
		}

}
