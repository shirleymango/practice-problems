//4 kyu
//5-23-2020

public class rectangleRotation {

	public static void main(String[] args) {
		
		final int a = 16; 
		final int b = 20;
		
		int horizontal1 = 2 * (int) ((b/2)/Math.sqrt(2)) + 1;
		int horizontal2 = 2 * (int) ((b/2 - Math.sqrt(2)/2)/Math.sqrt(2)) + 2;
		
		int vertical1 = 2 * (int) ((a/2)/Math.sqrt(2)) + 1;
		int vertical2 = 2 * (int) ((a/2 - Math.sqrt(2)/2)/Math.sqrt(2)) + 2;
		
		System.out.println(horizontal1*vertical1 + horizontal2*vertical2);
		
	}

}
