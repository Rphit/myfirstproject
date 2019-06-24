package comm.example.springdemo;

public class HappyfortuneService implements FortuneService {
	
	
	
	public HappyfortuneService() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("happy fortune object created");
	}

	public String getFortune()
	{
		return " today is your lucky day ";
		
	}
	

}
