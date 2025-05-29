import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SubtractionGameSimulator {
	public static void simulate(int N, int runs) {
        int smallerWins = 0;
        int largerWins = 0;
        double midpoint = N / 2.0;
        List<Integer> finalNumbers = new ArrayList<>();

        Random rand = new Random();

        for (int i = 0; i < runs; i++) {
            List<Integer> numbers = new ArrayList<>();
            for (int j = 1; j <= N; j++) {
                numbers.add(j);
            }

            while (numbers.size() > 1) {
                int idx1 = rand.nextInt(numbers.size());
                int num1 = numbers.remove(idx1);
                int idx2 = rand.nextInt(numbers.size());
                int num2 = numbers.remove(idx2);
                int diff = Math.abs(num1 - num2);
                numbers.add(diff);
            }

            int finalNumber = numbers.get(0);
            finalNumbers.add(finalNumber);

            if (finalNumber < midpoint) {
                smallerWins++;
            } else if (finalNumber > midpoint) {
                largerWins++;
            }
        }

        // Output
        System.out.println("Final numbers from each simulation: " + finalNumbers);
        System.out.println("\nOut of " + runs + " simulations:");
        System.out.printf("Smaller numbers (< %.1f) won %d times (%.2f%%)\n",
                midpoint, smallerWins, 100.0 * smallerWins / runs);
        System.out.printf("Larger numbers (> %.1f) won %d times (%.2f%%)\n",
                midpoint, largerWins, 100.0 * largerWins / runs);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int N = 100;
	        int runs = 1000;
	        simulate(N, runs);
	}

}
