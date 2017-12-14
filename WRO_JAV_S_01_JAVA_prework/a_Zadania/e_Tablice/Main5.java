
public class Main5 {
	public static void main(String[] args) {
		int[] numbers = new int[]{-1, -2, -3, -4, -5, -6, -7, -8, -9, -10};
		int max = 0;
		for (int i=1; i<numbers.length; i++) {
		if (max < numbers[i]) {
		max = numbers[i];
		}
		}
		
		System.out.println("Najwiekszy element w tablicy to " + max);
}
}