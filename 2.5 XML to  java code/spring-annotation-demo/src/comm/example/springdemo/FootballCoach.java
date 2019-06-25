package comm.example.springdemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//default bean id
@Component

public class FootballCoach implements Coach {

	//propeties level injection
	
	
	@Value("rohit@gmail")
	private String emailAddress;
	@Value("mumbai")
	private String team;

	//@Qualifier("happyFortuneService" )
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

    
		public String getEmailAddress() {
		return emailAddress;
	}


	public String getTeam() {
		return team;
	}


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
			
		}
        @PreDestroy
        public void doSomeCleanStuff()
        {
        	System.out.println("destroy method");
        }


		@Override
		public String getFortune() {
			// TODO Auto-generated method stub
			return null;
		}


		
        
}
