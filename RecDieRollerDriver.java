package RecursiveDice_AAA;

public class RecDieRollerDriver {
	
	public static void main(String [] args) {
		
		RecDieRoller roller= new RecDieRoller();
		roller.roll();
		
		//int roll= (int)(Math.random()*6)+1;
		//System.out.println(roll);
		
		for (int i=0; i<1000; i++) {
			int roll= (int)(Math.random()*6)+1;
			System.out.println(roll);
			//print(i);
		}
		
		
	}//end main
	

}//end class
