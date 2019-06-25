package comm.example.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjectionApp {
	
	public static void main(String args[])
	{
		  ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("properties_applicationContext.xml");
	        
	        //get the bean
	       TennisCoach myCoach=context.getBean("myTennisCoach",TennisCoach.class);
	        
	        //call methods
	     //   System.out.println("email  "+myCoach.getEmailAddress());
	       // System.out.println("team  "+myCoach.getTeam());
	      //  System.out.println(myCoach.getDailyWorkOut());
	      //  System.out.println(myCoach.getDailyFortune());
	       
	       TennisCoach alphaCoach=context.getBean("myTennisCoach",TennisCoach.class);
	       
	       boolean result=(myCoach==alphaCoach);
	       System.out.println("   same object   "+result);
	    	System.out.println("location mycoach  "+myCoach);
	    	System.out.println("location myalpha   "+alphaCoach);
	    		   
	       //close context
	        context.close();
	}

}
