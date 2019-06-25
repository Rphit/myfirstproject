
	package comm.example.springDemo;

	import org.springframework.context.support.ClassPathXmlApplicationContext;



	public class MyApp {
		
		public static void main(String[] args)
		{

			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			
			Customer mydetails = context.getBean("customer", Customer.class);
			
			System.out.println(mydetails.getHumanDetails());
			
			System.out.println(mydetails.getAddress());
			
		}

	}



