package sameer;

public class User1 {

	 String name;
	 long accNo;
	 String userType;
	 int amount;



	public String getName() {
		return name;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAccNo() {
		return accNo;
	}

	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}



	private User1(String name, long accNo, String userType,int amount ) {
		this.name=name;
		this.accNo=accNo;
		this.userType=userType;
		this.amount=amount;
	}





}
