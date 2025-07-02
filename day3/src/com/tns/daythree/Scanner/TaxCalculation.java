package com.tns.daythree.Scanner;

public class TaxCalculation  {
	   Person person = new Person();
	   public void calculateTax(Person person){
		if (person.getAge()>=65 || person.getGender().equalsIgnoreCase("female"))
		{
			person.setTax(0);
			System.out.println("Tax  is not applicable");
		}
		else {
			if (person.getIncome()<= 160000)
			{
				person.setTax(0);
				System.out.println("Tax  is not applicable");
				
			}
			else if ((person.getIncome()>160000) && (person.getTax()<=500000)){
				person.setTax((person.getIncome()-160000*10/100));
			}
			else if ((person.getIncome()>500000) && (person.getTax()<=800000)){
				person.setTax((person.getIncome()-160000*20/100 +34000));
			}
		}
		
	}

}
