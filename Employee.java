public abstract class Employee{
	private String job;
	private double baseSalary;
	private double effectivnessMultiplier;
	private double paymentToDate;
	
	public Employee(){
		effectivnessMultiplier = 1;
		paymentToDate = 0;
	}
	// @BC: Great touch -- very valuable to have this handy
	public void setJob(String passIn){
		job = passIn;
	}
	public void setBaseSalary(double cashMoney){
		baseSalary = cashMoney;
	}
	public double getBaseSalary(){
		return baseSalary;
	}
	public abstract void work();
	
	public void earnPaycheck(){
		paymentToDate = paymentToDate + getBaseSalary() + (getEffectivnessMultiplier() * 10);
	}
	public void earnBonus(double amount){
		paymentToDate = paymentToDate + amount;
	}
	public void setEffectivnessMultiplier(double pass){
		// @BC: Very thoughtfully done! Nice job.
		effectivnessMultiplier = getEffectivnessMultiplier() + pass;
		if(getEffectivnessMultiplier() < 0){
			effectivnessMultiplier = 0;
		}
	}
	public double getEffectivnessMultiplier(){
		return effectivnessMultiplier;
	}
	public String getStatus(){
		return job + " has a base salary of " + baseSalary + ", has an effectiveness multiplier of " + effectivnessMultiplier + ", and has earned " + paymentToDate + " to date";
	}
}