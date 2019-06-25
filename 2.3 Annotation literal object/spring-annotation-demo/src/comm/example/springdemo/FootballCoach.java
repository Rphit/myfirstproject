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

//	@Qualifier(happyfortuneService)
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
			BufferedReader br = null;
			try {
			br = new BufferedReader(new FileReader("D:\\sts workspace\\spring-annotation-demo\\src\\file.txt"));
			} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
			   String line = null;

			   try {
			while ((line = br.readLine()) != null) {


			String[] al = line.split(",");
			 int random = ThreadLocalRandom.current().nextInt(0, 4);
			System.out.println(al[random]);
			}
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
			   try {
			br.close();
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
        @PreDestroy
        public void doSomeCleanStuff()
        {
        	System.out.println("destroy method");
        }


		
        
}
