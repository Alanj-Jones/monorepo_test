import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Exercise {

	private ArrayList<Integer> myList = new ArrayList<Integer>();	
	
	public ArrayList<Integer> generatePrimes(int n) {
		
		for (int i = 2; i <= n; i++) {
			if (isPrime(i)) {
				myList.add(i);
			}			
		}		
		return myList;
	}	
	
	public  boolean isPrime(int n) {
		boolean bPrime = true;
		
		if (n != 0 && n!=1) {
			for (int i = 2; i < n; i++) {				
				if (n%i == 0){					
					bPrime = false;
					break;
				}				
			}
		}		
		return bPrime;
	}	
	
	public static void main(String[] args) {
		Exercise test = new Exercise();
		System.out.println(
				test.generatePrimes(
						Integer.parseInt(
								JOptionPane.showInputDialog("Up to what number you want to generate prime numbers?"))
						)
				);
	}

}
