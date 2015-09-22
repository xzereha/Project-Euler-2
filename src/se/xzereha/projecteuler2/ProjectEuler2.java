/*
 * This is my solution to Problem 2 from https://projecteuler.net/
 */
package se.xzereha.projecteuler2;

public class ProjectEuler2 {
	
	public static void main (String[] args) {
		
		int nr1 = 1;
		int nr2 = 2;
		int sum = 0;
		
		while (nr2<=4000000) {
			if (nr2%2 == 0){
				sum +=nr2;
			}
			
			int temp = nr1;
			nr1 = nr2;
			nr2 = temp+nr1;
		}
		
		System.out.println(sum);
	}
	
}
