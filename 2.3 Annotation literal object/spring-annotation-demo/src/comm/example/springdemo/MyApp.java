package comm.example.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	        
	        //get the bean
	        FootballCoach mycoach=context.getBean("footballCoach",FootballCoach.class);
	        
	        
	        //call methods
	        System.out.println(mycoach.getDailyWorkOut());
	        System.out.println(mycoach.getDailyFortune());
	        System.out.println(mycoach.getEmailAddress());
	        System.out.println(mycoach.getTeam());
	      //close context
	        context.close();
	}

}
