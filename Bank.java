class Acc
{
 	String Coust_name;
	int acc_num;
	double balance;
	Acc(String name,int num,double bal)
	{ 
		Coust_name=name;
		acc_num=num;
		balance=bal;
	}
	
	void deposit(double amt)
	{
		balance += amt;
		System.out.println("Amount Deposited:"+" "+amt);
	}
        void disBal()
	{
		System.out.println("balance in account is:"+" "+balance);
	}
}

class Sav_Acc extends Acc
{ 
	double intrest=0.05;
	Sav_Acc(String name,int num,double bal)
	{
		super(name,num,bal);
	}	
	void com_int()
	{
		double itr=balance*intrest;
		deposit(itr);
		System.out.println("interest of"+itr+"added to balance");
	}
	void withdraw( double amount)
	{
		if(balance>=amount)
		{
			balance -=amount;
			System.out.println("Amount withdrawed is:"+amount);
		}
		else
		{
			System.out.println("cannot withdraw balance is less");
		}
 	}
}
class Cur_Acc extends Acc
{
	 double min_bal=1000.0;
	 double ser_char=50;
	Cur_Acc(String name,int num,double bal)
	{
		super(name,num,bal);
	}
	void min_bal1()
	{
		if(balance<min_bal)
		{
			balance -=ser_char;
 			System.out.println("Balance is:"+" "+balance);
		}
		else
		{
			System.out.println("Balance more than min balance");
		}
	}
}
class Bank
{
	public static void main(String args[])
	{
		Sav_Acc s=new Sav_Acc("Ankit",135,86000);
		s.disBal();
		s.deposit(5000);
		s.disBal();
		s.com_int();
		s.withdraw(90000);
		s.disBal();
		Cur_Acc c=new Cur_Acc("Ankush",235,56000);
		c.min_bal1();
		c.disBal();
	}
}













	

			