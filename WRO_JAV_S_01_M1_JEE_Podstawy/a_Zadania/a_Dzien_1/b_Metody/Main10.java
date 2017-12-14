public class Main10 {
	
	static String footballWin (int AA, int BA, int AB, int BB) {
		String winner;	
		if (AA+AB>BA+BB) winner="1";
		else if (AA+AB<BA+BB) winner="2";
		else {
			if(AB>BA) winner="1";
			else if(AB<BA) winner="2";
			else winner="x";
			}
		return winner;
	}
    public static void main(String[] args) {
      System.out.println(footballWin(2,3,4,2));  

    }
}
