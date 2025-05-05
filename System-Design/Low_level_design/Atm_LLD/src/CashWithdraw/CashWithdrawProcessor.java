package CashWithdraw;

import AtmStates.Atm;

public class CashWithdrawProcessor {
	CashWithdrawProcessor nextProcessor;
	CashWithdrawProcessor(CashWithdrawProcessor cashWithdrawprocessor){
		this.nextProcessor=cashWithdrawprocessor;
	}
	
	public void withdraw(Atm atm,int remainingamt) {
		if(nextProcessor!=null) {
			nextProcessor.withdraw(atm, remainingamt);
		}
	}
	
}
