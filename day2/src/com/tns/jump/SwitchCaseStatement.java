package com.tns.jump;

public class SwitchCaseStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice =4 ;
		 switch(choice) {
		 case 1:
              System.out.println("current recharge detail");
              break;
		 case 2:
             System.out.println("current recharge expire");
             break;
		 case 3:
             System.out.println("new offer");
             break;
		 case 4:
             System.out.println("talk to our customer service");
             break;
         default:
        	 System.out.println("invalid input");
        	 break;
		 
		 }
		 
	}

}
