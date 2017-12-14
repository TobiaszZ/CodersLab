
public class Main4 {
	public static void main(String[] args) {
		int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int parzyste = 0;
		int oddNum = 0;
		for (int i=0; i < numbers.length; i++) {
			parzyste = numbers[ i ] %2;
			if (parzyste == 0) {
			System.out.println("parzyste = " + numbers[i]);
		
			} else {
				oddNum += numbers[i];
			}
		}
		
		System.out.println("nieparzyste suma = " + oddNum);
	}

}