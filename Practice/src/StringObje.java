
public class StringObje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "ABC";
		String str2 = "ABC";
		String str3 = new String("ABC");
		System.out.println(str2 == str3);
		System.out.println(str2.equals(str3));
	}

}
