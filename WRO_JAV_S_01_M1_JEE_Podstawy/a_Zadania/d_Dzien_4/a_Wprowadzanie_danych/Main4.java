package a_Zadania.d_Dzien_4.a_Wprowadzanie_danych;

import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {
    	rowsColumns();

    }
    static void rowsColumns() {
    	Scanner input = new Scanner (System.in);
    	int row=0;
    	int column=0;
    	int suma=0;
    	int ile=0;
    	System.out.println("Podaj liczbę wierszy: ");
    	row=input.nextInt();
    	System.out.println("Podaj liczbę kolumn: ");
    	column=input.nextInt();
    	int[][] tab = new int [column][row];
    	for (int i=0; i<column; i++)
    		for(int j=0; j<row; j++) {
    	    	tab[i][j]=ile++;
    	    	suma+=tab[i][j];
    		}
    	System.out.println("Suma wynosi: " + suma);
    	System.out.println("Średnia wynosi: " + suma/(row+column));
    	input.close();
    }
   
}
