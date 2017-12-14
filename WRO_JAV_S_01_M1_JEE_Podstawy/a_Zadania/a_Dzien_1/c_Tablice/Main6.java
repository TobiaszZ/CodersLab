package a_Zadania.a_Dzien_1.c_Tablice;

import java.util.Arrays;

public class Main6 {

    public static void main(String[] args) {
int[] numbers = {2, 3, 5, 6, 7, 12, 12, 32, 32, 77};
int[] secondNumbers = {2, 4, 8, 9, 23, 5, 7, 76, 88, 90};
int [] suma = new int [10];
for (int i=0; i<10; i++) suma[i]=numbers[i]+secondNumbers[i];
System.out.println(Arrays.toString(suma));
    }
}
