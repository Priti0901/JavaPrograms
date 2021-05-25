package programs;
/**
 * Check substring is present in a given strings
 * @author priti
 *
 */
public class FindSubString {
	public static boolean isSubstring(String main,String sub) {
		return main.matches("(.*)" +sub +"(.*)");
		
	}
	public static boolean isSubstring1(String main,String sub) {
		return main.contains(sub);
		
	}
	public static boolean isSubstring2(String main,String sub) {
		return main.indexOf(sub)!=-1;
		
	}
	public static void main(String[] args) {
		
		System.out.println(isSubstring1("automation testing for qa","qa"));
		System.out.println(isSubstring2("automation testing for qa","automation"));
		System.out.println(isSubstring("automation testing for qa","test"));
		System.out.println(isSubstring("automation testing for qa","what"));
		System.out.println(isSubstring("automation testing for qa","auto"));
		System.out.println(isSubstring("automation testing for qa","qa"));
		System.out.println(isSubstring("automation testing for qa",null));
		System.out.println(isSubstring("automation testing for qa"," "));
		System.out.println(isSubstring("automation testing for qa"," "));
		
	}

}
