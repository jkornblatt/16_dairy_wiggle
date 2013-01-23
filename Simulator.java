import java.util.Random;
public class Simulator{
	public static void main(String[] args){
		Simulator s = new Simulator();
	}
	private Employee[] worker;
	private int week;
	private int day;
	
	public Simulator(){
		week = 0;
		day = 0;
		worker = new Employee[6];
		TastebudStylist t = new TastebudStylist();
		Moover m = new Moover();	
		Shaker s = new Shaker();
		for(int i = 0; i < 2; i++){
			worker[i] = t;
		}
		for(int i = 2; i < 4; i++){
			worker[i] = m;
		}
		for(int i = 4; i < 6; i++){
			worker[i] = s;
		}
		
		for(int i = 0; i < 24; i++){
			if(i == 3 || i == 7 || i == 11 || i == 15 || i == 19 || i == 23){
				Random r = new Random();
				int myNum = r.nextInt(6);
				worker[myNum].earnBonus(100);
			}
			for(int j = 0; j < 6; j++){
				for (int k = 0; k < worker.length; k++){
					worker[k].work();
				}
				day = day + 1;
				if(day > 5){
					printWeeklySummary();
					day = 0;
					week = week + 1;
				}
			}
		}
	}
	public void printWeeklySummary(){
		String b = "";
		for(int i = 0; i < worker.length; i++){
			worker[i].earnPaycheck();
			b = b + ", " + worker[i].getStatus();
		}
		System.out.println(b);	
	}
}