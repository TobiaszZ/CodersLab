
public class Main3 {
	public static void main(String[] args) {
		int nr1 = 5;
		double nr2 = 6.5;
		double result = 0; //Type mismatch: cannot convert from double to int. Wynik otrzymanego działania jest również z liczba za przecinkiem.
		result = nr1 + nr2;
		System.out.println(result);
	}
}
