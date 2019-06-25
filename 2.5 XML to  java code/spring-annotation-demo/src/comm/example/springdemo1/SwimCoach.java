package comm.example.springdemo1;

import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {

	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "swim coach workout";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "you are lucky";
	}
	
	

}
