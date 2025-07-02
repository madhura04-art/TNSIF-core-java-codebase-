package com.tns.firstpackage;

public class Base {
 
	int varDefault;
	public int varPublic=20;
	private int varPrivate=30;
	protected int varProtected=40;
	//declaring default public protected and private method
	void methodDefault() {
		System.out.println("default acces base class ");
		System.out.println("public variable:"+varPublic);
		
	}
	public void methodPublic() {
		System.out.println("default acces base class ");
		System.out.println("public variable:"+varPublic);
		
	}
	protected void methodProtected() {
		System.out.println("default acces base class ");
		System.out.println("public variable:"+varProtected);
		
	}
	private void methodPrivate() {
		System.out.println("default acces base class ");
		System.out.println("public variable:"+varPrivate);
		
	}
}
