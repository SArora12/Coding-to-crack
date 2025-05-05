package AtmStates;

public class Atm {
	private static Atm atmObject=new Atm();
	
	AtmState atmState;
	int amtBalance;
	int noOfTwoThousand;
	int noOfFiveHundred;
	int noOfOneHundred;
	
	public AtmState getCurrentState() {
		return atmState;
	}
	public void setCurrentState(AtmState atmState) {
		this.atmState = atmState;
	}
	public static Atm getATMObject() {
        atmObject.setCurrentState(new IdleState());
        return atmObject;
    }
	
	public int getAmtBalance() {
		return amtBalance;
	}
	public void setAmtBalance(int amtBalance) {
		this.amtBalance = amtBalance;
	}
	public int getNoOfTwoThousand() {
		return noOfTwoThousand;
	}
	public void setNoOfTwoThousand(int noOfTwoThousand) {
		this.noOfTwoThousand = noOfTwoThousand;
	}
	public int getNoOfFiveHundred() {
		return noOfFiveHundred;
	}
	public void setNoOfFiveHundred(int noOfFiveHundred) {
		this.noOfFiveHundred = noOfFiveHundred;
	}
	public int getNoOfOneHundred() {
		return noOfOneHundred;
	}
	public void setNoOfOneHundred(int noOfOneHundred) {
		this.noOfOneHundred = noOfOneHundred;
	}
	   public void deductATMBalance(int amount) {
	        amtBalance = amtBalance - amount;
	    }

	    public void deductTwoThousandNotes(int number) {
	        noOfTwoThousand = noOfTwoThousand - number;
	    }

	    public void deductFiveHundredNotes(int number) {
	        noOfFiveHundred = noOfFiveHundred - number;
	    }

	    public void deductOneHundredNotes(int number) {
	        noOfOneHundred = noOfOneHundred - number;
	    }
	
	public void setBalance(int amtBalance, int noOfTwoThousand, int noOfFiveHundred, int noOfOneHundred) {
	    this.amtBalance = amtBalance;
	    this.noOfTwoThousand = noOfTwoThousand;
	    this.noOfFiveHundred = noOfFiveHundred;
	    this.noOfOneHundred = noOfOneHundred;
	}
	 public void printCurrentATMStatus(){
	        System.out.println("Balance: " + amtBalance);
	        System.out.println("2kNotes: " + noOfTwoThousand);
	        System.out.println("500Notes: " + noOfFiveHundred);
	        System.out.println("100Notes: " + noOfOneHundred);

	    }
	
}
