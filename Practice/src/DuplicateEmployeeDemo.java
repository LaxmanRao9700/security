

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateEmployeeDemo {
	private int id;
    private String name;

    public DuplicateEmployeeDemo(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        DuplicateEmployeeDemo that = (DuplicateEmployeeDemo) obj;
        return id == that.id && Objects.equals(name, that.name);
    }

    // Properly overridden hashCode() method
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }


    @Override
    public String toString() {
        return "DuplicateEmployeeDemo{id=" + id + ", name='" + name + "'}";
    }



    public static void main(String[] args) {
        List<DuplicateEmployeeDemo> list = Arrays.asList(
                new DuplicateEmployeeDemo(101, "Laxman"),
                new DuplicateEmployeeDemo(102, "Laxman Rao"),
                new DuplicateEmployeeDemo(101, "Laxman")
        );

        list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));
    }
}
