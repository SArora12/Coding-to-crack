package AtmStates;

public class SelectOperation extends AtmState {
	public SelectOperation() {
		showOperations();
	}
	@Override
	public void selectOperation(Atm atm,Card card,Transaction type) {
		switch(type) {
		case CASH_WITHDRAWAL:
			atm.setCurrentState(new CashWithdrawal());
			break;
		case BALANCE_CHECK:
            atm.setCurrentState(new CashBalance());
            break;
        default: {
            System.out.println("Invalid Option");
            exit(atm);
		}
		
	}
	
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
