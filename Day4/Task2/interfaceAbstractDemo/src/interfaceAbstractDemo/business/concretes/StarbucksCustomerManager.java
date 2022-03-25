package interfaceAbstractDemo.business.concretes;

import interfaceAbstractDemo.business.abstracts.CustomerCheckService;
import interfaceAbstractDemo.business.abstracts.CustomerService;
import interfaceAbstractDemo.entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	private CustomerCheckService customerCheckService ;

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void Save(Customer customer) {
		
		if(customerCheckService.CheckIfRealPerson(customer)) {
			super.Save(customer);
		}
		else {
			System.out.println("Not a valid person");
		}
		
	}

	

}
