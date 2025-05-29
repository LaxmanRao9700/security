

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class StringsReverse {

	public static void main(String[] args) {
		String str="This is Java Programming";
		// OP "sihT si avaJ gnimmargorP";
		
		//String str="Programming";

		String r= str
		.chars()
		.mapToObj(c->(char)c)
		.collect(Collectors.toList())
		.stream()
		.collect(Collectors.collectingAndThen(Collectors.toList(), list-> {
			Collections.reverse(list);
			return list.stream();
		}))
		.map(String::valueOf)
		.collect(Collectors.joining());
	
		System.out.println(r);
		
		System.out.println("----------------------");
		
		String reverse=Arrays.stream(str.split(" "))
				.map(word->new StringBuilder(word).reverse().toString())
				.collect(Collectors.joining(" "));
		System.out.println(reverse);
		
		
		System.out.println("----------------------");
		
		String[] words=str.split(" ");
		
		StringBuilder sb= new StringBuilder();
		for(String word:words) {
			sb.append(new StringBuilder(word).reverse().toString()).append(" ");
		}
		System.out.println(sb.toString().trim());
		
		System.out.println("----------------------");
		
		String[] wordss=str.split(" ");
		
		StringBuilder sbr= new StringBuilder();
		for(int i=0;i<words.length;i++) {
			sbr.append(new StringBuilder(wordss[i]).reverse().toString()).append(" ");
		}
		System.out.println(sbr.toString().trim());
	}

}
