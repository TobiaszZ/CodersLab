package a_Zadania.a_Dzien_1.d_Tablice_wielowymiarowe;

public class Main2 {

	public static void main(String[] args) {

		int[][] task2Array = { { 2, 3, 4 }, { 12, 32, 12, 11 }, { 3, 2, 1, 4, 5 }, { 5, 1, 6, 7, 8 } };
		for(int i=0; i<task2Array.length; i++)
			System.out.print(task2Array[i][0] + ", ");
		System.out.println();
		
		for(int i=0; i<task2Array.length; i++)
				System.out.println(task2Array[i].length);
		
		for(int [] sub : task2Array)
			for(int sub2: sub)
				System.out.print(sub2 + ", ");
	}

}
