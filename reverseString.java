package pratice;

public class reverseString {
	public static void main(String[] args) {
		String str = "hello";
		
		for(int i=str.length()-1; i>=0; i--) {
			String reverse = "";
			reverse = reverse +str.charAt(i);
			
		
		
		System.out.print(reverse);
		}
	}
	
}


//one of many ways for reversing a string 
