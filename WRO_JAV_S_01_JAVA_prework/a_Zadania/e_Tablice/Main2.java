
public class Main2 {
	public static void main(String[] args) {
		String[] friuts = new String[4];
			friuts[0]="Truskawka"; 
			friuts[1]="Banan";
			friuts[2]="Gruszka";
			friuts[3]="Malina";
		System.out.println("Pierwszy owoc to: " +friuts[0]);
		
//		for (int i = 3; i < friuts.length; i++) {
//			System.out.println("Ostatni owoc to: " +friuts[i]);
//			}
		
		System.out.println("Ostatni owoc to: " +friuts[friuts.length - 1]);
		
		for (int i = 0; i < friuts.length; i++) {
			System.out.println(friuts[i]);
			}
	
		
	
}
}