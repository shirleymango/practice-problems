import java.util.*;

//5 kyu
public class playWithTwoStrings {

	public static void main(String[] args) {
		String a = "abcdeFg"; 
		String b = "defgG"; 
		
		String aAllLow = a.toLowerCase();
		String bAllLow = b.toLowerCase();
		//finds the number of appearances of each letter in the strings
		HashMap<Character, Integer> aMap = characterCounts(aAllLow);
		HashMap<Character, Integer> bMap = characterCounts(bAllLow);
		
		String output = "";
		//switching the cases for string a
		for(int i = 0; i < a.length(); i++) {
			char c = a.charAt(i);
			if (bMap.containsKey(aAllLow.charAt(i)) && bMap.get(aAllLow.charAt(i)) % 2 == 1) {
				c = switchCase(c);
			}
			output += c;
		}
		
		//switching the cases for string b
		for(int i = 0; i < b.length(); i++) {
			char c = b.charAt(i);
			if (aMap.containsKey(bAllLow.charAt(i)) && aMap.get(bAllLow.charAt(i)) % 2 == 1) {
				c = switchCase(c);
			}
			output += c;
		}
		
		System.out.println(output);
	}
	
	//creates map,  key = character, value = # of times character appears in string
	public static HashMap<Character, Integer> characterCounts(String s) {
		HashMap<Character, Integer> output= new HashMap<Character, Integer>();
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (!output.containsKey(c)) {
				output.put(c, 1);
			}
			else {
				int newVal = output.get(c) + 1;
				output.replace(c, newVal);
			}
		}
		return output;
	}
	
	//upper case to lower case or lower case to upper case
	public static char switchCase (char c) {
		if (c < 96) {
			return (char) (c + 32);
		}
		return (char) (c - 32);
	}

}
