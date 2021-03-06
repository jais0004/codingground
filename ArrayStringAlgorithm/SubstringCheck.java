/**
 * Assume you have a method isSubstring which checks if one word is a substring
 * of another. Given two strings, s1 and s2, write code to check if s2 is a
 * rotation of s1 using only one call to isSubstring
 */
public class SubstringCheck {

	public boolean isRotateSubstring(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}

		String combineString = s1 + s2;

		return isSubstring(combineString, s2);
	}

	public static void main(String[] arg) {

		SubstringCheck sb = new SubstringCheck();

		System.out.println(sb.isRotateSubstring("waterbottle", "erbottlewat"));
	}
}