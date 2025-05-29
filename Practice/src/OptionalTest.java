import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Optional;

public class OptionalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Optional<String> optional = Optional.of("Hello");

		// Check if value is present
		optional.ifPresent(System.out::println); // Prints "Hello"

		optional = Optional.ofNullable(null);
		// OrElse method
		String result = optional.orElse("Default Value");
		System.out.println(result);
		
		// Get the current date
		LocalDate date = LocalDate.now();
		System.out.println(date); // e.g., 2025-05-06

		// Get the current time
		LocalTime time = LocalTime.now();
		System.out.println(time); // e.g., 14:30:45

		// Combine date and time
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime); // e.g., 2025-05-06T14:30:45

	}

}
