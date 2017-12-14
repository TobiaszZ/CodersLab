package b_Zadania_domowe.a_Dzien_1;

public class BankAccount {
	
	private int number;
	private double cash=0;

	public int getNumber() {
		return number;
	}

	public double getCash() {
		return cash;
	}
	
public void depositCash(int amount) throws Exception {
	 	if(amount<0) throw new Exception("wiecej od 0");
	 	this.cash+=amount;	
}
public double withdrawCash(double amount) throws Exception {
		if(amount<0) throw new Exception("wiecej od 0");
		if(this.cash-amount<0) {
			this.cash=0;
		return this.cash;
		}
		else {
			this.cash-=amount;
		return this.cash;
		}
}
}
