

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class IntegerDuplicateCount {

	public static void main(String[] args) {
		

		int[] nums = {5, 4, 3, 6, 7, 8, 2, 9, 3, 6, 4, 8, 12, 8, 2, 7};

		// Step 1
		List<Integer> intList = Arrays.stream(nums).boxed().collect(Collectors.toList());
		
		

		// Step 2
		intList.stream()
		       .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		       .entrySet().stream()
		       .filter(entry -> entry.getValue() > 1)
		       .forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
		
		
		Map<Integer, Integer> map= new HashMap();
		   
		   for(Integer item: intList){
		   map.put(item, map.getOrDefault(item,0)+1);
		   }
		   
		   for(Map.Entry<Integer, Integer> entry:map.entrySet()){
			   if(entry.getValue()>1) {
		   System.out.println(entry.getKey()+":"+entry.getValue());
			   }
		   }

	}

}
