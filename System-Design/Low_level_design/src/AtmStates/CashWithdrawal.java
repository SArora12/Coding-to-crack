package AtmStates;

import CashWithdraw.CashWithdrawProcessor;

public class CashWithdrawal {
	
	public CashWithdrawal() {
		System.out.println("Please enter the amount of cash");
	}
	@Override
	public void cashWithdrawal(Atm atm,Card card,int amt) {
		if(atm.getAtmBalance<amt) {
			System.out.println("Insufficient fund in atm");
			exit(atm);
		}
		else if(card.getBankBalance()<amt) {
			System.out.println("Insufficient fund in your account");
			exit(atm);
		}
		else {
			card.deductBankBalance(amt);
			atm.deductATMBalance(amt);
			
			CashWithdrawProcessor cash=new TwoThousand(new FiveThousand(new OneHundred(null)));
			cash.withdraw(atm,amt);
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
