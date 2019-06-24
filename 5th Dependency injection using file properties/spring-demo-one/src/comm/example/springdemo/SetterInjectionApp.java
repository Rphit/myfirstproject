package comm.example.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjectionApp {
	
	public static void main(String args[])
	{
		  ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("properties_applicationContext.xml");
	        
	        //get the bean
	       TennisCoach myCoach=context.getBean("myCoach",TennisCoach.class);
	        
	        //call methods
	        System.out.println("email  "+myCoach.getEmailAddress());
	        System.out.println("team  "+myCoach.getTeam());
	        System.out.println(myCoach.getDailyWorkOut());
	      //  System.out.println(myCoach.getDailyFortune());
	        //close context
	        context.close();
	}

}
