package basicJava;

public class RemoveDuplicateFromString {
	
	
	public static void main(String[] args) {
		
		
		//Using Java8
		
		String str = "pawannkkumarr";
		
		StringBuilder sb = new StringBuilder();
		
		
		  str.chars().distinct().forEach(x->sb.append((char)x));
		  
		   System.out.println(sb);
	}

}
