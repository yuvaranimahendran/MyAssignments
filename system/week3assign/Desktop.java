package org.system.week3assign;

public class Desktop extends Computer {
	
	public void desktopSize() {
		System.out.println("My desktop size is 4GB RAM");
	}
	
	public static void main(String[] args) {
		
		Desktop desk=new Desktop();
		
		desk.computerModel();
		desk.desktopSize();
		
	}

}
