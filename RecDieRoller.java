package RecursiveDice_AAA;
/**
 * The program will roll a dice till the desired integer face and will print all the rolls
 * including the final 2
 * @author Abdifatah
 * 
 * 
 */

import java.util.Random;

public class RecDieRoller {
	
	public static void main(String [] args) {
		
		/**
		 * instantiating and calling our function
		 */
		RecDieRoller recursion = new RecDieRoller();
		var rec = recursion.roll();
		System.out.println(rec);

		}
	
	/**
	 * Declaring recursive method called roll
	 * The recursive method creates a random integer representing
	 *  the face of a die
	 * 
	 * @return
	 */
		final int roll () {
			//Recursive method
		int roll= (int)(Math.random()*6)+1;
		System.out.println(roll);

		//base case
		if (roll == 2 ) {
		return -1;
		}//end if

		else {
		return roll();
		}//end else


		}//end main

		}//end class
		
	
		
		
	
		
	



