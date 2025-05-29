
import java.util.Arrays;
import java.util.stream.Collectors;

public class StringFirstReverseJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "java is good";
        String[] words = input.split(" ");
        
        String output= Arrays.stream(words).map(word->words[0].equals(word)? new StringBuilder(word).reverse().toString():word)
        .collect(Collectors.joining(" "));
        System.out.println(output);
	}

	//avaj is good

}
