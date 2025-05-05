package AtmStates;

public class HasCardState extends AtmState {
	public HasCardState() {
		System.out.println("enter your pin");
	}
	@Override
	public void authenticatePin(Atm atm,Card card,int pin) {
		boolean isPinCorrect=card.isPINCorrect(pin);
		if(isPinCorrect) {
			atm.setCurrentState(new SelectOperation());
			
		}
		else {
			System.out.println("Incorrect Pin");
			exit(atm);
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
