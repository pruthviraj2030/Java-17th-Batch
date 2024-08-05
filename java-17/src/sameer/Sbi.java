package sameer;

import static com.sun.tools.javac.jvm.ByteCodes.ret;

public class Sbi implements Bank {

		


	@Override
	public void deposit(int amt, User1 ob) {

		System.out.println("The amount"+amt+"deposited");
	}


	private boolean giveMoney(){
		return true;
	}


	@Override
	public void giveMoney(int amt, User1 user) {

		if(user.equals("employee")){
			giveMoney();

		}


		System.out.println("The amount"+amt+"given");

	}



	@Override
	public void withdraw(int amt, User1 ob) {
		if(ob.getAmount()>0) {
			int a=ob.getAmount()-amt;
			ob.setAmount(a);
			System.out.println("The updated balance"+ob.getAmount());

		}
	}


	protected void defultAccessModifier(){
		System.out.println("deafultAccessModifier() is called");
	}
	

}
