import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("Ravi", "ravi", "raj", "rohan");

		list.stream().map(String::toLowerCase)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.forEach((key, value) -> System.out.println(key + "-" + value));
		System.out.println("-----------------------");
		String str = "Hands-on experience with Spring Boot, "
				+ "Spring Data JPA and Spring MVC frameworks for developing scalable and robust applications";

		str.chars().filter(c -> Character.isLetter(c)).map(c->Character.toLowerCase(c)).mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(entry -> entry.getValue() == 1).map(Map.Entry::getKey).collect(Collectors.toList())
				.forEach(System.out::println);
		
		// Split the string into words
        List<String> words = Arrays.asList(str.split("\\W+"));

        // Normalize words to lowercase for case-insensitive comparison
        words.stream()
            .map(String::toLowerCase)  // Convert each word to lowercase
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))  // Group and count occurrences
            .entrySet().stream()
            .filter(entry -> entry.getValue() == 1)  // Filter for words that appear only once
            .map(Map.Entry::getKey)  // Get the word (key)
            .forEach(System.out::println);  // Print the result
	}

}
