package assignmentone;

public class TwoWheeler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoWheeler two=new TwoWheeler();
		int nos=two.noOfWheels();
		System.out.println(nos);
		short mirrors=two.noOfMirrors();
		System.out.println(mirrors);
		long isnumber=two.chassisNumber();
		System.out.println(isnumber);
		
		boolean punc=two.isPunctured();
		System.out.println(punc);
		
		String bikename=two.bikeName();
		System.out.println(bikename);
		
		double km=two.runningKM();
		System.out.println(km);
	}

	private double runningKM() {
		double km=189097;
		return km;
	}

	private String bikeName() {
		String bikename="Harley";
		return bikename;
	}

	private boolean isPunctured() {
		return false;
	}

	private long chassisNumber() {
		long isNumber=76876778;
		return isNumber;
	}

	private short noOfMirrors() {
		short mirrors=7;
		return mirrors;
	}

	private int noOfWheels() {
		int nos=2;
		return nos ;
	}

}
