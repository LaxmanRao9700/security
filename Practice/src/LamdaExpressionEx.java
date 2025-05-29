
@FunctionalInterface
interface Addition {
    int add(int a, int b);
}
public class LamdaExpressionEx {
public static void main(String[] args) {
	Addition a= (x,y)->{
		System.out.println("Addition:"+(x+y));
		return x+y;
	};
	int i= a.add(10, 20);
	System.out.println(i);
}
}
