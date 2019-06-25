package comm.example.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HookUpMyapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("setter-applicationContext.xml");
        
        //get the bean
        TennisCoach thecoach=context.getBean("myCoach",TennisCoach.class);
        
        //call methods
        System.out.println(thecoach.getEmailAddress());
      //  System.out.println(mycoach.getDailyFortune());
        //close context
        context.close();
	}

}
