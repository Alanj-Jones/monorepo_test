import java.util.ArrayList;

public class Exercise {

	private static ArrayList<Integer> myList = new ArrayList<Integer>();
	
	public static ArrayList<Integer> generatePrimes(int n) {
		
		for (int i = 2; i <= n; i++) {
			myList.add(i);
		}
		
		return myList;
	}
	
	public boolean isPrime(int n) {
		boolean bPrime;
		
		if (n != 0 || n!=1) {
			for (int i = 0; i < n; i++) {
				
			}
		}else {
			
		}
		
		
		return true;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(
				generatePrimes(100)
				);
	}

}
