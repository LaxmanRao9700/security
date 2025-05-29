
public class StringFirstReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "java is good";
        String[] words = input.split(" ");
        
        StringBuilder sb= new StringBuilder(words[0]).reverse();
        
        System.out.print(sb+" ");
        
        for(int i=1;i<words.length;i++) {
        	System.out.print(words[i]+" ");
        }
        
        
        //avaj is good

        //java 8
        
        
	}

}
