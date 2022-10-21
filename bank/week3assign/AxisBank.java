package org.bank.week3assign;

public class AxisBank extends BankInfo {
	
	public void deposite()
	{
		super.deposite();
	}
	
	public static void main(String[] args) {
		
		AxisBank bank=new AxisBank();
		bank.deposite();
		bank.fixed();
		bank.saving();
		}

}
