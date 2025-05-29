
public class SingletonLazy {
	private static SingletonLazy Instance = null;

	private SingletonLazy() {

	}

	public static SingletonLazy getInstance() {
		if (null == Instance) {
			Instance = new SingletonLazy();
		}

		return Instance;
	}

	public static void main(String[] args) {

		SingletonLazy s1 = SingletonLazy.getInstance();
		System.out.println(s1 == SingletonLazy.getInstance());
	}

}
