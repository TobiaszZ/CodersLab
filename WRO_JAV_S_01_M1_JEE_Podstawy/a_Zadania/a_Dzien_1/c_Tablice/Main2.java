package a_Zadania.a_Dzien_1.c_Tablice;

import java.util.Arrays;
import java.util.Random;

public class Main2 {
	
	static int minArray(int [] tab) {
		Arrays.sort(tab);
		return tab[0];
	}
    public static void main(String[] args) {
        int [] arr = new int [20];
        for(int i=0; i<20; i++) {
			Random r = new Random(); 
			arr[i] = r.nextInt(101);
		}
		System.out.println(minArray(arr));
    }
}
