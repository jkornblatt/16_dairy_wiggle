import java.util.Random;
public class Moover extends Employee{
	public Moover(){
		setBaseSalary(75);
		setJob("Moover");
	}
	public void work(){
		Random r = new Random();
		int myNum = r.nextInt(100);
		takeOrder(myNum);
	}
	public void takeOrder(int chanceOfIssue){
		if(chanceOfIssue > 80){
			setEffectivnessMultiplier(-1);
		}else{
			setEffectivnessMultiplier(.05);
			Random r = new Random();
			int myNumTwo = r.nextInt(100);
			deliverShake(myNumTwo);
		}
	}
	public void deliverShake(int chance){
		if(chance > 95){
			setEffectivnessMultiplier(-1);
		}else{
			setEffectivnessMultiplier(.03);
		}
	}
}