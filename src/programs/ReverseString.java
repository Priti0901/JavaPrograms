package programs;

public class ReverseString {

	public static void main(String[] args) {
		
		String name="java"; 
		char value[]=name.toCharArray(); 
		for(int i=value.length-1;i>=0;i--) 
		{ 
		System.out.print(value[i]); 
		} 
	}
}
