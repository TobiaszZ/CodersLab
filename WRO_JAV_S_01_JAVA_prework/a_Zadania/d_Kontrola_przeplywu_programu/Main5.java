
public class Main5 {
	public static void main(String[] args) {
		int resultFor = 0;
		int resultWhile = 0;
		
		int i = 1;
		while(i <= 10){
			resultWhile += i;
			i++;
		}
		System.out.println(resultWhile);
	
	
		for (i = 1; i<=10; i++){
			resultFor = resultFor+i;
		}
		System.out.println(resultFor); 
	}
}
