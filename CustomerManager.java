package com.springDemo;

public class CustomerManager implements ICustomerService {
	private ICustomerDal customerDal;
	
//	//property injection(setter injection)
//	public void setCustomerDal(ICustomerDal customerDal) {
//		this.customerDal = customerDal;
//	}
//

	//constructor injection
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
		
	}
	
	
	public void add() {
		//business code
		customerDal.add();
		
	}
	
}
