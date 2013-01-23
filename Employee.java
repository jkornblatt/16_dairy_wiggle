public abstract class Employee{
	private String job;
	private int baseSalary;
	private int effectivnessMultiplier;
	private int paymentToDate;
	
	public Employee(String j, int bS){
		effectivnessMultiplier = 1;
		paymentToDate = 0;
	}
	
	public void setJob(passIn){
		job = passIn;
	}
	public void setBaseSalary(cashMoney){
		baseSalary = cashMoney;
	}
	public int getBaseSalary(){
		return baseSalary;
	}
	public abstract void work();
	
	public void earnPaycheck(){
		paymentToDate = paymentToDate + (getBaseSalary() * effectivnessMultiplier);
	}
	public void earnBonus(amount){
		paymentToDate = paymentToDate + amount;
	}
	public String getStatus(){
		effectivnessMultiplier = 1;
		return job + " has a base salary of " + baseSalary + ", has an effectiveness multiplier of " + effectivnessMultiplier + ", and has earned " + paymentToDate + " to date";
	}
}