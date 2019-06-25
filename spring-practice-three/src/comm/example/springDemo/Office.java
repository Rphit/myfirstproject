package comm.example.springDemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:officeadd.properties")
public class Office implements Address {
	
	@Value("${lane}")
	private String lane;
	@Value("${phNo}")
	private String contactNo;

	
	public String getAddress() {
		// TODO Auto-generated method stub
		return "lane"+lane+" contact no."+contactNo;
	}
	
	

}
