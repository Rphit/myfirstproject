package comm.example.springdemo;

import java.util.ArrayList;
import java.util.Random;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import comm.example.springdemo.FortuneService;

@Component
@Scope("prototype")
public class HappyFortuneService implements FortuneService {
	
		public String getFortune()
	{   
			
		return "fortune";
	}
	
}