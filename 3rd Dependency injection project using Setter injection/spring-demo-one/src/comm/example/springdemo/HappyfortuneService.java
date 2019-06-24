package comm.example.springdemo;

public class HappyfortuneService implements FortuneService {
	
	
	
	public HappyfortuneService() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("happy_fortune_service object created");
	}

	public String getFortune()
	{
		return " today is your lucky day ";
		
	}
	

}
