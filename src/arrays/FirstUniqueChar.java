package arrays;
import java.util.HashMap;


public class FirstUniqueChar {
	public char firstUniqueChar(String s){
		char res = ' ';
		if (s == null || s.length() == 0)
			return res;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(!map.containsKey(c)) {
				map.put(c, 1);
			}
			else {
				map.put(c, map.get(c) + 1);
			}
		}
		for (int i = 0; i < s.length(); i++) {
			char cur = s.charAt(i);
			if (map.get(cur) == 1) {
				res = cur;
				break;
			}
		}
		return res;
	}
	
	public static void main(String[] agrs) {
		String s = "abac";
		FirstUniqueChar obj = new FirstUniqueChar();
		System.out.println(obj.firstUniqueChar(s));
		
	}
}
