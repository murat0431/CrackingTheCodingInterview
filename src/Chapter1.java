import java.util.Set;
import java.util.TreeSet;

public class Chapter1 {
	public static void main(String[] args) {
		System.out.println(isUnique2("aca"));
		System.out.println(isPermutation("abb", "bba"));
		System.out.println(stringComp("aabcccccaaa"));
		
	}
	
	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Element at the index " + i + " is: " + arr[i]);
		}
	}
	
	/**
	 * Ch1 Q1
	 * @param s
	 * @return
	 */
	public static boolean isUnique(String s) {
		Set<Character> mySet = new TreeSet<Character>(); 
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(mySet.contains(c)) {
				return false;
			}
			mySet.add(c);
		}
		return true;
	}
	/**
	 * Ch1 Q1
	 * @param s
	 * @return
	 */
	public static boolean isUnique2(String s) {
		int checker = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int ref = c - 'a';
			if ((checker & (1 << ref)) > 0) {
				return false;
			}
			checker |= (1 << ref);
		}
		return true;
	}
	
	/**
	 * Ch1 Q2
	 * @param s1
	 * @param s2
	 * @return
	 */
	public static boolean isPermutation(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false; 
		}
		//Assume it is ASCII
		int[] arr = new int[128];
		for (int i = 0; i < s1.length(); i++) {
			arr[s1.charAt(i)]++;
		}
		for (int i = 0; i < s2.length(); i++) {
			char c = s2.charAt(i);
			arr[c]--;
			if (arr[c] < 0) {
				return false;
			}
		}
		return true;
		
	}
	/**
	 * Ch1 Q3
	 * @param s
	 * @param size
	 * @return
	 */
	public static String urlify(String s, int size) {
		char[] ch = s.toCharArray();
		String urlConsant = "%20";
		for (int i = 0; i < size; i++) {
			if (ch[i] == ' ') {
				
			}
		}
		return "";
	}
	/**
	 * Ch1 Q6
	 */
	public static String stringComp(String s) {
		StringBuilder myString = new StringBuilder();
		int sum = 1;
		for (int i = 0; i < s.length(); i++) {
			char current = s.charAt(i);
			if (i != s.length()-1 && current == s.charAt(i+1)) {
				sum++;
			} else {
				myString.append(current).append(sum);
				sum = 1;
				
			}
		}
		return myString.length() < s.length() ? myString.toString():s;
	}
}