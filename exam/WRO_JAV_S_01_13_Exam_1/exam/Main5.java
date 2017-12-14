package exam;

public class Main5 {
	static double ball(double r){
		double objetosc = 0;
		objetosc = (4.0/3.0) * Math.PI * Math.pow(r,3);
		return objetosc;
}
	public static void main(String[] args) {
		double r=3;
		System.out.println(ball(r));
	}
}