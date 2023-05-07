package stringoperations;

/*
 * For two strings s and t, we say "t divides s" if and only if s = t + ... + t (i.e., t is concatenated with itself one or more times).

Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.
 */
public class GreatestCommonDivisorOfStrings {
	public static void main(String[] args) {
		System.out.println(gcdOfStrings("ABCABC", "ABC"));
		System.out.println(gcdOfStrings("ABABAB", "ABAB"));
		System.out.println(gcdOfStrings("LEET", "CODE"));

	}

	public static String gcdOfStrings(String str1, String str2) {

		int len1 = str1.length();
		int len2 = str2.length();
		if (!(str1 + str2).equals(str2 + str1))
			return "";
		int gcdLength = gcd(len1, len2);
		return str1.substring(0, gcdLength);
	}

	static int gcd(int a, int b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}

}
