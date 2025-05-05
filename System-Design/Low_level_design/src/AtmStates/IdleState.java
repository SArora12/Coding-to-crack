package AtmStates;

public class IdleState extends AtmState{
	@Override
	public void insertCard(Atm atm,Card card) {
		System.out.println("Card inserted");
		atm.setCurrentState(new HasCardState());
	}
}
