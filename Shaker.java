import java.util.Random;
public class Shaker extends Employee{
	public Shaker(){
		setBaseSalary(70);
		setJob("Shaker");
	}
	public void work(){
		shake();
	}
	public void shake(){
		setEffectivnessMultiplier(.02);
	}
}