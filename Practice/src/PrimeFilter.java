import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrimeFilter {

	

		 public static void main(String[] args) {
		        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 17, 20);

		        list.stream()
		            .filter(PrimeFilter::isPrime)
		            .collect(Collectors.toList())
		            .forEach(System.out::println);
		    }

		    public static boolean isPrime(Integer n) {
		        if (n <= 1) return false;
		        if (n == 2) return true;
		        if (n % 2 == 0) return false;
		        for (int i = 3; i <= Math.sqrt(n); i =i+ 2) {
		            if (n % i == 0) return false;
		        }
		        return true;
		    }

}
