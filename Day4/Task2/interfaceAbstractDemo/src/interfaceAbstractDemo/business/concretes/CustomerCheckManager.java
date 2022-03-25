package interfaceAbstractDemo.business.concretes;


import interfaceAbstractDemo.business.abstracts.CustomerCheckService;
import interfaceAbstractDemo.entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
	
		return false;
	}



}
