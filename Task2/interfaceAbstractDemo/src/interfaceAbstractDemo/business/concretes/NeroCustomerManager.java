package interfaceAbstractDemo.business.concretes;

import interfaceAbstractDemo.business.abstracts.CustomerService;
import interfaceAbstractDemo.entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {

	@Override
	public void Save(Customer customer) {
		super.Save(customer);
	}


}
