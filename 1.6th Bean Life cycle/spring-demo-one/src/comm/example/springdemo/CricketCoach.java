package comm.example.springdemo;

public class CricketCoach implements Coach {

	  private String emailAddress;
	  private String team;
	  
	  private FortuneService fortuneService;
	
		
	public CricketCoach() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public String getEmailAddress() {
		return emailAddress;
	}



	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}



	public String getTeam() {
		return team;
	}



	public void setTeam(String team) {
		this.team = team;
	}


	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}



	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "practice daily batting injected";
	}

	@Override
	public String getDailyFortune() {
		
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
