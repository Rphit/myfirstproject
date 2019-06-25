package comm.example.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	        
	        //get the bean
	        Coach thecoach=context.getBean("footballCoach",Coach.class);
	        
	        
	        //call methods
	        System.out.println(thecoach.getDailyWorkOut());
	        System.out.println(thecoach.getDailyFortune());
	      //close context
	        context.close();
	}

}
