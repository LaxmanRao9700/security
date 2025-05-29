
public class SingletonThreadSafeInside {
	private static SingletonThreadSafeInside Instance = null;

	private SingletonThreadSafeInside() {

	}

	public static SingletonThreadSafeInside getInstance() {
		if (null == Instance) {
			synchronized (SingletonThreadSafeInside.class) {
				Instance = new SingletonThreadSafeInside();
			}

		}

		return Instance;
	}

	public static void main(String[] args) {
		SingletonThreadSafeInside s1 = SingletonThreadSafeInside.getInstance();
		System.out.println(s1 == SingletonThreadSafeInside.getInstance());

	}

}
