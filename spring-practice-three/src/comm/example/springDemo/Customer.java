package comm.example.springDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:IdName.properties")
public class Customer implements Human {
	
	
	
	
	@Value("${id}")
	private String Customer_id;
	@Value("${name}")
	private String Customer_name;

	public Address myAddress;
	
	public Customer() {
		super();
	}

	@Autowired
	public Customer(@Qualifier("home") Address myAddress) {
		super();
		this.myAddress = myAddress;
			
	}

	public String getCustomer_id() {
		return Customer_id;
	}

	public String getCustomer_name() {
		return Customer_name;
	}


	@Override
	public String getHumanDetails() {
		// TODO Auto-generated method stub
		return "cust_id ->"+Customer_id+ "\n" +" cust_name ->" +Customer_name ;
	}

	@Override
	public String getAddress() {
		// TODO Auto-generated method stub
		return myAddress.getAddress();
	}
}
