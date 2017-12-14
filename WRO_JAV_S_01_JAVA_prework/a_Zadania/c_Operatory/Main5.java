public class Main5 {

	public static void main(String[] args) {
		int a=1, b;
		System.out.println(++a); //Wartość zostanie zwiększona przed - 2
		System.out.println(a++); //Wartość zostanie zwiększona dopiero po - 2
		System.out.println(a); // Wyswietlenie - 3
		b=a++; //Wartość zostanie zwiększona dopiero po -3
		System.out.println(b); // Wyświetlenie - 4
		b=++a; //Wartość zostanie zwiększona przed - 5
		System.out.println(++a); //Wartość zostanie zwiększona przed - 6
}
}