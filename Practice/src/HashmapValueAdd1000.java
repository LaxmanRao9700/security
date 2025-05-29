import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class HashmapValueAdd1000 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> map= new HashMap<>();
		map.put("A", 1000);
		map.put("B", 1500);
		map.put("C", 3000);
		map.put("D", 1600);
		
		map.entrySet().stream()
		.collect(Collectors.toMap(Map.Entry::getKey,e->e.getValue()+1000)).forEach((k,v)->System.out.println(k+":"+v));
	}

}
