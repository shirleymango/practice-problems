//Problem: Josephus' Permutation
//5 kyu
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class josephusPermutation {

	public static void main(String[] args) {
		ArrayList<Integer> items = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		int k = 2;
		
		System.out.println(josephusPermutation(items, k));
	}
	
	public static <T> List<T> josephusPermutation(final List<T> items, final int k) {
		  
	    ArrayList<T> output = new ArrayList<T>();
			int i = -1; int s = items.size();
			while (output.size() < s)  {
				//exiting the loop when only one item is left
				if (items.size() == 1) {
					output.add(items.get(0));
					items.remove(0);
					break;
				}
				//mod to get a smaller k to work with
				int kTemp = k;
				if (k > items.size()) {
					kTemp = k  % items.size();
				}
				//edge case: when k % items.size() == 0
				if (kTemp == 0) {
					if (i == -1) {
						i = items.size() - 1;
					}
				}
				else {
					//overlap
					if (i + kTemp > items.size() - 1) {
						i = i + kTemp - 1 - items.size() + 1;
					}
					//not overlap
					else {
						i += kTemp;
					}
				}
				
				output.add(items.get(i));
				items.remove(i);
				i--;
			}
			return output;
	  
	  }

}
