import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListToStringInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List list= new ArrayList<>();
		list.add(20);
		list.add(15);
		list.add("Laxman");
		list.add("Ram");
		list.add("Satish");
		
		List<String> values=(List<String>) list.stream().filter(e->e instanceof String).map(e->(String) e).collect(Collectors.toList());
		List<Integer> valuess=(List<Integer>) list.stream().filter(e->e instanceof Integer).map(e->(Integer) e).collect(Collectors.toList());
		
		System.out.println(values);
		System.out.println(valuess);
		//1,3,4,5
		//2,6
		
		int[] arr1 = {1,3,4,5};
		int[] arr2= {2,6};
		
		Stream.concat(Arrays.stream(arr1).boxed(), Arrays.stream(arr2).boxed()).sorted().collect(Collectors.toList())
		.forEach(System.out::println);
		
		
		 list.stream()
         .filter(s -> !isNumeric( s))
         .forEach(System.out::println);
		
		
	}

	private static boolean isNumeric(Object s) {
		// TODO Auto-generated method stub
		return  s != null && ((String) s).matches("\\d+");
	}

}
