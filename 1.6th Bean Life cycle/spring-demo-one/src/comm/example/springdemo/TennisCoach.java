package comm.example.springdemo;

public class TennisCoach implements Coach{
	
	public String emailAddress;
	public String team;
	
	public TennisCoach() {
		super();
		System.out.println("defalt constructer");
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



	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "run 300 meters";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void doMyInitStuff()
	{
		System.out.println(">>>> inside init do stuff");
	}
   
	 public void doMyCleanUpStuff()
	 {
		 System.out.println(">>>> inside do my cleanup stuff");
	 }

}
