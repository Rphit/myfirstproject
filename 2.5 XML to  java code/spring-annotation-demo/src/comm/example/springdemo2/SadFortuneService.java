package comm.example.springdemo2;

import comm.example.springdemo.FortuneService;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "today is bad day";
	}

}
