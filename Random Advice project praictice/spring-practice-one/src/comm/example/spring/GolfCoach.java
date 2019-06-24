package comm.example.spring;



public class GolfCoach implements Coach
	
	 {

		private FortuneService myFortuneService;
		
		public  GolfCoach()
		{
			super();
			System.out.println("Golf Coach object created");
		}
		
		public GolfCoach( FortuneService myFortuneService  )
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
			return "daily work 1 hours Golf hitting";
		}

		public String getDailyFortune()
		{
			return myFortuneService.getFortune() ;
		}


	}



