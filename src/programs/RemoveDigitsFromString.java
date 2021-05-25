package programs;

public class RemoveDigitsFromString {

	public static void main(String[] args) {
		String str = "ABC123ABC";
		System.out.println(RemoveDigit(str));

	}
	public static String RemoveDigit(String str) {
		int len = str.length();
		char[] ch = str.toCharArray();
		String res = "";
		
		for(int i=0;i<ch.length;i++) {
			if(!Character.isDigit(ch[i])) {
				res = res + ch[i];
			}
		}
		return res;
		
	}
}
