import java.util.Arrays;
import java.util.List;

public class PartialSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] array = {9, 1, 3, 5, 7, 2};

	        // Sort the first 4 elements (index 0 to 3)
	        Arrays.sort(array, 0, 4);

	        // Print the result
	        System.out.println(Arrays.toString(array));
	        
	        List<Integer> list= Arrays.asList(2,5,1,0,8,6,9);
	        
	       Object[] arr=list.toArray();
	       
	       Arrays.sort(arr,0,5);
	       System.out.println(Arrays.toString(arr));
	}

}
