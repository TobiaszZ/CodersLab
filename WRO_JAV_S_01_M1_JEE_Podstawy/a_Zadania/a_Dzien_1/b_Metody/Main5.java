public class Main5 {
	
	static double calculateNet (double gross, double vat) {
		return gross*1/(1+vat/100);
	}
    public static void main(String[] args) {
		System.out.println(calculateNet(11, 10));		

    }
}
