//Problem: Next smaller number with the same digits
//kyu: 4

import java.util.ArrayList;
import java.util.Collections;

public class nextSmaller {

	public static void main(String[] args) {
		long n = 414L;
		System.out.println(nextSmaller(n));
	}
	
	public static long nextSmaller(long n)
	{
		boolean smallest = true; // already smallest possible number with the given digits
		
		//convert long into string
		String number = Long.toString(n); 
		String answer = "";
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = number.length() - 1; i > 0; i--) {
			list.add((int) number.charAt(i) - 48);
			if (number.charAt(i) < number.charAt(i - 1)) {
				//replace the number at index i-1 and the next smallest number with an index greater than i-1
				int toBeReplaced = number.charAt(i - 1) - 48;
				Collections.sort(list);
				
				//find the next smallest number to be the replacer
				int j = list.size()-1;
				while (list.get(j) >= toBeReplaced) {
					j--;
				}
				int replacer = list.get(j);
				list.remove(j);
				list.add(toBeReplaced);
				Collections.sort(list);
				
				//replace the toBeReplaced with the replacer
				answer = number.substring(0, i-1) + (char) (replacer + 48);
				
				//add all the other digits from greatest to least
				for (int k = list.size() - 1; k >= 0; k--) {
					answer += (char) (list.get(k) + 48);
				}
				
				smallest = false;
				break;
			}
		}
		
		if (smallest) {
			return -1;
		}
		if (answer.charAt(0) == '0') {
			return -1;
		}
		return Long.parseLong(answer);
	}

}
