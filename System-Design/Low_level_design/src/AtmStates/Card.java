package AtmStates;

public class Card {
int cardNo;
static int pinNumber=1234;
int cvv;
String cardHolder;
UserBankAccount userbank;

boolean isPINCorrect(int pin) {
	if(pin==pinNumber) {
		return true;
	}
	else {
		return false;
	}
}

	int getBankBalance( ) {
		userbank.balance;
	}
	
	void deductBankBalance(int amt) {
		userbank.withdraw(amt);
	}
	 void setBankAccount(UserBankAccount userbank) {
		 this.userbank=userbank;
	 }
}
