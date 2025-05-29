
public class SingletonEager {

	private final static SingletonEager Instance= new SingletonEager();
	
	private SingletonEager() {
		
	}
	
	public static SingletonEager getInstance() {
		return Instance;
	}
	
	public static void main(String[] args) {
		SingletonEager s1= SingletonEager.getInstance();
		System.out.print(s1==SingletonEager.getInstance());

	}

}
