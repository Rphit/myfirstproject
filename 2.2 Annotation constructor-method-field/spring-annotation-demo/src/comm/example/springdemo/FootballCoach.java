package comm.example.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//default bean id
@Component
@Scope("prototype")
public class FootballCoach implements Coach {
 
	//propeties level injection
	@Autowired
    private FortuneService myFortuneService;
    public FootballCoach()
	{
		super();
		// TODO Auto-generated constructor stub
	}
    
    
      // ------Setter level injection-------------
   /*     @Autowired
		public void setMyFortuneService(FortuneService myFortuneService) {
		this.myFortuneService = myFortuneService;
	}
      
        // ---constructer level injection------------
         
		@Autowired
		public FootballCoach(FortuneService myFortuneService) {
		super();
		this.myFortuneService = myFortuneService;
	  } 
   
    
       //---- Custom Method injection-------------
       @Autowired
        public void MyFortuneServiceSet(FortuneService myFortuneService) {
    		this.myFortuneService = myFortuneService;
    	}
       
       */
       
		public String getDailyWorkOut()
		{
			return" annotation example in the football spring";
		}

		
		public String getDailyFortune()
		{
			return myFortuneService.getFortune();
					
		}
		@PostConstruct
		public void doSomeInitStuff()
		{
			System.out.println("init method");
		}

        @PreDestroy
        public void doSomeCleanStuff()
        {
        	System.out.println("destroy method");
        }
        
}
