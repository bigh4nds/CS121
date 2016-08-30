
public class BankingDriver 
{
	public static void main(String[] args) 
	{
	//Creates nicksAcct object with $400 in checking and $500 in savings
	Banking nicksAcct= new Banking("Nick",400, 500);
	//Creates carolsAcct object with $600 in checking and $700 in savings
	Banking carolsAcct= new Banking("Carol",600, 700);
	//Prints total money in nicksAcct
	System.out.println("Total in "+nicksAcct.getName()+"'s account: "+nicksAcct.getTotalMoney());
	//Prints total money in carolsAcct
	System.out.println("Total in "+carolsAcct.getName()+"'s account: "+carolsAcct.getTotalMoney());
	//Adds $100 to Nick's checking account
	nicksAcct.setCheckMoney(nicksAcct.getCheckMoney()+100);
	//Stats on Nick's account
	System.out.println(nicksAcct);
	//Sets transferAmnt to total amount of money in Nick's account
	int transferAmnt=nicksAcct.getTotalMoney();
	//Sets Nick's checking account to $0
	nicksAcct.setCheckMoney(0);
	//Sets Nick's saving account to $0
	nicksAcct.setSaveMoney(0);
	//Adds money from Nick's account to Carol's savings account
	carolsAcct.setSaveMoney(carolsAcct.getSaveMoney()+transferAmnt);
	//Stats on Nick's account
	System.out.println(nicksAcct);
	//Stats on Carol's account
	System.out.println(carolsAcct);	
	}

}
