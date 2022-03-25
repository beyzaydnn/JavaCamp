package interfaceAbstractDemo.business.concretes;

import interfaceAbstractDemo.business.abstracts.CustomerService;
import interfaceAbstractDemo.entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {

	
	public void Save(Customer customer) {
		System.out.println("Saved to db :"+ customer.firstName);
		
	}

}
