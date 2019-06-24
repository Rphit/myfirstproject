package comm.example.springdemo;

public class BaseBallCoach implements Coach {

	private FortuneService myFortuneService;
	
	public  BaseBallCoach()
	{
		super();
		System.out.println("baseball object created");
	}
	
	public BaseBallCoach( FortuneService myFortuneService  )
	{
		this.myFortuneService=myFortuneService;
		System.out.println("baseball injection performed");
	}
	
	
	
	
	public void setMyFortuneService(FortuneService myFortuneService) {
		System.out.println("setter is injecting performed");
		
		this.myFortuneService = myFortuneService;
	}

	public String getDailyWorkOut()
	{
		return "daily work 1 hours pusup";
	}

	public String getDailyFortune()
	{
		return myFortuneService.getFortune() ;
	}


}
