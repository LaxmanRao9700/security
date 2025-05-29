

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringLetterCount {
	public static void main(String[] args) {
		String str = "LaxmanRaoDoredla";
		str
		.chars()
		.filter(Character::isLetter)
		.mapToObj(c->Character.toLowerCase((char)c))
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.forEach((letter,count)->System.out.println(letter+":"+count));
		
		System.out.println("---------------------------");
		
		str
		.chars()
		.filter(Character::isLetter)
		.mapToObj(c->Character.toLowerCase((char)c))
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet()
		.stream()
		.filter(entry->entry.getValue()>1)
		.forEach(entry->System.out.println(entry.getKey()+":"+entry.getValue()));
		
		System.out.println("---------------------------");
		
		str
		.chars()
		.filter(Character::isLetter)
		.mapToObj(c->Character.toLowerCase((char)c))
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet()
		.stream()
		.filter(entry->entry.getValue()>1)
		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue))
		.forEach((letter,count)->System.out.println(letter+":"+count));
		
		System.out.println("---------------------------");
		String result=str
		.chars()
		.filter(Character::isLetter)
		.mapToObj(c->Character.toLowerCase((char)c))
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet()
		.stream()
		.filter(entry->entry.getValue()==1)
		.map(entry->String.valueOf(entry.getKey()))
		.collect(Collectors.joining()).toString();
		System.out.println(result);
		
		
		
	}
}
