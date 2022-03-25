package interfaceAbstractDemo.business.abstracts;

import interfaceAbstractDemo.entities.Customer;

public interface CustomerCheckService {
	boolean CheckIfRealPerson(Customer customer);
}
