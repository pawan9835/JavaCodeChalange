package basicJava;

public class ReplaceSpecialCharectors {
	
	
	public static void main(String[] args) {
		
		
		  String str = "hiPawan@*#kumar$$&@@";
		  
		  
		 String strResult = str.replaceAll("[^a-zA-Z0-9]","");
		 
		 
		 System.out.println(strResult);
	}

}
