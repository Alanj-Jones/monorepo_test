
public class Exercise {
	
	//In the heading it doesn't specify if the same number can't be taken twice from the same index.
	//In the case that we can't use a number from the same index twice, i would modify the initial declaration value of j to j = 1
	public static boolean addUp(int[] li , int k) {
		boolean result = false;
		for (int i = 0; i < li.length ; i++) {
			
			for (int j = 0; j< li.length ; j++) {
				
				if ( (li[i] + li[j]) == k) {
					result = true;
				}
			}			
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		
		int[] list = {10, 15, 3, 7};
		int k = 25;
		System.out.println(addUp(list, k));
		
	}

}
