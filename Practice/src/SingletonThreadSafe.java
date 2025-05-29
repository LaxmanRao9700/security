
public class SingletonThreadSafe {
	private static SingletonThreadSafe Instance = null;

	private SingletonThreadSafe() {

	}

	public static synchronized SingletonThreadSafe getInstance() {
		if (null == Instance) {
			Instance = new SingletonThreadSafe();
		}

		return Instance;
	}
	public static void main(String[] args) {
		
		SingletonThreadSafe s1 = SingletonThreadSafe.getInstance();
		System.out.println(s1 == SingletonThreadSafe.getInstance());
	}

}
