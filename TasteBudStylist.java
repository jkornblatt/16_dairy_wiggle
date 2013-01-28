import java.util.Random;
public class TasteBudStylist extends Employee{
	public TasteBudStylist(){
		setBaseSalary(100);
		setJob("TasteBudStylist");
	}
	public void work(){
		Random r = new Random();
		int myNum = r.nextInt(100);
		makeShake(myNum);
	}
	public void makeShake(int chanceOfIssue){
		if(chanceOfIssue > 89){
			// @BC: Due to the complexity of your mutator method, this call ends up being excessively complicated.
			//		Maybe add a resetEM() method?
			setEffectivnessMultiplier(((getEffectivnessMultiplier())*-1)+1);
		}else{
			setEffectivnessMultiplier(.1);
		}
	}
}