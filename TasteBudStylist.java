public class TasteBudStylist extends Employee{
	setBaseSalary(100);
	setJob("TasteBudStylist");
	public void work(){
		Random r = new Random();
		int myNum = r.nextInt(100);
		makeShake(myNum);
	}
	public void makeShake(chanceOfIssue){
		if(chanceOfIssue > 89){
			effectivnessMultiplier = 1;
		}else{
			effectivnessMultiplier = effectivnessMultiplier + .1;
		}
	}
}