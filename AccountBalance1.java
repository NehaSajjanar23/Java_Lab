package mypack1;
class Balance{
	String name;
	double balance;
 Balance(String s,double f)
{
 	name=s;
 	balance=f;
}
void showtype()
{
	if(balance<0)
	{ 
		System.out.println("NO Balance");
	}
	if(balance>0)
	{
		System.out.println("Name"+" "+name);
		System.out.println("balance:"+" "+balance);
	}
}
}
class AccountBalance1{
 public static void main(String args[])
{ 
	Balance current[]=new Balance[3];
        current[0]=new Balance("A",1000.0);
        current[1]=new Balance("B",2000.0);
        current[2]=new Balance("C",-2.5);
   	for(int i=0;i<3;i++)
	{
 		current[i].showtype();
	}
}
}

