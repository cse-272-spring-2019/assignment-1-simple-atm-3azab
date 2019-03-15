public class users {
 private static double balance=0;
 public boolean validate (String userPassword) {
	 String pinCode = "1998";
	 if(pinCode.equals(userPassword)) return true;
	 else return false;
 }
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
}

 
 
