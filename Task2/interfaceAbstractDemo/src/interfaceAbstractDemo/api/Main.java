package interfaceAbstractDemo.api;

import interfaceAbstractDemo.business.concretes.BaseCustomerManager;
import interfaceAbstractDemo.business.concretes.CustomerCheckManager;
import interfaceAbstractDemo.business.concretes.NeroCustomerManager;
import interfaceAbstractDemo.business.concretes.StarbucksCustomerManager;
import interfaceAbstractDemo.entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager baseCustomerManager = new NeroCustomerManager();
		baseCustomerManager.Save(new Customer(1,"Beyza","Aydin","2022","0123456"));
		
		BaseCustomerManager baseCustomerManager1 = new StarbucksCustomerManager(new CustomerCheckManager());
		baseCustomerManager1.Save(new Customer(1,"Ali","Aydin","1996","345678"));
	}

}
