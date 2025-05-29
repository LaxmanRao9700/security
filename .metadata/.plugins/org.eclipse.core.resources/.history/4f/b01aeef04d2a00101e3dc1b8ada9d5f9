import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EvenOddMerge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int[] even = {2, 4, 6};
	        int[] odd = {1, 3, 5};

	        List<Integer> list1 = Arrays.stream(even).boxed().collect(Collectors.toList());
	        List<Integer> list2 = Arrays.stream(odd).boxed().collect(Collectors.toList());
	        
	        Stream.concat(list1.stream(), list2.stream())
	        .sorted().forEach(System.out::println);
	}

}
