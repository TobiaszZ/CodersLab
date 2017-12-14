package b_Zadania_Domowe.a_Dzien_3;


public class Main5 {
	static int elementExist(int[] elements, int value)throws Exception {
	int s=0;
	for(int i:elements) if (i==value) s++;
		if (s==0) throw new Exception ("xxx");
	return s;
	}
//		System.out.println("Nie ma takiego numeru");
//	}
	
	public static void main(String[] args) {
		int[] elements = {1, 2, 3};
		int value = 5;
		try {
            System.out.print (elementExist(elements , value));
        } catch(Exception e) {
            System.err.println("Nie ma takiego numeru ");




}
	}
	}
