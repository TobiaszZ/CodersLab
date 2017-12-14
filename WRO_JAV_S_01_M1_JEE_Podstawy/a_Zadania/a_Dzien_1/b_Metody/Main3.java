public class Main3 {
	static double convertToUsd (double zlotys) {
		double usd=zlotys/4.04;
		return usd;
	}
    public static void main(String[] args) {
		System.out.println(convertToUsd(4.04));	

    }
}
