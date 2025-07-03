package com.tns.multilevel;

public class MultiLevelInheritenceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      City c= new City();
      c.setCityname("pune");
      c.setArea("talegaon");
      c.setStatname("mahrashtra");
      c.setLanguage("marathi");
      c.setCountrynmame("india");
      c.setCapital("new delhi");
      
      System.out.println("city: "+c.getCityname());
      System.out.println("area: "+c.getArea());
      System.out.println("State: "+c.getStatname());
      System.out.println("lang: "+c.getLanguage());
      System.out.println("country: "+c.getCountrynmame());
      System.out.println("capital: "+c.getCapital());
	}

}
