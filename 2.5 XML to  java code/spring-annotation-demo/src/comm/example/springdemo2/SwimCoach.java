package comm.example.springdemo2;

import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {
	
	private FortuneService fortuneService;
	
	

	public SwimCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}
	

	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "swim coach workout";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune() ;
	}
	
	

}
