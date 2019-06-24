package comm.example.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjectionApp {
	
	public static void main(String args[])
	{
		  ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("setter-applicationContext.xml");
	        
	        //get the bean
	       CricketCoach myCoach=context.getBean("myCricketCoach",CricketCoach.class);
	        
	        //call methods
	        System.out.println("email "+myCoach.getEmailAddress());
	        System.out.println("team "+myCoach.getTeam());
	        System.out.println(myCoach.getDailyWorkOut());
	        System.out.println(myCoach.getDailyFortune());
	        //close context
	        context.close();
	}

}
