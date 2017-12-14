package a_Zadania.a_Dzien_1.c_Tablice;

public class Main4 {

    public static void main(String[] args) {
		int [] numbers = {1 ,2, 3, 4, 5, 6, 7, 8, 9, 10};
		int [] reverse = new int [10];
		for (int i=0; i<10; i++) {
			reverse[i]=numbers[10-(i+1)];
			System.out.println(reverse[i]);
		}
    }
}
