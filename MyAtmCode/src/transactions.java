import java.util.ArrayList;

public class transactions {
private static int  index=0;
private static ArrayList<String> arrtrans=new ArrayList<String>(6);
private users us=new users();
public void addtoHist(String a,double b) {
	String tran=String.valueOf(b);
	String s=a+tran;
	arrtrans.add(s);

	if (arrtrans.size()==6) {
		arrtrans.remove(0);
	}
	index=arrtrans.size();
	System.out.println(index);
}
public boolean withDrValid(double amount,double balance) {
	boolean validation =false;
	if(amount<=balance) {
		validation= true;
		}
	return validation;
	}

public void WithdrawBalance(double amount) {

	us.setBalance(us.getBalance()-amount);
	this.addtoHist("Withdrawed : ", amount);
}

public void DepositBalance(double amount) {

	us.setBalance(us.getBalance()+amount);
	this.addtoHist("Deposited : ", amount);	
}

public double balanceInq()
{
	this.addtoHist("Balance inq : ", us.getBalance());
	return us.getBalance();	
}
public String getPrevious(){
	index--;
	if(index<0)
		index=-1;
	if(index<0) {
		return "No Previous History";
	}
	return arrtrans.get(index);
}
public String getNext() {
	index++;
	if(index>arrtrans.size())
		index=arrtrans.size();
	if(index>=arrtrans.size())
		return "No Next History";
	else
		return arrtrans.get(index);
}
}