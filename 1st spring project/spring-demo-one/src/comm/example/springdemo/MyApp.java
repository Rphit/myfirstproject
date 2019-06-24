package comm.example.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //get the applicationContext
		
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        //get the bean
        Coach mycoach=context.getBean("myTrackCoach",Coach.class);
        
        //call methods
        System.out.println(mycoach.getDailyWorkOut());
        //close context
        context.close();
	}

}
