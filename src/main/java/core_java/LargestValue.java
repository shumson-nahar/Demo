package core_java;

public class LargestValue {

	public static void main(String[] args) {
		int[] arr = {2,3,15,6,9,18,23,2};
		int val = arr[0];
		for(int i =0;i<arr.length;i++) {
			if(arr[i]>val) {
				val=arr[i];
			}
			
				 
			
		}
		System.out.println("Largest value"+ " "+val);

	}

}
