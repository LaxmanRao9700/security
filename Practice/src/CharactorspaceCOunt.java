import java.util.function.Function;
import java.util.stream.Collectors;

public class CharactorspaceCOunt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "laxman";
		String s1= new String("rao");
		System.out.println(s+s1);
		
		String str="laxman rao";
		
		str.chars().filter(Character::isLetter).mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.forEach((charactor,count)->System.out.println(charactor+"->"+count));
	}

}
