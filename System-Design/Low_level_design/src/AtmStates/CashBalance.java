package AtmStates;

public class CashBalance {
	
	@Override
	public void displayBalance(Atm atm,Card card) {
		System.out.println("Your balance is "+ card.getBankBalance());
		exit(atm);
	}
	@Override
	public void exit(Atm atm) {
		returnCard();
		atm.setCurrentState(new IdleState());
		System.out.println("Exit Happens");
	}
	
	@Override
	public void returnCard() {
		System.out.println("Please take out your card");
	}
}
