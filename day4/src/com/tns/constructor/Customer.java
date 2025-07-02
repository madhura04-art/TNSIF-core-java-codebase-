package com.tns.constructor;

public class Customer {
     private String customername;
     private int customerId;
     private String customerCity;
     
     public Customer() 
     {
    	 System.out.println("This is an default constructor");
    	 
     }
     

	public Customer(String customername, int customerId, String customerCity) 
	{
		this();
		System.out.println("This is an parameterize constructor");
		this.customername = customername;
		this.customerId = customerId;
		this.customerCity = customerCity;
		
		System.out.println();
	}
	
	
	
	 public Customer( int customerId, String customerCity) {
		this();
		this.customerId = customerId;
		this.customerCity = customerCity;
	}


	public String getCustomername() {
			return customername;
		}

		public void setCustomername(String customername) {
			this.customername = customername;
		}

		public int getCustomerId() {
			return customerId;
		}

		public void setCustomerId(int customerId) {
			this.customerId = customerId;
		}

		public String getCustomerCity() {
			return customerCity;
		}

		public void setCustomerCity(String customerCity) {
			this.customerCity = customerCity;
		}

		
}
