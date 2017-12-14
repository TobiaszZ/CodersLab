package exam;

public class Main7 {
	static int countNumbers(String str){
		int sum = 0;
			
		for(String word : str.split(" ")){
				
		try {
			int i = Integer.parseInt(word);
			sum += i;
			} catch (Exception e) {
			}
			}
			
			return sum;
		}
	
	public static void main(String[] args) {
		String str = "Wynik dodawania 1 i 2 to 5 zwróci 6.";
		System.out.println(countNumbers(str));
	}
}
