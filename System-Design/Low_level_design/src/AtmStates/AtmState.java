package AtmStates;

public abstract class AtmState {
	
	public void insertCard(Atm atm,Card card) {
	System.out.println("Oops, something went wrong");
	}
	public void authenticatePin(Atm atm,Card card, int pin) {
		System.out.println("Oops, something went wrong");
	}
	public void selectOperation(Atm atm,Card card,Transaction type) {
		System.out.println("Oops, something went wrong");
	}
	public void cashWithdrawal(Atm atm,Cash cash, int amt) {
		System.out.println("Oops, something went wrong");
	}
	public void displayBalance(Atm atm,Cash cash) {
		System.out.println("Oops, something went wrong");
	}
	
	public void returnCard() {
		System.out.println("Oops, something went wrong");
	}
	public void exit(Atm atm) {
		System.out.println("Oops, something went wrong");
		
	}
}
