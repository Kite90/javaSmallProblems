package makeMiddle;

public class MakeMiddleClass {
	
	//
	//Given an array of ints of even length, return a new array length 2 
	//containing the middle two elements from the original array. The original array will be length 2 or more.
	//
	
	static public int[] makeMiddle(int[] nums ) {
		 int len = nums.length; //Length of array
		 int[] result = new int[2]; //New array for output
		
		  result[0] = nums[len/2-1];
		  result[1] = nums[len/2];
		  
		  return result;
		 
		 
	
	}

	public static void main(String[] args) {
		
		int[] input = {1, 2, 3, 4, 6, 7, 8}; //Input
		int[] output  = makeMiddle(input);
		
		System.out.println(output[0]);
		System.out.println(output[1]);
	}

}
