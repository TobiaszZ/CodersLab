
public class Main2 {
	public static void main(String[] args) {
		int nr1 = 7;
		int nr2 = 2;
		int nr3 = 11;
			 
		if(nr2 > nr3 && nr2 > nr1)
			System.out.println("Największa z liczb 7,2,11 to "+nr2);
		else if(nr1 > nr3)
			System.out.println("Największa z liczb 7,2,11 to "+nr1);
		else
			System.out.println("Największa z liczb 7,2,11 to "+nr3);
	}
}
