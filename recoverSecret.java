//5-24-2020
//4kyu

import java.util.*;
public class recoverSecret {

	public static void main(String[] args) {
		char[][] triplets = {
			      {'t','u','p'},
			      {'w','h','i'},
			      {'t','s','u'},
			      {'a','t','s'},
			      {'h','a','p'},
			      {'t','i','s'},
			      {'w','h','s'}
			    };
		
		//reading the input
		HashMap<Character, ArrayList<Character>>  before = new HashMap<Character, ArrayList<Character>>();//letters that come before
		HashMap<Character, ArrayList<Character>>  after = new HashMap<Character, ArrayList<Character>>();//letters that come after
		
		for (char[] triplet: triplets) {
			//updating for first letter
			if (!before.containsKey(triplet[0])) {
				ArrayList<Character> temp1 = new ArrayList<Character>();
				before.put(triplet[0], temp1);
				ArrayList<Character> temp2 = new ArrayList<Character>();
				temp2.add(triplet[1]); temp2.add(triplet[2]);
				after.put(triplet[0], temp2);
			}
			else {
				ArrayList<Character> temp = after.get(triplet[0]);
				for(int i = 1; i <= 2; i++) {
					if (!temp.contains(triplet[i])) {
						temp.add(triplet[i]);
					}
				}
				after.replace(triplet[0], temp);
			}
			
			//updating for second letter
			if (!before.containsKey(triplet[1])) {
				ArrayList<Character> temp1 = new ArrayList<Character>();
				temp1.add(triplet[0]);
				before.put(triplet[1], temp1);
				ArrayList<Character> temp2 = new ArrayList<Character>();
				temp2.add(triplet[2]);
				after.put(triplet[1], temp2);
			}
			else {
				ArrayList<Character> temp1 = after.get(triplet[1]);
				if (!temp1.contains(triplet[2])) {
					temp1.add(triplet[2]);
				}
				after.replace(triplet[1], temp1);
				ArrayList<Character> temp2 = before.get(triplet[1]);
				if (!temp2.contains(triplet[0])) {
					temp2.add(triplet[0]);
				}
				before.replace(triplet[1], temp2);
			}
			
			//updating for third letter
			if (!before.containsKey(triplet[2])) {
				ArrayList<Character> temp1 = new ArrayList<Character>();
				temp1.add(triplet[0]); temp1.add(triplet[1]);
				before.put(triplet[2], temp1);
				ArrayList<Character> temp2 = new ArrayList<Character>();
				after.put(triplet[2], temp2);
			}
			else {
				ArrayList<Character> temp = before.get(triplet[2]);
				for(int i = 0; i <= 1; i++) {
					if (!temp.contains(triplet[i])) {
						temp.add(triplet[i]);
					}
				}
				before.replace(triplet[2], temp);
			}
		}
		
		String output = "";
		char current = 'a';
		//put together the secret string
		Set<Map.Entry<Character, ArrayList<Character>>> set = before.entrySet();
		
		//finding the first character
		for(Map.Entry<Character, ArrayList<Character>> entry : set) {
			if (entry.getValue().size() == 0) {
				output += entry.getKey();
				current = entry.getKey();
			}
		}
		
		while(output.length() < before.size()) {
			boolean isNext = true;
			for (char c: after.get(current)) {
				for (char beforeC: before.get(c)) {
					if (output.indexOf(beforeC) < 0) {
						isNext = false;
						break;
					}
				}
				if (isNext) {
					output += c;
					current = c;
					break;
				}
				isNext = true;
			}
		}
		
		System.out.println(output);
	}

}
