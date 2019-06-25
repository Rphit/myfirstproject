package comm.example.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	        
	        //get the bean
	        Coach thecoach=context.getBean("DOGdemo",Coach.class);
	        
	        
	        //call methods
	        System.out.println(thecoach.getDailyWorkOut());
	      //close context
	        context.close();
	}

}
