import java.util.ArrayList;

public class Exercise {
	

	private static int count;
	
	public static ArrayList<Integer> sortArrayByPairs(ArrayList<Integer> arrToSort){
		//ArrayList<Integer> newArray ;
			for (int i= 0; i<arrToSort.size();i+=2) {
				if (arrToSort.get(i) != arrToSort.get(i+1)) {
					for (int j = i + 2; j<arrToSort.size() ; j++) {
						if (arrToSort.get(i) == arrToSort.get(j)) {
							int saveValue = arrToSort.get(i);
							arrToSort.set(i, null);
							swapNumbers(arrToSort, arrToSort.get(i+1), arrToSort.get(j));
							arrToSort.set(i, saveValue);
							count++;
							break;
						}
					}
				}
			}
		return arrToSort;
	}		
				
	
	
	public static void swapNumbers(ArrayList<Integer> ar, int n, int m){
		int[] values = {n,m};
		if (n != m) {
			int indexOfn = ar.indexOf(n);
			int indexOfm = ar.indexOf(m);
			ar.set(indexOfn, values[1]);
			ar.set(indexOfm, values[0]);			
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		ArrayList<Integer> myArray = new ArrayList<Integer>();		
		
		myArray.add(1); myArray.add(2); myArray.add(3);
		myArray.add(4); myArray.add(5); myArray.add(1);
		myArray.add(2); myArray.add(3); myArray.add(4);
		myArray.add(5);
		  
		  if (myArray.size() % 2 == 0) { 
			  System.out.println("La lista ordenada: "+sortArrayByPairs(myArray));
			  System.out.println("Contador: "+ count);
		  }		 
	}

}
