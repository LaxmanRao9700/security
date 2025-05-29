

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringLastReverseJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "java is good technology";

		// Reverse the order of words
		String result = Arrays.stream(input.split(" "))
				.collect(Collectors.collectingAndThen(Collectors.toList(), list -> {
					java.util.Collections.reverse(list);
					return list.stream();
				})).map(String::new).collect(Collectors.joining(" "));

		System.out.println(result);

		String[] words = result.split(" ");

		/*
		 * StringBuilder sb= new StringBuilder(words[0]).reverse();
		 * 
		 * System.out.print(sb+" ");
		 * 
		 * for(int i=1;i<words.length;i++) { System.out.print(words[i]+" "); }
		 */

		String output = Arrays.stream(words)
				.map(word -> words[0].equals(word) ? new StringBuilder(word).reverse().toString() : word)
				.collect(Collectors.joining(" "));

		System.out.println(output.toString());
		
		String reverse=Arrays.stream(result.split(" "))
				.map(word->new StringBuilder(word).reverse().toString())
				.collect(Collectors.joining(" "));
		System.out.println(reverse);

	}

}
