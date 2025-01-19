package entities;

public class BusinessAccount extends Account {

	private Double loanLimit; // LIMITE DE EMPRESTIMO
	
	public BusinessAccount() {
		super(); // 'SUPER' SERVE PARA EXECUTAR A LOGICA DO CONTRUTOR BASE, NO CASO O 'ACCOUNT'
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance); // 'SUPER' SERV...
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(double amount) {
		if(amount <= loanLimit) { // SE A QUANTIA QUE FOR EMPRESTE É MENOR OU IGUAL O MEU LIMITE
			balance += amount - 10.0; // 'ACCOUNT.BALANCE' EM PRIVATE NÃO FUNFA, MAS EM PROTECTED SIM
		}
	}
	
	@Override
	public void withdraw(double amount) { // SOBREPONDO PARA POUPANCA
		super.withdraw(amount);
		balance -= 2.0;
	}
	
}
